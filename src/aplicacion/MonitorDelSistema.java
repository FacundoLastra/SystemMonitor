package aplicacion;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import monitor.HardDisk;
import monitor.ICPU;
import monitor.IMemoria;
import monitor.IMother;
import monitor.INetworking;
import monitor.IStoreDiskWork;
import monitor.linux.LinuxMonitor;
import monitor.mac.MacMonitor;
import monitor.windows.WindowsMonitor;
import monitor.Monitor;
import monitor.NIC;
import monitor.iSensor;
import oshi.SystemInfo;
import persistencia.ArchivoJSON;
import ui.Home;

/**
 *
 * @author edwin
 */
public class MonitorDelSistema {
    
    
    private static void mostrarDatosMonitor(Monitor a,int time) throws InterruptedException
    {
        ///datos de cpu
        ICPU cpu=a.getCpuMonitor();
        System.out.println("Mostrando Informacion de su :::CPU:::");
        String bits=cpu.esDe64Bits()?"64":"32";
        System.out.println("Su procesador es de: "+bits+" bits");
        System.out.println("Fabricante: "+cpu.getFabricante());
        System.out.println("Familia: "+cpu.getFamily());
        System.out.println("Frecuencia de la CPU: "+cpu.getVelocidadCPU()+" Hz");
        System.out.println("Procesadores Fisicos: "+cpu.getNucleos());
        System.out.println("Procesadores Logicos: "+cpu.getHilos());
        System.out.println("Uso de la Cpu: "+String.format("%.2f", cpu.getUsoActualCPU()));
        
        ///datos de memoria
        IMemoria mem=a.getMemMonitor();
        System.out.println("Mostrando Informacion de su :::MEMORIA:::");
      
        System.out.println("memoria RAM total: "+mem.getMemFisicaTotal()+" Mb");
        
        System.out.println("memoria Swap total: "+mem.getMemSwapTotal()+" Mb");
        System.out.println("!MEMORIA EN USO!");
        System.out.println("memoria ram en uso: "+mem.getMemFisicaEnUso()+" Mb");
        System.out.println("memoria swap en uso: "+mem.getMemSwapEnUso()+ " Mb");
        
        ///datos de mother
        
        IMother info=a.getMotherMonitor();
        
        System.out.println("Mostrando Info de su :::MOTHERBOARD:::");
        System.out.println("Marca: "+info.getMarcaMother());
        System.out.println("Modelo: "+info.getModeloMother());
        
        ///datos de nic
        
        INetworking network=a.getNicMonitor();
        ArrayList<NIC> nics=network.getNics();
        System.out.println("Mostrando Info de sus NICS");
        for(NIC z : nics)
        {
            
            System.out.println("Nombre: "+z.getNombre());
            System.out.println("IP: "+Arrays.toString(z.getIPv4()));
            System.out.println("Mac: "+z.getMACAddress());
            
        }
        
        ///datos de hardDisk
        
        IStoreDiskWork mdisk=a.getDiskMonitor();
        ArrayList<HardDisk> disks =mdisk.getDisks();
        for(HardDisk disco:disks)
        {
            System.out.println("Mostrando Discos");
            System.out.println("Modelo: "+ disco);
            System.out.println("Nombre: "+ disco.getName());
            System.out.println("Serial: "+disco.getSerial());
            System.out.println("Tamaño: "+disco.getSize());
            System.out.println("TransferTime: "+disco.getTransferTime());
        }
        
        ///actualizar datos en tiempo real de sensores
        iSensor sens=a.getSensMonitor();
        
        /*
        Timer t = new Timer();
        t.schedule(new TimerTask() {
        @Override
        public void run() {
            System.out.println("\n");
            System.out.println("Temp de Cpu : "+sens.getTempCPU()+"°C");
            System.out.println("Uso de la Cpu: "+String.format("%.2f", cpu.getUsoActualCPU()));
            System.out.println("\n");
            System.out.println("memoria ram en uso: "+mem.getMemFisicaEnUso()+" Mb");
            System.out.println("memoria swap en uso: "+mem.getMemSwapEnUso()+ " Mb");
        }
        }, 1000, time);
        */
        
        while(true)
        {
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("Mostrando datos en tiempo real:");
            System.out.println("Temp de Cpu : "+sens.getTempCPU()+"°C");
            System.out.println("Uso de la Cpu: "+String.format("%.2f", cpu.getUsoActualCPU()));
            System.out.println("\n");
            System.out.println("memoria ram en uso: "+mem.getMemFisicaEnUso()+" Mb");
            System.out.println("memoria swap en uso: "+mem.getMemSwapEnUso()+ " Mb");
            Thread.sleep(time);
        }

        
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException, Exception {
        
        /*
        Aquí preparo un hashmap con los argumentos de entrada de la aplicación
        */
        HashMap<String, String> argumentos = new HashMap<>();
        //A cada string parámetro lo divido en el igual y uso el miembro de la 
        //izquierda como clave y al de la derecha como valor en el hashmap
        //no supe como usar los args del main, asi q lo puse parametros a mano al hashMap
        argumentos.put("gui", "false"); //por defecto, inicia la consola, para esto se pone gui en false
        int refresco=3000; ///se actualizan los datos cada 3 segundos
        
       
        for(String a : args){
            String[] partesArgumento = a.split("="); //Divido el string en el '='
            argumentos.put(partesArgumento[0], partesArgumento[1]); //Pongo clave y valor en el map
        }
        
        /*
        Aquí determino haciendo uso de un enum provisto en OSHI
        el sistema operativo actual
        */
        
        Home ventanaHome = null;
        int valor_so;
        Monitor monitorMain;
        // Entro en un switch con el resultado de getCurrentPlatformEnum()
        switch (SystemInfo.getCurrentPlatformEnum()) {
            //Armo los casos para cada OS
            case LINUX:
                System.out.println("Usted tiene Linux instalado");
                monitorMain=new LinuxMonitor();
                ventanaHome = construirHome(monitorMain);
                break;
            case MACOSX:
                System.out.println("Usted tiene MacOSX instalado.");
                monitorMain=new MacMonitor();
                ventanaHome = construirHome(monitorMain);
                break;
            case WINDOWS:
                System.out.println("Usted tiene Windows instalado");
                monitorMain=new WindowsMonitor();
                ventanaHome = construirHome(monitorMain);
                break;
            default:
                throw new Exception("Su sistema operativo aún no está soportado");
        }
        
        /*
        Aquí, si se provee el parámetro gui muestro la interfaz de usuario
        */
        
        if(argumentos.get("gui").equals("true")){
            // ventanaHome = construirHome(new MacMonitor());
            ventanaHome.setVisible(true);
            while (true) {
                /*
                Aquí se muestra una ventana de ejemplo. Se actualizan los datos 
                en función de la frecuencia de actualización establecida por el 
                jslider.
                */
                ventanaHome.actualizarDatosSensorYCarga();
                
                // Esta es la manera de poner el hilo actual en pausa
                // por el tiempo que se necesite en milisegundos
                Thread.sleep(ventanaHome.getFrecuenciaActualizacion());
            }
        }else
        {
            if(monitorMain!=null)
            {
                ArchivoJSON archi=new ArchivoJSON();
                archi.escribir(monitorMain.toJSON());
                MonitorDelSistema.mostrarDatosMonitor(monitorMain, refresco);
            }
            
        }
        
    }
    
    /**
     * Construye una instancia de Home y setea algunos atributos
     * @param monitor
     * @return 
     */
    private static Home construirHome(Monitor monitor) {
        Home home = new Home(monitor);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(800, 600);
        return home;
    }
}

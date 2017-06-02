/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import monitor.mac.Macmonitor;
import java.util.ArrayList;
import java.util.Arrays;
import monitor.*;

/**
 *
 * @author tomasmoran
 */

public class Test_infoMAC {
    
    Monitor mac;
    
    public Test_infoMAC(){
        this.mac=new Macmonitor();
    }
    
    private void muestraDatosCPU(){
        ICPU cpu=this.mac.getCpuMonitor();
        System.out.println("Mostrando Informacion de su :::CPU:::");
        String bits=cpu.esDe64Bits()?"64":"32";
        System.out.println("Su procesador es de:"+bits+" bits.");
        System.out.println("Fabricante: "+cpu.getFabricante());
        System.out.println("Familia: "+cpu.getFamily());
        System.out.println("Frecuencia de la CPU: "+cpu.getVelocidadCPU()+" Hz");
        System.out.println("Procesadores Fisicos: "+cpu.getNucleos());
        System.out.println("Procesadores Logicos: "+cpu.getHilos());
        System.out.println("Uso de la Cpu: "+String.format("%.2f", cpu.getUsoActualCPU()));
        
    }
    
    private void mostrarDatosMemoria()
    {
        IMemoria mem=this.mac.getMemMonitor();
        System.out.println("Mostrando Informacion de su :::MEMORIA:::");
      
        System.out.println("memoria RAM total: "+mem.getMemFisicaTotal()+" Mb");
        
        System.out.println("memoria Swap total: "+mem.getMemSwapTotal()+" Mb");
        System.out.println("!MEMORIA EN USO!");
        System.out.println("memoria ram en uso: "+mem.getMemFisicaEnUso()+" Mb");
        System.out.println("memoria swap en uso: "+mem.getMemSwapEnUso()+ " Mb");
    }
    private void mostrarDatosMother()
    {
        IMother info=this.mac.getMotherMonitor();
        
        System.out.println("Mostrando Info de su :::MOTHERBOARD:::");
        System.out.println("Marca: "+info.getMarcaMother());
        System.out.println("Modelo: "+info.getModeloMother());
    }
    private void mostrarDatosNIC()
    {
        INetworking info=this.mac.getNicMonitor();
        ArrayList<NIC> nics=info.getNics();
        System.out.println("Mostrando Info de sus NICS");
        for(NIC a : nics)
        {
            
            System.out.println("Nombre: "+a.getNombre());
            System.out.println("IP: "+Arrays.toString(a.getIPv4()));
            System.out.println("Mac: "+a.getMACAddress());
            
        }
        
    }
    private void mostrarDatosSensores()
    {
        iSensor info=this.mac.getSensMonitor();
        System.out.println("Mostrando Informacion de Temperaturas");
        System.out.println("Temp CPU: "+info.getTempCPU());
        System.out.println("Voltaje CPU: "+info.getVoltajeCPU());
        System.out.println("Velocidad Ventiladores"+Arrays.toString(info.getVelVentiladores()));
    }
            
    public static void main(String [] args)
    {
        Test_infoMAC info=new Test_infoMAC();
        
        info.muestraDatosCPU();
        info.mostrarDatosMemoria();
        info.mostrarDatosMother();
        info.mostrarDatosNIC();
        info.mostrarDatosSensores();
        
    }
    
    
}

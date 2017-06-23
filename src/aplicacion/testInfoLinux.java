/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.io.IOException;
import monitor.linux.LinuxMonitor;
import java.util.ArrayList;
import java.util.Arrays;
import monitor.*;
import persistencia.ArchivoJSON;


/**
 *
 * @author skydoo
 */
public  class testInfoLinux {
    
    Monitor monitorLinux;
    
    public testInfoLinux()
    {
        this.monitorLinux=new LinuxMonitor();
    }
    
    private void mostrarDatosCpu()
    {
        ICPU cpu=this.monitorLinux.getCpuMonitor();
        System.out.println("Mostrando Informacion de su :::CPU:::");
        String bits=cpu.esDe64Bits()?"64":"32";
        System.out.println("Su procesador es de: "+bits+" bits");
        System.out.println("Fabricante: "+cpu.getFabricante());
        System.out.println("Familia: "+cpu.getFamily());
        System.out.println("Frecuencia de la CPU: "+cpu.getVelocidadCPU()+" Hz");
        System.out.println("Procesadores Fisicos: "+cpu.getNucleos());
        System.out.println("Procesadores Logicos: "+cpu.getHilos());
        System.out.println("Uso de la Cpu: "+String.format("%.2f", cpu.getUsoActualCPU()));
    }
    private void mostrarDatosMemoria()
    {
        IMemoria mem=this.monitorLinux.getMemMonitor();
        System.out.println("Mostrando Informacion de su :::MEMORIA:::");
      
        System.out.println("memoria RAM total: "+mem.getMemFisicaTotal()+" Mb");
        
        System.out.println("memoria Swap total: "+mem.getMemSwapTotal()+" Mb");
        System.out.println("!MEMORIA EN USO!");
        System.out.println("memoria ram en uso: "+mem.getMemFisicaEnUso()+" Mb");
        System.out.println("memoria swap en uso: "+mem.getMemSwapEnUso()+ " Mb");
    }
    private void mostrarDatosMother()
    {
        IMother info=this.monitorLinux.getMotherMonitor();
        
        System.out.println("Mostrando Info de su :::MOTHERBOARD:::");
        System.out.println("Marca: "+info.getMarcaMother());
        System.out.println("Modelo: "+info.getModeloMother());
    }
    private void mostrarDatosNIC()
    {
        INetworking info=this.monitorLinux.getNicMonitor();
        ArrayList<NIC> nics=info.getNics();
        System.out.println("Mostrando Info de sus NICS");
        for(NIC a : nics)
        {
            
            System.out.println("Nombre: "+a.getNombre());
            System.out.println("IP: "+Arrays.toString(a.getIPv4()));
            System.out.println("Mac: "+a.getMACAddress());
            
        }
        System.out.println(info.toJSON());
        
    }
    private void mostrarDatosSensores()
    {
        iSensor info=this.monitorLinux.getSensMonitor();
        System.out.println("Mostrando Informacion de Temperaturas");
        System.out.println("Temp CPU: "+info.getTempCPU());
        System.out.println("Voltaje CPU: "+info.getVoltajeCPU());
        System.out.println("Velocidad Ventiladores"+Arrays.toString(info.getVelVentiladores()));
    }
    private void mostrarDatosHardDisk()
    {
        IStoreDiskWork info=this.monitorLinux.getDiskMonitor();
        ArrayList<HardDisk> disk =info.getDisks();
        for(HardDisk disks:disk)
        {
            System.out.println("Mostrando Discos");
            System.out.println("Modelo: "+ disks);
            System.out.println("Nombre: "+ disks.getName());
            System.out.println("Serial: "+disks.getSerial());
            System.out.println("Tamaño: "+disks.getSize());
            System.out.println("TransferTime: "+disks.getTransferTime());
        }
    }
            
    public static void main(String [] args) throws IOException
    {
        testInfoLinux info=new testInfoLinux();
        Monitor a=new LinuxMonitor();
        ArchivoJSON archi=new ArchivoJSON();
        archi.escribir(a.toJSON());
        
        //info.mostrarDatosCpu();
       // info.mostrarDatosMemoria();
        //info.mostrarDatosMother();
        info.mostrarDatosNIC();
        //info.mostrarDatosSensores();
       // info.mostrarDatosHardDisk();
       // System.out.println(info.monitorLinux.toJSON());
        
    }
    
    
    
}

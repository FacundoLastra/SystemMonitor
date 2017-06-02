/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.CentralProcessor;


/**
 *
 * @author skydoo
 */
public abstract class CPU implements ICPU,ToJSON {
    
    protected CentralProcessor cpu;
    
    public CPU(CentralProcessor cpu) {
        this.cpu = cpu;
    }
    
    @Override
    public String getFamily() {
        return cpu.getFamily();
    }

    @Override
    public String getModel() {
        return cpu.getModel();
    }
    @Override
    public String getFabricante() {
        return cpu.getVendor();
    }

    @Override
    public boolean esDe64Bits() {
        return cpu.isCpu64bit();
    }

    @Override
    public Integer getNucleos() {
        return cpu.getPhysicalProcessorCount();
    }

    @Override
    public Integer getHilos() {
        return cpu.getLogicalProcessorCount();
    }

    @Override
    public double getVelocidadCPU() {
       return ((cpu.getVendorFreq()/10000000)/100); //devuelve el los hz del procesador. la division se debe a que por ejemplo, si mi procesador es de 2.00hz el metodo getVendorFreq devuelve el valor 2000000000
    }

    @Override
    public double getUsoActualCPU() {
        return cpu.getSystemCpuLoad();
    }
    
    @Override
    public String toJSON()
    {
        return "{\"Family\":"+this.getFamily()+
                ",\"Model\":"+this.getModel()+
                ",\"Fabricante\":"+this.getFabricante()+
                ",\"esDe64Bits\":"+String.valueOf(this.esDe64Bits())+
                ",\"Nucleos\":"+String.valueOf(this.getNucleos())+
                ",\"Hilos\":"+String.valueOf(this.getHilos())+
                ",\"VelocidadCPU\":"+String.valueOf(this.getVelocidadCPU())+
                ",\"UsoActualCPU\":"+String.valueOf(this.getUsoActualCPU())+
                "}";
        
    
    }        
       
    
    
    
}

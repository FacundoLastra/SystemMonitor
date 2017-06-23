/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import org.json.JSONStringer;
import oshi.hardware.CentralProcessor;



/**
 *
 * @author skydoo
 */
public abstract class CPU implements ICPU {
    
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
        JSONStringer js=new JSONStringer();
        String returnjs;
        returnjs= js.object().key("Family").value(this.getFamily()).key("Model").value(this.getModel()).
                key("Fabricante").value(this.getFabricante()).key("esDe64Bits").value(this.esDe64Bits()).
                key("Nucleos").value(this.getNucleos()).endObject().toString();
        
        return returnjs;
        
    
    }        
       
    
    
    
}

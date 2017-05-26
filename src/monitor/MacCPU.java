/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.platform.mac.MacCentralProcessor;

/**
 *
 * @author tomasmoran
 */
public class MacCPU implements ICPU{
    
    private final MacCentralProcessor cpu;
    
    public MacCPU(){
        this.cpu = new MacCentralProcessor();
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
        return ((cpu.getVendorFreq()/10000000)/100);
    }

    @Override
    public double getUsoActualCPU() {
        return cpu.getSystemCpuLoad();
    }
    
    
    
}


package monitor;

import oshi.hardware.CentralProcessor;


/**
 *
 * @author skydoo
 */
public abstract class CPU implements ICPU {
    
    protected CentralProcessor cpu;
    
    @Override
    public String getFamily() {
        return cpu.getFamily();
    }

    @Override
    public String getModel() {
        return cpu.getModel();
    }

    public CPU(CentralProcessor cpu) {
        this.cpu = cpu;
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
    
    
    
}

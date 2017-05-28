/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author turin
 */
public abstract class Monitor {
    private ICPU cpuMonitor;
    private IMemoria memMonitor;
    private IMother motherMonitor;

    public Monitor(ICPU cpuMonitor, IMemoria memMonitor, IMother motherMonitor, IntOS osMonitor, Networking nicMonitor) {
        this.cpuMonitor = cpuMonitor;
        this.memMonitor = memMonitor;
        this.motherMonitor = motherMonitor;
        this.osMonitor = osMonitor;
        this.nicMonitor = nicMonitor;
    }
    private IntOS osMonitor;
    private Networking nicMonitor;

    public ICPU getCpuMonitor() {
        return cpuMonitor;
    }

    public IMemoria getMemMonitor() {
        return memMonitor;
    }

    public IMother getMotherMonitor() {
        return motherMonitor;
    }

    public IntOS getOsMonitor() {
        return osMonitor;
    }

    public Networking getNicMonitor() {
        return nicMonitor;
    }
    
    

    
    
    
    
    
    
    
}

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
    private IntOS osMonitor;
    private Networking nicMonitor;
    private Sensores sensMonitor;
    
    public Monitor(ICPU cpuMonitor, IMemoria memMonitor, IMother motherMonitor, IntOS osMonitor, Networking nicMonitor, Sensores sensMonitor) {
        this.cpuMonitor = cpuMonitor;
        this.memMonitor = memMonitor;
        this.motherMonitor = motherMonitor;
        this.osMonitor = osMonitor;
        this.nicMonitor = nicMonitor;
        this.sensMonitor=sensMonitor;
    }

    public Sensores getSensMonitor() {
        return sensMonitor;
    }
    

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

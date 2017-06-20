/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import org.json.JSONStringer;
import persistencia.JSONSerializable;

/**
 *
 * @author turin
 */
public abstract class Monitor implements JSONSerializable{
    private ICPU cpuMonitor;
    private IMemoria memMonitor;
    private IMother motherMonitor;
    private IntOS osMonitor;
    private Networking nicMonitor;
    private Sensores sensMonitor;
    private StoreDiskWork hardDiskMonitor;
    
    public Monitor(ICPU cpuMonitor, IMemoria memMonitor, IMother motherMonitor, 
            IntOS osMonitor, Networking nicMonitor, Sensores sensMonitor, StoreDiskWork hardDisk) {
        this.cpuMonitor = cpuMonitor;
        this.memMonitor = memMonitor;
        this.motherMonitor = motherMonitor;
        this.osMonitor = osMonitor;
        this.nicMonitor = nicMonitor;
        this.sensMonitor=sensMonitor;
        this.hardDiskMonitor=hardDisk;
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
    public StoreDiskWork getDiskMonitor()
    {
        return this.hardDiskMonitor;
    }
    @Override
    public String toJSON()
    {
        JSONStringer js=new JSONStringer();
        String jsonresultado=js.object().key("cpuMonitor").value(this.cpuMonitor.toJSON()).
                key("memMonitor").value(this.memMonitor.toJSON()).key("nicMonitor").value(this.nicMonitor.toJSON()).
                key("osMonitor").value(this.osMonitor.toJSON()).key("sensMonitor").value(this.sensMonitor.toJSON()).endObject().toString();
                
        return jsonresultado;
        
    }
    
    

    
    
    
    
    
    
    
}

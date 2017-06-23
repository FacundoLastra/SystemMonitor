package monitor;
import oshi.hardware.HWDiskStore;

import org.json.JSONStringer;

/**
 *
 * @author Sim
 */
public abstract class HardDisk implements IHardDisk {

    protected HWDiskStore Disks;
    
    public HardDisk (HWDiskStore Disks) {
        
        this.Disks = Disks;
    }
            
    @Override
    public String getName() {
        
       return this.Disks.getName();
    }

    @Override
    public String getModel() {
        
        return this.Disks.getModel();
    }

    @Override
    public String getSerial() {

        return this.Disks.getSerial();
    }

    @Override
    public long getSize() {

        return this.Disks.getSize();
    }

    @Override
    public long getTransferTime() {

        return this.Disks.getTransferTime();
    }
    
    @Override
    public String toJSON() {
        
        JSONStringer js=new JSONStringer();
        String jsonresultado=js.object().key("name").value(this.getName()).
                key("model").value(this.getModel()).key("serial").value(this.getSerial()).
                key("size").value(this.getSize()).key("transferTime").value(this.getTransferTime()).endObject().toString();
        
        
        return jsonresultado;
    }

}

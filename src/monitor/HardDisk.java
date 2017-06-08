package monitor;
import oshi.hardware.HWDiskStore;

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

}

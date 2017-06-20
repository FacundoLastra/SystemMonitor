
package monitor;

import java.util.ArrayList;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author Sim
 */

public abstract class StoreDiskWork implements IStoreDiskWork{
    
    //Atributos
    private ArrayList<HardDisk> disk;
    
    //Constructor
    public StoreDiskWork (HWDiskStore[] disks) {
        
        this.disk = getArrayListDisks(disks);
    }
    
    //Metodos
    @Override
    public abstract ArrayList<HardDisk> getArrayListDisks (HWDiskStore[] arrayDisks);
   
    @Override
    public ArrayList<HardDisk> getDisks () {
        
        return this.disk;
    }
}

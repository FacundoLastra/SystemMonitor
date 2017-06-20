
package monitor;

import java.util.ArrayList;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author Sim
 */

public interface IStoreDiskWork {
    
    
    public abstract ArrayList<HardDisk> getArrayListDisks (HWDiskStore[] arrayDisks);
    public ArrayList<HardDisk> getDisks ();
    
}


package monitor;

import java.util.ArrayList;
import oshi.hardware.HWDiskStore;
import persistencia.JSONSerializable;

/**
 *
 * @author Sim
 */

public interface IStoreDiskWork extends JSONSerializable {
    
    
    public abstract ArrayList<HardDisk> getArrayListDisks (HWDiskStore[] arrayDisks);
    public ArrayList<HardDisk> getDisks ();
    
}

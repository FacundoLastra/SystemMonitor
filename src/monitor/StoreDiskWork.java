
package monitor;

import java.util.ArrayList;
import org.json.JSONStringer;
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
        
    @Override
    public String toJSON()
    {
        String dk="[";
        for (HardDisk a:this.getDisks())
        {
            dk=dk+a.toJSON()+",";
        }
        dk=dk.substring(0, dk.length()-1);
        dk=dk+"]";
        
      return dk;   
    }
}

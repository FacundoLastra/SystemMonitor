 
package monitor.linux;
import java.util.ArrayList;
import monitor.HardDisk;
import monitor.StoreDiskWork;
import oshi.hardware.HWDiskStore;
import oshi.hardware.platform.linux.LinuxDisks;


/**
 *
 * @author Sim
 */

public class LinuxDiskWork extends StoreDiskWork {
    
    //Atributos

    
    //Constructor
    public LinuxDiskWork() {
        
        super(new LinuxDisks().getDisks());
    }

    //Metodos
    @Override
    public ArrayList<HardDisk> getArrayListDisks (HWDiskStore[] arrayDisks){
        
       ArrayList<HardDisk> array = new ArrayList<>();
       
        for(HWDiskStore Temp: arrayDisks)
        {
            LinuxDisk TempHDW = new LinuxDisk(Temp);
            array.add(TempHDW);
            
        }
        return array;
    }
    
}

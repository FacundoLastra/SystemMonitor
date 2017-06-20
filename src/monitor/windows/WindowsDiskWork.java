/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.windows;
import java.util.ArrayList;
import monitor.HardDisk;
import monitor.StoreDiskWork;
import oshi.hardware.HWDiskStore;
import oshi.hardware.platform.windows.WindowsDisks;

/**
 *
 * @author tomasmoran
 */
public class WindowsDiskWork extends StoreDiskWork
{

    public WindowsDiskWork(){
        super(new WindowsDisks().getDisks());
    }
    
    @Override
    public ArrayList<HardDisk> getArrayListDisks(HWDiskStore[] arrayDisks) {
        
        ArrayList<HardDisk> array = new ArrayList<>();
        
        for(HWDiskStore temp: arrayDisks){
            WindowsDisk tempHDW = new WindowsDisk(temp);
            array.add(tempHDW);
        }
        
        return array;
        
    }
    
}

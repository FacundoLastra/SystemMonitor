/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;
import java.util.ArrayList;
import monitor.HardDisk;
import monitor.StoreDiskWork;
import oshi.hardware.HWDiskStore;
import oshi.hardware.platform.mac.MacDisks;

/**
 *
 * @author tomasmoran
 */
public class MacDiskWork extends StoreDiskWork{

    public MacDiskWork(){
        super(new MacDisks().getDisks());
    }
    
    @Override
    public ArrayList<HardDisk> getArrayListDisks(HWDiskStore[] arrayDisks){
        
        ArrayList<HardDisk> array = new ArrayList<>();
        
        for(HWDiskStore temp: arrayDisks){
            MacDisk TempHDW = new MacDisk(temp);
            array.add(TempHDW);
        }
        return array;
    }
    
}

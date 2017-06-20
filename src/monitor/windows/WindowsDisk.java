/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.windows;

import monitor.HardDisk;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author skydoo
 */
public class WindowsDisk extends HardDisk{
    
    public WindowsDisk(HWDiskStore disk)
    {
        super(disk);
    }
    
}

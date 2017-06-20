/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;

import monitor.HardDisk;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author tomasmoran
 */
public class MacDisk extends HardDisk {
    
    public MacDisk(HWDiskStore Disks) {
        super(Disks);
    }
    
}

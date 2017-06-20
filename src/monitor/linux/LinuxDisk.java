package monitor.linux;

import monitor.HardDisk;
import oshi.hardware.HWDiskStore;

/**
 *
 * @author Sim
 */
public class LinuxDisk extends HardDisk {

    public LinuxDisk(HWDiskStore Disks) {

        super(Disks);
    }

}

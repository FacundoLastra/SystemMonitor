
package monitor;

import oshi.hardware.platform.linux.LinuxCentralProcessor;


/**
 *
 * @author Fast PC
 */
public class LinuxCPU extends CPU{
    
    public LinuxCPU() {
        super(new LinuxCentralProcessor());
    }
}

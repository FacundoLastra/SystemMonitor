
package monitor.linux;

import monitor.Mother;
import oshi.hardware.platform.linux.LinuxHardwareAbstractionLayer;

/**
 *
 * @author Sim
 */

public class LinuxMother extends Mother {

    public LinuxMother() {
        
        super((new LinuxHardwareAbstractionLayer()).getComputerSystem().getBaseboard());
    }
}


package monitor;

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

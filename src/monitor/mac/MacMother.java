
package monitor.mac;

import monitor.Mother;
import oshi.hardware.platform.mac.MacHardwareAbstractionLayer;

/**
 *
 * @author Sim
 */

public class MacMother extends Mother {

    public MacMother() {
        
        super((new MacHardwareAbstractionLayer()).getComputerSystem().getBaseboard());
    }
}

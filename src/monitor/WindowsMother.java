
package monitor;

import oshi.hardware.platform.windows.WindowsHardwareAbstractionLayer;

/**
 *
 * @author Sim
 */

public class WindowsMother extends Mother {

    public WindowsMother() {
        
        super((new WindowsHardwareAbstractionLayer()).getComputerSystem().getBaseboard());
    }
}

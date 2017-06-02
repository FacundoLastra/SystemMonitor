
package monitor.windows;

import monitor.OS;
import oshi.software.os.windows.WindowsOperatingSystem;
import oshi.software.os.windows.WindowsOSVersionInfoEx;

/**
 *
 * @author Sim
 */

public class WindowsOS extends OS{

    
    public WindowsOS() {
        super(new WindowsOperatingSystem(), new WindowsOSVersionInfoEx());
    }
}

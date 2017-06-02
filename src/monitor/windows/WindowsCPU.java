
package monitor.windows;

import monitor.CPU;
import oshi.hardware.platform.windows.WindowsCentralProcessor;


/**
 *
 * @author Sim
 */

public class WindowsCPU extends CPU{
    
    public WindowsCPU() {
        super(new WindowsCentralProcessor());
    }
}


package monitor.windows;

import monitor.Memoria;
import oshi.hardware.platform.windows.WindowsGlobalMemory;
/**
 *
 * @author Sim
 */
public class WindowsMem extends Memoria{    

    public WindowsMem() {
        super(new WindowsGlobalMemory());
    }
}

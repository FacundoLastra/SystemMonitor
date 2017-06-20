
package monitor.windows;

import monitor.NIC;
import oshi.hardware.NetworkIF;

/**
 *
 * @author Sim
 */
public class WindowsNIC extends NIC {
    
        public WindowsNIC(NetworkIF nic){
        super(nic);
        
    }
}

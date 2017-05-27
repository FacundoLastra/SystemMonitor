
package monitor;



import oshi.software.os.linux.LinuxOperatingSystem;
import oshi.software.os.linux.LinuxOSVersionInfoEx;


/**
 *
 * @author Fast PC
 */
public class LinuxOS extends OS{

    
    public LinuxOS() {
        super(new LinuxOperatingSystem(), new LinuxOSVersionInfoEx());
    }
    

    
    
    
    
}

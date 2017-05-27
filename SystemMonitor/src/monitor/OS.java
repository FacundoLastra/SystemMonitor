
package monitor;

import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;


/**
 *
 * @author skydoo
 */
public abstract class OS implements IntOS{
    
    protected OperatingSystem os;
    protected OperatingSystemVersion osversion;

    public OS(OperatingSystem os, OperatingSystemVersion osversion) {
        this.os = os;
        this.osversion = osversion;
    }
    
    @Override
    public String getFamiliaOS() {
        return os.getFamily();       
    }

    @Override
    public String getVersionOS() {
       
        return this.osversion.getVersion();
    }

    @Override
    public String getFabricanteOS() {
        return os.getManufacturer();
    }
    
}

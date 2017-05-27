
package monitor;

import oshi.hardware.platform.linux.LinuxGlobalMemory;
/**
 *
 * @author Fast PC
 */
public class LinuxMem extends Memoria{    

    public LinuxMem() {
        super(new LinuxGlobalMemory());
    }
}

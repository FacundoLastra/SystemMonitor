
package monitor;

import java.util.ArrayList;
import oshi.hardware.NetworkIF;
import oshi.hardware.platform.linux.LinuxNetworks;
/**
 *
 * @author Fast PC
 */
public class LinuxNIC implements INIC{

    private ArrayList<NetworkIF> net;
    
    @Override
    public Integer getIPv4() {
        NetworkIF net;
        net.
        net.getNetworks();
    }

    @Override
    public Integer getMACAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

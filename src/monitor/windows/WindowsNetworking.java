/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.windows;
import java.util.ArrayList;
import monitor.NIC;
import monitor.Networking;
import oshi.hardware.platform.windows.WindowsNetworks;
import oshi.hardware.NetworkIF;

/**
 *
 * @author tomasmoran
 */
public class WindowsNetworking extends Networking{

    public WindowsNetworking() {
        super(new WindowsNetworks().getNetworks());
    }

    @Override
    public ArrayList<NIC> crearArrayNics(NetworkIF[] nics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

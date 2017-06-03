/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;

import java.util.ArrayList;
import monitor.NIC;
import monitor.Networking;
import oshi.hardware.NetworkIF;
import oshi.hardware.platform.linux.LinuxNetworks;

/**
 *
 * @author skydoo
 */
public class LinuxNetworking extends Networking{

    public LinuxNetworking() {
        super(new LinuxNetworks().getNetworks());
    }

    
    @Override
    public ArrayList<NIC> crearArrayNics(NetworkIF[] nics) {
        ArrayList<NIC> array=new ArrayList<>();
        for(NetworkIF a:nics)
        {
            array.add(new LinuxNIC(a));
        }
        return array;
    }
    
}

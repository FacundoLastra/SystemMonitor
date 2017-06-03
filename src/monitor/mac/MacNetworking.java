/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;

import java.util.ArrayList;
import monitor.NIC;
import monitor.Networking;
import oshi.hardware.platform.mac.MacNetworks;
import oshi.hardware.NetworkIF;

/**
 *
 * @author skydoo
 */
public class MacNetworking extends Networking{

    public MacNetworking() {
        super(new MacNetworks().getNetworks());
    }

    
    @Override
    public ArrayList<NIC> crearArrayNics(NetworkIF[] nics) {
        ArrayList<NIC> array=new ArrayList<>();
        for(NetworkIF a:nics)
        {
            array.add(new MacNIC(a));
        }
        return array;
    }
    
}

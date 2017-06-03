/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;

import monitor.NIC;
import oshi.hardware.NetworkIF;

/**
 *
 * @author tomasmoran
 */
public class MacNIC extends NIC{
    
    public MacNIC(NetworkIF nic){
        super(nic);
    }
    
}

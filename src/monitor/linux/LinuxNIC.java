/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;
import monitor.NIC;
import oshi.hardware.NetworkIF;


/**
 *
 * @author skydoo
 */
public class LinuxNIC extends NIC{
  
    public LinuxNIC(NetworkIF net) 
    {
        super(net);
    }
  
    
}

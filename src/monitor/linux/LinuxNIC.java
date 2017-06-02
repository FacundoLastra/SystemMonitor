/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;
import monitor.Networking;
import oshi.hardware.platform.linux.LinuxNetworks;
/**
 *
 * @author skydoo
 */
public class LinuxNIC extends Networking{
  
    public LinuxNIC() 
    {
        super(new LinuxNetworks().getNetworks());
       
    }
  
    
}

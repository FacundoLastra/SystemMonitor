/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;
import oshi.hardware.platform.mac.MacNetworks;
/**
 *
 * @author tomasmoran
 */
public class MacNIC extends Networking{
    
    public MacNIC(){
        super(new MacNetworks().getNetworks() );
    }
    
}

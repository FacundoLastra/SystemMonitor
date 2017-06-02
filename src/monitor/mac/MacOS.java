/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;
import monitor.OS;
import oshi.software.os.mac.MacOperatingSystem;
import oshi.software.os.mac.MacOSVersionInfoEx;
/**
 *
 * @author tomasmoran
 */
public class MacOS extends OS{
    
    public MacOS(){
        super( new MacOperatingSystem() , new MacOSVersionInfoEx() );
    }
}

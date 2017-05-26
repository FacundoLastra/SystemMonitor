/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;



import oshi.software.os.linux.LinuxOperatingSystem;
import oshi.software.os.linux.LinuxOSVersionInfoEx;


/**
 *
 * @author Fast PC
 */
public class LinuxOS extends OS{

    
    public LinuxOS() {
        super(new LinuxOperatingSystem(), new LinuxOSVersionInfoEx());
    }
    

    
    
    
    
}

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
public class LinuxOS implements OS{

    private LinuxOperatingSystem os;
    
    @Override
    public String getFamiliaOS() {
        return os.getFamily();       
    }

    @Override
    public String getVersionOS() {
        LinuxOSVersionInfoEx info=new LinuxOSVersionInfoEx();
        return info.getVersion();
    }

    @Override
    public String getFabricanteOS() {
        return os.getManufacturer();
    }
    
}

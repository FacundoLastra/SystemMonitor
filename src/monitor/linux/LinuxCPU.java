/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;

import monitor.CPU;
import oshi.hardware.platform.linux.LinuxCentralProcessor;


/**
 *
 * @author Fast PC
 */
public class LinuxCPU extends CPU{
    
    public LinuxCPU() {
        super(new LinuxCentralProcessor());
    }
}

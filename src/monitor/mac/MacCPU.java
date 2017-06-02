/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;

import monitor.CPU;
import oshi.hardware.platform.mac.MacCentralProcessor;

/**
 *
 * @author tomasmoran
 */
public class MacCPU extends CPU{
    
    public MacCPU() {
        super (new MacCentralProcessor());
    }
    
}

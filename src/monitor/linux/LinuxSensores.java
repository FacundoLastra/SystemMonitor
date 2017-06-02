/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;

import monitor.Sensores;
import oshi.hardware.platform.linux.LinuxSensors;
/**
 *
 * @author skydoo
 */
public class LinuxSensores extends Sensores{
    
    public LinuxSensores()
    {
        super(new LinuxSensors());
    }
    
}

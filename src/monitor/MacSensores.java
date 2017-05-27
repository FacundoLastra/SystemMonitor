/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;
import oshi.hardware.platform.mac.MacSensors;
/**
 *
 * @author tomasmoran
 */
public class MacSensores extends Sensores {
    
    public MacSensores() {
        super(new MacSensors());
    }
    
}

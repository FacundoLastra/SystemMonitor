/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.windows;
import monitor.Sensores;
import oshi.hardware.platform.windows.WindowsSensors;

/**
 *
 * @author tomasmoran
 */
public class WindowsSensores extends Sensores{

    public WindowsSensores() {
        super(new WindowsSensors());
    }
    
}

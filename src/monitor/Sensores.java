/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;
import oshi.hardware.Sensors;
/**
 *
 * @author tomasmoran
 */

public class Sensores implements iSensor {
    
    protected Sensors sensores;
    
    @Override
    public double getTempCPU() {
        return sensores.getCpuTemperature();
    }

    @Override
    public double getVoltajeCPU() {
        return sensores.getCpuVoltage();
    }

    @Override
    public Integer[] getVelVentiladores() {
        
         
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;
import oshi.hardware.Sensors;
import persistencia.JSONSerializable;

/**
 *
 * @author tomasmoran
 */

public abstract class Sensores implements iSensor, JSONSerializable {
    
    protected Sensors Sens;
    
    public Sensores(Sensors sens){
        this.Sens = sens;
    }
    
    @Override
    public double getTempCPU() {
        return Sens.getCpuTemperature();
    }

    @Override
    public double getVoltajeCPU() {
        return Sens.getCpuVoltage();
    }

    @Override
    public int[] getVelVentiladores() {
        
        return Sens.getFanSpeeds();
        
    }
    
    @Override
    public String toJSON(){

        double temp = Sens.getCpuTemperature();
        String temperatura= String.valueOf(temp);

        double volta=Sens.getCpuVoltage();
        String volt=String.valueOf(volta);
        
        int[] fan=Sens.getFanSpeeds();
        String fans=String.valueOf(fan);
        
        String a= "{\"Temperatura\":"+temperatura+",\"Voltage\":"+volt+
                ",\"Fan Speed\":"+fans+"}";
        
        return a;
    }
    
}

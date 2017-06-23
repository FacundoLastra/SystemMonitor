/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;
import oshi.hardware.Sensors;
import org.json.JSONStringer;


/**
 *
 * @author tomasmoran
 */

public abstract class Sensores implements iSensor{
    
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

        JSONStringer js = new JSONStringer();
        String ret;
        ret = js.object().key("Temperatura CPU: ").value(this.getTempCPU()).
                key("Voltaje CPU: ").value(this.getVoltajeCPU()).
                key("Velocidad ventiladores: ").value(this.getVelVentiladores()).
                endObject().toString();
        
        return ret;

    }
    
}

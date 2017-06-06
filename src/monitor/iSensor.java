/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import persistencia.JSONSerializable;

/**
 *
 * @author tomasmoran
 */
public interface iSensor extends JSONSerializable{
    
    double getTempCPU();
    double getVoltajeCPU();
    int[] getVelVentiladores();
    
}

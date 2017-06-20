/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.mac;

import monitor.Monitor;

/**
 *
 * @author tomasmoran
 */
public class MacMonitor extends Monitor{

    public MacMonitor(){
        super(new MacCPU(),new MacMemoria(),new MacMother(),new MacOS(),new MacNetworking(),
                new MacSensores() );
    }
  
}

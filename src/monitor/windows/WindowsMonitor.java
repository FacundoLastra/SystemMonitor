/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.windows;

import monitor.Monitor;


/**
 *
 * @author tomasmoran
 */
public class WindowsMonitor extends Monitor {
    
    public WindowsMonitor(){
        super(new WindowsCPU(),new WindowsMem(),new WindowsMother(),
                new WindowsOS(),new WindowsNetworking(),new WindowsSensores(),new WindowsDiskWork());
    }
    
}

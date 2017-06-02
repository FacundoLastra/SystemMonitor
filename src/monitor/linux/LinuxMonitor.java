/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;

import monitor.Monitor;

/**
 *
 * @author skydoo
 */
public class LinuxMonitor extends Monitor{
    
   public LinuxMonitor()
   {
       super(new LinuxCPU(),new LinuxMem(),new LinuxMother(),new LinuxOS(),new LinuxNIC(),new LinuxSensores());
       
   }
    
}

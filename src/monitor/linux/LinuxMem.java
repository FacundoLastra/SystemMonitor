/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor.linux;

import monitor.Memoria;
import oshi.hardware.platform.linux.LinuxGlobalMemory;
/**
 *
 * @author Fast PC
 */
public class LinuxMem extends Memoria{    

    public LinuxMem() {
        super(new LinuxGlobalMemory());
    }
}

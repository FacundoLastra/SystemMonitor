/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.platform.mac.MacGlobalMemory;
/**
 *
 * @author tomasmoran
 */
public class MacMemoria extends Memoria{
    
    public MacMemoria() {
        super(new MacGlobalMemory()) ;
    }
    
}

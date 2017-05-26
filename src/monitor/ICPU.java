/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author Fast PC
 */
public interface ICPU {
    
    String getFamily();
    String getModel();
    String getFabricante();
    boolean esDe64Bits();
    Integer getNucleos();
    Integer getHilos();
    double getVelocidadCPU();
    double getUsoActualCPU();
    
}

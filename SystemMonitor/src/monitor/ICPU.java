
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

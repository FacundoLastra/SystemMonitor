
package monitor;

import oshi.hardware.Baseboard;

/**
 *
 * @author Sim
 */

public abstract class Mother implements IMother {
    
    private Baseboard mother;
    
    @Override
    public String getMarcaMother() {
        
       return this.mother.getManufacturer();
    }
    
    @Override
    public String getModeloMother(){
        
        return this.mother.getModel();
    }

    public Mother(Baseboard mother) {
        this.mother = mother;
    }
}

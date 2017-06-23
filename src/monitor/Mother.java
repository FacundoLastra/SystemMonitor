
package monitor;

import oshi.hardware.Baseboard;
import org.json.JSONStringer;

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
    
    @Override
    public String toJSON()
    {
        JSONStringer js = new JSONStringer();
        String ret;
        ret=js.object().key("Modelo Mother: ").value(this.getModeloMother()).
                key("Marca Mother: ").value(this.getMarcaMother()).endObject().toString();
        
        return ret;
        
    }
    
}

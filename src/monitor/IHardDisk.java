
package monitor;
import persistencia.JSONSerializable;

/**
 *
 * @author Sim
 */

public interface IHardDisk extends JSONSerializable {
    
    String getName ();
    String getModel ();
    String getSerial ();
    long getSize ();
    long getTransferTime ();
    
    
}

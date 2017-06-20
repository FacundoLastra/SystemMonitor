package monitor.windows;

import java.util.ArrayList;
import monitor.NIC;
import monitor.Networking;
import oshi.hardware.platform.windows.WindowsNetworks;
import oshi.hardware.NetworkIF;

/**
 *
 * @author Sim
 */
public class WindowsNetworking extends Networking {

    public WindowsNetworking() {
        super(new WindowsNetworks().getNetworks());
    }

    @Override
    public ArrayList<NIC> crearArrayNics(NetworkIF[] nics) {

        ArrayList<NIC> array = new ArrayList<>();
        for (NetworkIF a : nics) {
            array.add(new WindowsNIC(a));
        }
        return array;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;


import oshi.hardware.NetworkIF;

/**
 *
 * @author Fast PC
 */
public class NIC implements INIC{

    private NetworkIF net;

    public NIC(NetworkIF net) {
        this.net = net;
    }
    
    
    @Override
    public String[] getIPv4() {
        return net.getIPv4addr();
    }

    @Override
    public String getMACAddress() {
        return net.getMacaddr();
    }

    @Override
    public String getNombre() {
        return net.getName();
    }
    
}

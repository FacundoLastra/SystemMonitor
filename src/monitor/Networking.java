/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.NetworkIF;

/**
 *
 * @author skydoo
 */
public abstract class Networking implements INetworking {
    
    private NIC[] nics;
    
    public Networking(NetworkIF[] nics)
    {
        for(int i=0;this.nics.length<nics.length;i++)
        {
            this.nics[i]=new NIC(nics[i]);
        }
    }
    
    @Override
    public NIC[] getNics()
    {
        return nics;
    }
    
}

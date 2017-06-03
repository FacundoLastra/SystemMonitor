/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import java.util.ArrayList;
import oshi.hardware.NetworkIF;
import persistencia.JSONSerializable;

/**
 *
 * @author skydoo
 */
public abstract class Networking implements INetworking,JSONSerializable {
    
    private ArrayList<NIC> nics;
    
    public abstract ArrayList<NIC> crearArrayNics(NetworkIF[] nics); 
    
    public Networking(NetworkIF[] nics)
    {
        this.nics=this.crearArrayNics(nics);
        
        
    }
    
    /*
    public Networking(NetworkIF[] nics)
    {
        this.nics=new ArrayList<>();
        int aux=nics.length-1;
        for(int i=0;i<=aux;i++)
        {
           
            this.nics.add(new NIC(nics[i]));
            
        }
    }
    */
    
    
    @Override
    public ArrayList<NIC> getNics() {
        return this.nics;
    }
    
    @Override
    public String toJSON()///testiar
    {
        String nic="[";
        for (NIC a:this.nics)
        {
            nic=nic+a.toJSON()+",";
        }
        nic=nic.substring(0, nic.length()-1);
        nic=nic+"]";
      return nic;   
    }
    
    
    
}

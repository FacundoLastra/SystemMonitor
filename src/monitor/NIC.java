/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;


import java.util.Arrays;
import org.json.JSONStringer;
import oshi.hardware.NetworkIF;
import persistencia.JSONSerializable;

/**
 *
 * @author Fast PC
 */
public abstract class NIC implements INIC,JSONSerializable{

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
    @Override
    public String toJSON(){
    /*
        return "{\"Ipv4\":"+Arrays.toString(this.getIPv4())+
                ",\"Mac\":"+this.getMACAddress()+
                ",\"Nombre\":"+this.getNombre()+
                "}";
    */
        JSONStringer js=new JSONStringer();
        String jsonresultado=js.object().key("ipv4").value(Arrays.toString(this.getIPv4())).
                key("mac").value(this.getMACAddress()).key("nombre").value(this.getNombre())
                .endObject().toString();
        
        return jsonresultado;
        
        
    }
    
}

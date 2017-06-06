/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import java.util.ArrayList;
import persistencia.JSONSerializable;

/**
 *
 * @author skydoo
 */
public interface INetworking extends JSONSerializable{
    
    ArrayList<NIC> getNics();
    
    
    
    
}

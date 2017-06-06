/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import persistencia.JSONSerializable;

/**
 *
 * @author Fast PC
 */
public interface INIC extends JSONSerializable{
    String[] getIPv4();
    String getMACAddress();
    String getNombre();
    
}

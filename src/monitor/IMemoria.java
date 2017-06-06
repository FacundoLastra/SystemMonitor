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
public interface IMemoria extends JSONSerializable{
    Integer getMemFisicaTotal();
    Integer getMemSwapTotal();
    Integer getMemFisicaEnUso();
    Integer getMemSwapEnUso();    
}

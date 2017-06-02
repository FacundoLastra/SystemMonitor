/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author turin
 * @param <T>
 */
public interface JSONSerializable<T> {

    ///String serializar();
    
    String toJSON();

    ///T deserializar();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import org.json.JSONStringer;

/**
 *
 * @author skydoo
 */
public class JsonTest {
    
public static void main(String[] args)
{
    JSONStringer js=new JSONStringer();
    
    String jsonres=js.object().key("hola").value(true).endObject().toString();
    System.out.println(jsonres);
}
}

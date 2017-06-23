/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

/**
 *
 * @author turin
 */
public class ArchivoJSON {

    private static FileWriter file;
    protected String extension;
    /**
     * Escribe la cadena JSON en el archivo
     * @param cadenaJson
     * @throws IOException 
     */
    
    public ArchivoJSON() throws IOException{
        this.extension=".json";
        ///configuracion del nombre del archivo
        String path=System.getProperty("user.dir")+"MonitorSistema"
                +String.valueOf(new Date())+this.extension;
        ///
        file = new FileWriter(path);
        
        
    }

    public void escribir(String cadenaJson) throws IOException {
        try{
            file.append(cadenaJson);
            
        }catch(IOException e)
        {
            throw e;
        }finally{
            file.flush();
        }
        
    }
    
    /**
     * Devuelve la cadena JSON asociada a la clave provista
     * { 'pirulo': 'Esta es la cadena asociada a pirluo' }
     * @param clave 
     * @return 'Esta es la cadena asociada a pirulo' si clave = 'pirulo'
     */
    public String leer(String clave) {
        this.abrir();
        /*
        ....
        */
        return "";
    }
    
    /**
     * Abre el archivo con el cual se va a interactuar
     */
    private void abrir(){
        /*
        ....
        */
    }

    @Override
    protected void finalize() throws Throwable {
        file.flush();
        file.close();
        super.finalize();
    }
}

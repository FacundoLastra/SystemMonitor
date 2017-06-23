/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

import oshi.hardware.GlobalMemory;
import org.json.JSONStringer;

/**
 *
 * @author skydoo
 */
public abstract class Memoria implements IMemoria{
    
    protected GlobalMemory memoria;

    public Memoria(GlobalMemory memoria) {
        this.memoria = memoria;
    }
    
    private Integer pasarValorAMegaByte(Long valorOriginal)
    { 
        valorOriginal=((valorOriginal/1024)/1024);
        
        return valorOriginal.intValue(); //
    }        
    
    @Override
    public Integer getMemFisicaTotal() {
       
        return this.pasarValorAMegaByte(memoria.getTotal());
    }

    @Override
    public Integer getMemSwapTotal() {
        
        return this.pasarValorAMegaByte(memoria.getSwapTotal());
    }

    @Override
    public Integer getMemFisicaEnUso() {
        int memoriaTotal=this.getMemFisicaTotal();
        int memoriaSinUsar=this.pasarValorAMegaByte(memoria.getAvailable());
        
        return memoriaTotal-memoriaSinUsar;
    }

    @Override
    public Integer getMemSwapEnUso() {
        return this.pasarValorAMegaByte(memoria.getSwapUsed());
    }
    
    @Override
    public String toJSON()
    {
        JSONStringer js = new JSONStringer();
        String returnjs;
        
        returnjs = js.object().key("Memoria fisica total: ").value(this.getMemFisicaTotal()).
                key("Memoria Swap Total: ").value(this.getMemSwapTotal()).
                key("Memoria fisica en uso: ").value(this.getMemFisicaEnUso()).
                key("Memoria Swap en uso: ").value(this.getMemSwapEnUso()).endObject().toString();
        
        return returnjs;
        
    }
    
    
}

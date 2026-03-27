/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.BaseEspacial;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class TiendaVenta {
    
    private final Partida partida;
    private final  int  crJugador;
    
    public TiendaVenta(Partida partida){
        this.partida = partida;
        this.crJugador = partida.getJugador().getCreditosGalacticos();
    }
    
    
    
    public void venderComponentes(){
        
    }
    
    public Nave venderNaves(int opcion){
        Nave naveVendida = partida.getJugador().getInventarioNaves().eliminarNave(opcion);
        int precioObtenido = naveVendida.getPrecioDeVenta();
        partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() + precioObtenido);
        return naveVendida;
    }
    
    public void venderPilotos(){
        
    
    }
    
    public void venderObjetos(){
    }
    
}

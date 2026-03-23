/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.BaseEspacial;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class TiendaCompra {
    
    private final Partida partida;
    private int crJugador;
    
    public TiendaCompra(Partida partida){
        this.partida = partida;
        this.crJugador = partida.getJugador().getCreditosGalacticos();
    }
    
    public boolean validarCompraNave(Nave naveComprada){
        int precioDeNave = naveComprada.getPrecioDeNave();
        if(crJugador >= precioDeNave){
            partida.getJugador().getInventarioNaves().agregarNavesInventario(naveComprada);
            partida.getJugador().setCreditosGalacticos(crJugador - precioDeNave);
            return true;
        }else {
        return false ;
        }
    }
    
    public boolean validarCompraComponentes(ComponenteDeNave componenteComprado){
        int precioComponente = componenteComprado.getPrecioComponente();
        if(crJugador >= precioComponente) {
            partida.getJugador().getInventarioComponentes().agregarComponente(componenteComprado);
            partida.getJugador().setCreditosGalacticos(crJugador - precioComponente);
            return true;
        } else {
        return false;
        }
    }
    
    
    
}

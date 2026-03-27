/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.BaseEspacial;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Objetos.ObjetoPrincipal;
import com.mycompany.ParteLogica.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class TiendaCompra {
    
    private final Partida partida;
    
    public TiendaCompra(Partida partida){
        this.partida = partida;
    }
    
    public boolean validarCompraNave(Nave naveComprada){
       
        if( partida.getJugador().getCreditosGalacticos() >= naveComprada.getPrecioDeNave()){
            partida.getJugador().getInventarioNaves().agregarNavesInventario(naveComprada);
            partida.getJugador().setCreditosGalacticos( partida.getJugador().getCreditosGalacticos() - naveComprada.getPrecioDeNave());
            return true;
        }else {
        return false ;
        }
    }
    
    public boolean validarCompraComponentes(ComponenteDeNave componenteComprado){
      
        if( partida.getJugador().getCreditosGalacticos() >= componenteComprado.getPrecioComponente()) {
            partida.getJugador().getInventarioComponentes().agregarComponente(componenteComprado);
            partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() - componenteComprado.getPrecioComponente());
            return true;
        } else {
        return false;
        }
    }
    
    public boolean validarObjetos(ObjetoPrincipal objeto){
        if( partida.getJugador().getCreditosGalacticos() >= objeto.getPrecioDeObjeto()){
            partida.getJugador().getInventarioObjetos().agregarObjeto(objeto);
            partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() - objeto.getPrecioDeObjeto());
            return true;
        } else {
            return false;
        }
    }
    
    
}

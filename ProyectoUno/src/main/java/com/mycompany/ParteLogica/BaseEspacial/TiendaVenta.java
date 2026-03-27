/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.BaseEspacial;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Objetos.ObjetoPrincipal;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteLogica.Pilotos.Piloto;

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
    
    
    
    public ComponenteDeNave venderComponentes(int opcion){
        ComponenteDeNave componenteVendido = partida.getJugador().getInventarioComponentes().eliminarComponente(opcion);
        int precioObtendio = componenteVendido.getPrecioDeVenta();
        partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() + precioObtendio);
        return componenteVendido;
    }
    
    public Nave venderNaves(int opcion){
        Nave naveVendida = partida.getJugador().getInventarioNaves().eliminarNave(opcion);
        int precioObtenido = naveVendida.getPrecioDeVenta();
        partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() + precioObtenido);
        return naveVendida;
    }
    
    public Piloto venderPilotos(int opcion){
        Piloto pilotoVendido = partida.getJugador().getInventarioPilotos().eliminarObjeto(opcion);
        int precioObtenido = pilotoVendido.getPrecioDeVenta();
        partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() + precioObtenido);
        return pilotoVendido;
    }
    
    public ObjetoPrincipal venderObjetos(int opcion){
        ObjetoPrincipal objetoVendido = partida.getJugador().getInventarioObjetos().eliminarObjeto(opcion);
        int precioOtenido = objetoVendido.getPrecioDeVenta();
        partida.getJugador().setCreditosGalacticos(partida.getJugador().getCreditosGalacticos() + precioOtenido);
        return objetoVendido;
    }
    
}

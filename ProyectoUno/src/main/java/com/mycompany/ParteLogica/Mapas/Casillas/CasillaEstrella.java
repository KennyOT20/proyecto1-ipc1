/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Mapas.Casillas;

import com.mycompany.ParteLogica.Mapas.Mapas.MapaDeEstrella;
import com.mycompany.ParteVisual.Menus.MenusDePartida.MenuPartidaInicial;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenusDePartida.MenuMapaEstellar;

/**
 *
 * @author Kenny
 */
public class CasillaEstrella extends CasillaModelo {

    private final MapaDeEstrella mapaEstelar;
    private final MenuPartidaInicial menuInicial;
    private int cantidadFilas;
    private int cantidadColumnas;
    private boolean mapaCreado = false;
    
    public CasillaEstrella(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla, partida);
        
        this.cantidadFilas = partida.getMapaGalactico().getCantidadFilas() / 2 + partida.getJugador().getPosicionY();
        this.cantidadColumnas = partida.getMapaGalactico().getCantidadColumnas() / 2 + partida.getJugador().getPosicionX();
        
        this.mapaEstelar = new MapaDeEstrella(cantidadFilas, cantidadColumnas, partida);
        this.menuInicial = new MenuPartidaInicial(partida);
    }

@Override
    public void efectoDeCasilla() {
        MenuMapaEstellar menuEstellar = new MenuMapaEstellar(getPartida(), mapaEstelar);
        
        if (!mapaCreado) {
      
            mapaEstelar.generarMapa(); 
            mapaCreado = true;
        }

        menuEstellar.mostrarSimbologia();
        mapaEstelar.imprimirMapa();
        menuEstellar.mostrarInformacion();
    }
    
}

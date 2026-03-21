/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Casillas;

import com.mycompany.Mapas.Mapas.MapaDeEstrella;
import com.mycompany.Menus.MenusDePartida.MenuPartidaInicial;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class CasillaEstrella extends CasillaModelo{

    private final MapaDeEstrella mapaEstelar;
    private final MenuPartidaInicial menuInicial;
    private int cantidadFilas;
    private int cantidadColumnas;
    private final String SIMBOLO_WARP = "↩";
    
    
    public CasillaEstrella(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla, partida);
        this.cantidadColumnas = partida.getMapaGalactico().getCantidadFilas()/2 + partida.getJugador().getPosicionX();
        this.cantidadFilas = partida.getMapaGalactico().getCantidadFilas()/2 +partida.getJugador().getPosicionY();
        this.mapaEstelar = new MapaDeEstrella(cantidadFilas, cantidadColumnas, partida);
        this.menuInicial = new MenuPartidaInicial(partida);
    }

    @Override
    public void efectoDeCasilla() {
         mapaEstelar.generarMapa(1, SIMBOLO_WARP);
         menuInicial.mostrarSimbologia();
         mapaEstelar.imprimirMapa();
         menuInicial.mostrarInformacion();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Mapas.Casillas;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenusDePartida.MenuPartidaInicial;

/**
 *
 * @author Kenny
 */
public class CasillaWarp extends CasillaModelo {

    private final MenuPartidaInicial menuInicial;
    
    
    public CasillaWarp(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla, partida);
        this.menuInicial = new MenuPartidaInicial(partida);
    }

    @Override
    public void efectoDeCasilla() {
        menuInicial.mostrarSimbologia();
        getPartida().getMapaGalactico().imprimirMapa();
        menuInicial.mostrarInformacion();
    }
    
}

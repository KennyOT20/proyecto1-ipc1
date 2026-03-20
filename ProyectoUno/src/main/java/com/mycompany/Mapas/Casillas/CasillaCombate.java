/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Casillas;

import com.mycompany.Enemigos.Batalla;
import com.mycompany.Partida.Partida;


/**
 *
 * @author Kenny
 */
public class CasillaCombate extends CasillaModelo {

    private final Batalla batalla;
    public CasillaCombate(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla,  partida);
        this.batalla = new Batalla(partida.getJugador());
    }

    @Override
    public void efectoDeCasilla() {
         batalla.batallaRandom();
    }
    
}

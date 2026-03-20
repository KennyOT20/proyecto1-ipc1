/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Casillas;

import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class CasillaNormal extends CasillaModelo
{

    public CasillaNormal(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla, partida);
    }

    @Override
    public void efectoDeCasilla() {
        System.out.println("Casilla normal, siga avanzando");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Mapas.Casillas;

import com.mycompany.ParteLogica.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class CasillaBaseEnemiga  extends CasillaModelo{

    public CasillaBaseEnemiga(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla, partida);
    }

    @Override
    public void efectoDeCasilla() {
        System.out.println("Nafa");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Casillas;

import com.mycompany.Menus.MenuBaseEspacial.MenuBaseInicial;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class CasillaEstacionEspacial extends CasillaModelo {

    private final MenuBaseInicial menuBaseInicial;
    
    public CasillaEstacionEspacial(String simboloCasilla, String colorCasilla, Partida partida) {
        super(simboloCasilla, colorCasilla, partida);
        this.menuBaseInicial = new MenuBaseInicial(partida);
    }

    @Override
    public void efectoDeCasilla() {
         menuBaseInicial.mostrarInformacion();
    }
    
}

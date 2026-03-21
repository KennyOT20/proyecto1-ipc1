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
public abstract class CasillaModelo {
    
    private final Partida partida;
    private String simboloCasilla;
    private String colorCasilla;
    private String SIMBOLO_FLOTA =  "▲";

    public CasillaModelo(String simboloCasilla, String colorCasilla, Partida partida){
        this.simboloCasilla = simboloCasilla;
        this.colorCasilla = colorCasilla;
        this.partida = partida;
    }
    
    public abstract void efectoDeCasilla();
    
    public String getSimboloCasilla() {
        return simboloCasilla;
    }

    public String getColorCasilla() {
        return colorCasilla;
    }

    public String getSIMBOLO_FLOTA() {
        return SIMBOLO_FLOTA;
    }

    public Partida getPartida() {
        return partida;
    }
    
    
    
    
}

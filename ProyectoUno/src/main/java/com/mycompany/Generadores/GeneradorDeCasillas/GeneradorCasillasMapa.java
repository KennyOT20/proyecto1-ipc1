/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeCasillas;

import com.mycompany.Mapas.Casillas.CasillaBaseEnemiga;
import com.mycompany.Mapas.Casillas.CasillaCombate;
import com.mycompany.Mapas.Casillas.CasillaEstacionEspacial;
import com.mycompany.Mapas.Casillas.CasillaEstrella;
import com.mycompany.Mapas.Casillas.CasillaModelo;
import com.mycompany.Mapas.Casillas.CasillaNormal;
import com.mycompany.Mapas.Casillas.CasillaWarp;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class GeneradorCasillasMapa {
    
    private final Partida partida;
    
    public GeneradorCasillasMapa(Partida partida){
        this.partida = partida;
    }
    
    // Colores para las casillas
    private final String AZUL = "\u001B[34m";
    private final String ROJO = "\u001B[31m";
    private final String AMARILLO = "\u001B[33m";
    private final String MORADO = "\u001B[35m";
    private final String BLANCO = "\u001B[37m";
    
    //Simbolos para las casillas 
    
    private final String SIMBOLO_ESTRELLA = "★";
    private final String SIMBOLO_COMBATE = "⚔";
    private final String SIMBOLO_ESTACION = "⚙";
    private final String SIMBOLO_WARP = "↩";
    private final String SIMBOLO_NORMAL = "✦";
    private final String SIMBOLO_BASE = "☣";
    
    /**
     * Metodos encargados de ir creando las casillas, recibe como parametros:
     * String simboloCasilla, String colorCasilla
     * @return 
     */
    public CasillaModelo crearCasillaNormal(){
        return new CasillaNormal( SIMBOLO_NORMAL, AZUL, partida);
    }
    
    public CasillaModelo crearCasillaWarp(){
        return new CasillaWarp(SIMBOLO_WARP, AZUL, partida );
    }
    
    public CasillaModelo crearCasillaEstrella(){
        return new CasillaEstrella(SIMBOLO_ESTRELLA, BLANCO, partida);
    }
    
    public CasillaModelo crearCasillaEstacion(){
        return new CasillaEstacionEspacial(SIMBOLO_ESTACION, MORADO, partida);
    }
    
    public CasillaModelo crearCasillaCombate(){
        return new CasillaCombate(SIMBOLO_COMBATE, ROJO, partida);
    }
    
    public CasillaModelo crearCasillaBase(){
        return new CasillaBaseEnemiga(SIMBOLO_BASE, AMARILLO, partida);
    }
    
}

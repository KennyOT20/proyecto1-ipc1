/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores;

import com.mycompany.Mapas.Casillas.CasillaBaseEnemiga;
import com.mycompany.Mapas.Casillas.CasillaCombate;
import com.mycompany.Mapas.Casillas.CasillaEstacionEspacial;
import com.mycompany.Mapas.Casillas.CasillaEstrella;
import com.mycompany.Mapas.Casillas.CasillaModelo;
import com.mycompany.Mapas.Casillas.CasillaNormal;
import com.mycompany.Mapas.Casillas.CasillaWarp;

/**
 *
 * @author Kenny
 */
public class GeneradorCasillasMapa {
    
    // Colores para las casillas
    private final String COLOR_CASILLA_ESTRELLA= "\u001B[40m"; // color negro para casilla estrekka
    private final String COLOR_CASILLA_BASE_ENEMIGA = "\u001B[33m"; // color amarillo para casilla de base enemiga
    private final String COLOR_CASILLA_COMBATE = "\u001B[41m"; // color rojo para casilla combate
    private final String COLOR_CASILLA_ESTACION = " \u001B[45m"; // color morado para casilla estacion espacial
    private final String COLOR_CASILLA_NORMAL = "\u001B[44m"; //  color azul para casilla normal
    private final String COLOR_CASILLA_WARP =   "\u001B[47m"; // color blanco para casilla warp
    
    //Simbolos para las casillas 
    
    private final String SIMBOLO_ESTRELLA = "☠";
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
        return new CasillaNormal( SIMBOLO_NORMAL, COLOR_CASILLA_NORMAL);
    }
    
    public CasillaModelo crearCasillaWarp(){
        return new CasillaWarp(SIMBOLO_WARP, COLOR_CASILLA_WARP);
    }
    
    public CasillaModelo crearCasillaEstrella(){
        return new CasillaEstrella(SIMBOLO_ESTRELLA, COLOR_CASILLA_ESTRELLA);
    }
    
    public CasillaModelo crearCasillaEstacion(){
        return new CasillaEstacionEspacial(SIMBOLO_ESTACION, COLOR_CASILLA_ESTACION);
    }
    
    public CasillaModelo crearCasillaCombate(){
        return new CasillaCombate(SIMBOLO_COMBATE, COLOR_CASILLA_COMBATE);
    }
    
    public CasillaModelo crearCasillaBase(){
        return new CasillaBaseEnemiga(SIMBOLO_BASE, COLOR_CASILLA_BASE_ENEMIGA);
    }
    
}

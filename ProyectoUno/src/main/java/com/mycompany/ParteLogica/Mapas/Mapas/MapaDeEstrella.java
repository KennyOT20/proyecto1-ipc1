/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Mapas.Mapas;

import com.mycompany.ParteLogica.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MapaDeEstrella extends MapaBase {

    public MapaDeEstrella(int cantidadFilas, int cantidadColumnas, Partida partida) {
        super(cantidadFilas, cantidadColumnas, partida);
    }

    public void generarMapa() {
        int cantEstrellas = 0; 
        int cantWarps = 1;   
        int cantBases = 1;  
        
        int cantEstaciones = getRandom().calcularNumeroAleatorios(5, 10); 
        int cantCombates = getRandom().calcularNumeroAleatorios(2, 9);   

       generarMapa(cantEstrellas, cantWarps, cantBases, cantEstaciones, cantCombates);
    }
}

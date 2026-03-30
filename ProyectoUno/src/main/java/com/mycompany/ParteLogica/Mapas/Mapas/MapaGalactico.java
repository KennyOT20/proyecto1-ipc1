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
public class MapaGalactico extends MapaBase {

    public MapaGalactico(int cantidadFilas, int cantidadColumnas, Partida partida) {
        super(cantidadFilas, cantidadColumnas, partida);
    }

  public void generarMapa() {
      
        int cantEstrellas = getRandom().calcularNumeroAleatorios(2, 5);
        int cantBases = getRandom().calcularNumeroAleatorios(4, 7); 
        int cantWarps = 0;                                     
     
        int cantEstaciones = getRandom().calcularNumeroAleatorios(20, 30); 
        int cantCombates = getRandom().calcularNumeroAleatorios(30, 45);   

       generarMapa(cantEstrellas, cantWarps, cantBases, cantEstaciones, cantCombates);
    }
}

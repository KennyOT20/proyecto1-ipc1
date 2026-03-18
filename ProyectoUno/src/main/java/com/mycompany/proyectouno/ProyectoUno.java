/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectouno;

import com.mycompany.Mapas.Mapas.MapaGalactico;



/**
 *
 * @author Kenny
 */
public class ProyectoUno {

    public static void main(String[] args) {
        /*MenuInicial menuInicial = new MenuInicial();
        menuInicial.mostrarInformacion();
        menuInicial.validarOpcion();*/
        
        MapaGalactico mapa = new MapaGalactico(5, 5);
        mapa.generarMapa();
        mapa.imprimirMapa();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Arriba");
        mapa.calcularMovimientos("W");
        mapa.imprimirMapa();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Derecha");
        mapa.calcularMovimientos("D");
        mapa.imprimirMapa();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Izquierda");
        mapa.calcularMovimientos("A");
        mapa.imprimirMapa();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Abajo");
        mapa.calcularMovimientos("S");
        mapa.imprimirMapa();
        
    }
}

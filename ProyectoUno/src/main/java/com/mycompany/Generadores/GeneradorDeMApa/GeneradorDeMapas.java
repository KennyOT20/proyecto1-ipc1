/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeMApa;

import com.mycompany.Controladores.ControladorDeRandom.ControladorRandom;
import com.mycompany.Mapas.Mapas.MapaBase;
import com.mycompany.Mapas.Mapas.MapaDeEstrella;
import com.mycompany.Mapas.Mapas.MapaGalactico;

/**
 *
 * @author Kenny
 */
public class GeneradorDeMapas {
    
    private final ControladorRandom random;
    private int cantidadDeFilas;
    private int cantidadColumnas;
    
    public GeneradorDeMapas(){
        this.random = new ControladorRandom();
    }
    
    public MapaBase crearMapaGalactico(){
        cantidadDeFilas = random.calcularNumeroAleatorios(25, 30);
        cantidadColumnas = random.calcularNumeroAleatorios(25, 30);
        return new MapaGalactico(cantidadDeFilas, cantidadColumnas);
    }
    
    public MapaBase crearMapaEstrella(){
        cantidadDeFilas = random.calcularNumeroAleatorios(10, 15);
        cantidadColumnas = random.calcularNumeroAleatorios(10, 15);
        return new MapaDeEstrella(cantidadDeFilas, cantidadColumnas);
    }
}

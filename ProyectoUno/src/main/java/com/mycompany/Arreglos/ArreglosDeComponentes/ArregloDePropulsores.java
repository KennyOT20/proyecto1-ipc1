/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDePropulsores;


/**
 *
 * @author Kenny
 */
public class ArregloDePropulsores extends ArregloDeComponentes {

    private final GeneradorDePropulsores crearPropulsor;
    
    public ArregloDePropulsores() {
        super(4);
        this.crearPropulsor = new GeneradorDePropulsores();
    }

    @Override
    public void crearArreglo() {
        getArregloDeComponentes()[1] = crearPropulsor.crearMicroPropulsor();
        getArregloDeComponentes()[2] = crearPropulsor.crearPropulsorCuantico();
        getArregloDeComponentes()[3] = crearPropulsor.crearSistemaDeManiobra();
        getArregloDeComponentes()[4] = crearPropulsor.crearTurboCompresor();
    }

    
    
}

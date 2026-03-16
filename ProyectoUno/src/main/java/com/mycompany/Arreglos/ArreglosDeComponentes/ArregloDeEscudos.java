/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeEscudos;

/**
 *
 * @author Kenny
 */
public class ArregloDeEscudos extends ArregloDeComponentes {

    private final GeneradorDeEscudos crearEscudo;
    
    public ArregloDeEscudos() {
        super(5);
        this.crearEscudo = new GeneradorDeEscudos();
    }

    @Override
    public void crearArreglo() {
        getArregloDeComponentes()[1] = crearEscudo.crearCampoDeflexion();
        getArregloDeComponentes()[2] = crearEscudo.crearEscudoReforzado();
        getArregloDeComponentes()[3] = crearEscudo.crearGeneradorDeOndas();
        getArregloDeComponentes()[4] = crearEscudo.crearNucleoDeEnergia();
        getArregloDeComponentes()[5] = crearEscudo.crearPantallaDeAsteroides();
    }

    
}

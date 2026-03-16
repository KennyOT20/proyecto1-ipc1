/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeSistemasDeApoyo;


/**
 *
 * @author Kenny
 */
public class ArregloDeSistemas extends ArregloDeComponentes {

    private final GeneradorDeSistemasDeApoyo crearSistema;

    public ArregloDeSistemas() {
        super(5);
        this.crearSistema = new GeneradorDeSistemasDeApoyo();
    }

    @Override
    public void crearArreglo() {
        getArregloDeComponentes()[0] = crearSistema.crearCampoDistorcion();
        getArregloDeComponentes()[1] = crearSistema.crearCamuflajeTactico();
        getArregloDeComponentes()[2] = crearSistema.crearDronDeReparacion();
        getArregloDeComponentes()[3] = crearSistema.crearGeneradorDeEscudo();
        getArregloDeComponentes()[4] = crearSistema.crearNucleoDeSobreCarga();
    }
    
    
    
}

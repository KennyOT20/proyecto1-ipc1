/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArregloDeObjetos;

import com.mycompany.Generadores.GeneradorDeObjetos.GeneradoObjetosReparacion.GeneradorObjetosReparacion;

/**
 *
 * @author Kenny
 */
public class ArregloObjetosReparacion extends ArregloDeObjetos {

    private final GeneradorObjetosReparacion generarObjeto;
    
    public ArregloObjetosReparacion() {
        super(4);
        this.generarObjeto = new GeneradorObjetosReparacion();
    }

    @Override
    public void generarArregloDeObjetos() {
        getObjetos()[0] = generarObjeto.crearDeflectorReparacion();
        getObjetos()[1] = generarObjeto.crearDinamoReparacion();
        getObjetos()[2] = generarObjeto.crearDroideReparacion();
        getObjetos()[3] = generarObjeto.crearReactorReparativo();
    }
    
}

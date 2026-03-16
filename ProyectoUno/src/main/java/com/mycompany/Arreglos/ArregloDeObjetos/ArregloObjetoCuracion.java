/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArregloDeObjetos;

import com.mycompany.Generadores.GeneradorDeObjetos.GeneradorObjetosCuracion.GeneradorObjetosCuracion;

/**
 *
 * @author Kenny
 */
public class ArregloObjetoCuracion extends ArregloDeObjetos{

    private final GeneradorObjetosCuracion crearCuracion;
    
    public ArregloObjetoCuracion() {
        super(3);
        this.crearCuracion = new GeneradorObjetosCuracion();
    }

    @Override
    public void generarArregloDeObjetos() {
        getObjetos()[0] = crearCuracion.crearDroideCuracion();
        getObjetos()[1] = crearCuracion.crearHttps5();
        getObjetos()[2] = crearCuracion.crearIsotope5();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArregloDeObjetos;

import com.mycompany.Generadores.GeneradorDeObjetos.GeneradorDeObjetosDeEscape.GeneradorDeObjetosDeEscape;

/**
 *
 * @author Kenny
 */
public class ArregloObjetosEscape extends ArregloDeObjetos {

    private final GeneradorDeObjetosDeEscape crearObjetoDeEscape;
            
    public ArregloObjetosEscape() {
        super(3);
        this.crearObjetoDeEscape = new GeneradorDeObjetosDeEscape();
    }

    @Override
    public void generarArregloDeObjetos() {
        getObjetos()[0] = crearObjetoDeEscape.crearCoaxium();
        getObjetos()[1] = crearObjetoDeEscape.crearHyppermatter();
        getObjetos()[2] = crearObjetoDeEscape.crearRydhonium();
    }
    
}

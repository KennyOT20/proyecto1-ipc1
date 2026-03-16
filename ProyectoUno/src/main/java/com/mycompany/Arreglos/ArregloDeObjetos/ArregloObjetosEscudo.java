/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArregloDeObjetos;

import com.mycompany.Generadores.GeneradorDeObjetos.GeneradorObjetoEscudo.GeneradorObjetosEscudo;

/**
 *
 * @author Kenny
 */
public class ArregloObjetosEscudo extends ArregloDeObjetos {

    private final GeneradorObjetosEscudo crearEscudo;
    
    
    public ArregloObjetosEscudo() {
        super(3);
        this.crearEscudo = new GeneradorObjetosEscudo();
    }

    @Override
    public void generarArregloDeObjetos() {
        getObjetos()[0] = crearEscudo.crearEscudoDeHierro();
        getObjetos()[1] = crearEscudo.crearEscudoRegenerativo();
        getObjetos()[2] = crearEscudo.crearSuperEscudo();
    }
    
}

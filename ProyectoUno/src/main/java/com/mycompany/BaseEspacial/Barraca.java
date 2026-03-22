/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BaseEspacial;

import com.mycompany.Arreglos.ArregloDePilotos.ArregloDePilotos;

/**
 *
 * @author Kenny
 */
public class Barraca {
    private final ArregloDePilotos pilotos;
    
    public Barraca(){
        this.pilotos = new ArregloDePilotos();
        pilotos.generarArregloPiloto();
    }
    

    public ArregloDePilotos getPilotos() {
        return pilotos;
    }
    
    
}

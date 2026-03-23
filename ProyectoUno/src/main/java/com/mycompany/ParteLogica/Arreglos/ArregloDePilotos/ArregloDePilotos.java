/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Arreglos.ArregloDePilotos;

import com.mycompany.ParteLogica.Generadores.GeneradorDePilotos.GeneradorDePilotos;
import com.mycompany.ParteLogica.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class ArregloDePilotos {
    
    private final GeneradorDePilotos crearPiloto;
    private final Piloto arregloDePilotos[]; 
    
    public ArregloDePilotos(){
        this.crearPiloto = new GeneradorDePilotos();
        this.arregloDePilotos = new Piloto[4];
    }
    
    public void generarArregloPiloto(){
        arregloDePilotos[0] = crearPiloto.crearAce();
        arregloDePilotos[1] = crearPiloto.crearComandante();
        arregloDePilotos[2] = crearPiloto.crearEstratega();
        arregloDePilotos[3] = crearPiloto.crearIngeniero();
    }

    public Piloto[] getArregloDePilotos() {
        return arregloDePilotos;
    }
    
    
    
    
}

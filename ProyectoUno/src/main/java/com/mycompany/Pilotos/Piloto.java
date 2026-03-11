/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pilotos;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public abstract class Piloto {
    
    private String nombrePiloto;
    private int nivel;
    private int puntosDeExperiencia;
    private int puntosDeEstrategia;
    private int puntosDePilotaje;
    private int puntosDeIngenieria;
    private int puntosDeLiderazgo;
    private int puntosDeResistencia;

    public Piloto(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje, int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia) {
        this.nombrePiloto = nombrePiloto;
        this.nivel = nivel;
        this.puntosDeExperiencia = puntosDeExperiencia;
        this.puntosDeEstrategia = puntosDeEstrategia;
        this.puntosDePilotaje = puntosDePilotaje;
        this.puntosDeIngenieria = puntosDeIngenieria;
        this.puntosDeLiderazgo = puntosDeLiderazgo;
        this.puntosDeResistencia = puntosDeResistencia;
    }

    public void subirNivel(){
      
    }
    
    public abstract void bonificacion();
    public abstract void aplicarHabilidadPiloto(Nave navePiloteada);
    
}

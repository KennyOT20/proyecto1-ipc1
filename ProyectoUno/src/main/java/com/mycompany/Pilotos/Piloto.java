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
    public abstract void aplicarHabilidadPiloto(Nave nave);

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeExperiencia() {
        return puntosDeExperiencia;
    }

    public void setPuntosDeExperiencia(int puntosDeExperiencia) {
        this.puntosDeExperiencia = puntosDeExperiencia;
    }

    public int getPuntosDeEstrategia() {
        return puntosDeEstrategia;
    }

    public void setPuntosDeEstrategia(int puntosDeEstrategia) {
        this.puntosDeEstrategia = puntosDeEstrategia;
    }

    public int getPuntosDePilotaje() {
        return puntosDePilotaje;
    }

    public void setPuntosDePilotaje(int puntosDePilotaje) {
        this.puntosDePilotaje = puntosDePilotaje;
    }

    public int getPuntosDeIngenieria() {
        return puntosDeIngenieria;
    }

    public void setPuntosDeIngenieria(int puntosDeIngenieria) {
        this.puntosDeIngenieria = puntosDeIngenieria;
    }

    public int getPuntosDeLiderazgo() {
        return puntosDeLiderazgo;
    }

    public void setPuntosDeLiderazgo(int puntosDeLiderazgo) {
        this.puntosDeLiderazgo = puntosDeLiderazgo;
    }

    public int getPuntosDeResistencia() {
        return puntosDeResistencia;
    }

    public void setPuntosDeResistencia(int puntosDeResistencia) {
        this.puntosDeResistencia = puntosDeResistencia;
    }
}

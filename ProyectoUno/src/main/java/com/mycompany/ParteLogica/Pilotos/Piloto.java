/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Pilotos;

import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public abstract class Piloto {
    
    private ControladorRandom random;
    private String nombrePiloto;
    private int nivel;
    private int puntosDeExperiencia;
    private int puntosDeEstrategia;
    private int puntosDePilotaje;
    private int puntosDeIngenieria;
    private int puntosDeLiderazgo;
    private int puntosDeResistencia;
    private int precioPiloto;
    private int precioDeVenta;
    

    public Piloto(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje, int puntosDeIngenieria, 
            int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        this.nombrePiloto = nombrePiloto;
        this.nivel = nivel;
        this.puntosDeExperiencia = puntosDeExperiencia;
        this.puntosDeEstrategia = puntosDeEstrategia;
        this.puntosDePilotaje = puntosDePilotaje;
        this.puntosDeIngenieria = puntosDeIngenieria;
        this.puntosDeLiderazgo = puntosDeLiderazgo;
        this.puntosDeResistencia = puntosDeResistencia;
        this.precioPiloto = precioPiloto;
        this.random = new ControladorRandom();
        calcularPrecioVenta();
    }


    public void subirNivel(){
      
    }
    
    public final void calcularPrecioVenta(){
        int precio = puntosDeExperiencia * 2 + puntosDeEstrategia *3 ;
        precioDeVenta = precio + random.calcularNumeroAleatorios(0, precioPiloto);
    }
    
    public abstract void bonificacion();
    public abstract void aplicarHabilidadPiloto(Nave nave);

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeExperiencia() {
        return puntosDeExperiencia;
    }

    public int getPuntosDeEstrategia() {
        return puntosDeEstrategia;
    }

    public int getPuntosDePilotaje() {
        return puntosDePilotaje;
    }

    public int getPuntosDeIngenieria() {
        return puntosDeIngenieria;
    }

    public int getPuntosDeLiderazgo() {
        return puntosDeLiderazgo;
    }

    public int getPuntosDeResistencia() {
        return puntosDeResistencia;
    }

    public int getPrecioPiloto() {
        return precioPiloto;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPuntosDeExperiencia(int puntosDeExperiencia) {
        this.puntosDeExperiencia = puntosDeExperiencia;
    }

    public void setPuntosDeEstrategia(int puntosDeEstrategia) {
        this.puntosDeEstrategia = puntosDeEstrategia;
    }

    public void setPuntosDePilotaje(int puntosDePilotaje) {
        this.puntosDePilotaje = puntosDePilotaje;
    }

    public void setPuntosDeIngenieria(int puntosDeIngenieria) {
        this.puntosDeIngenieria = puntosDeIngenieria;
    }

    public void setPuntosDeLiderazgo(int puntosDeLiderazgo) {
        this.puntosDeLiderazgo = puntosDeLiderazgo;
    }

    public void setPuntosDeResistencia(int puntosDeResistencia) {
        this.puntosDeResistencia = puntosDeResistencia;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    
    
}

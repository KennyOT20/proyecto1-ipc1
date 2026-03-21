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
public class Comandante extends Piloto {

    public Comandante(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, 
            int puntosDePilotaje, int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, 
                puntosDeIngenieria, puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
    }

    @Override
    public void bonificacion() {
         setPuntosDeIngenieria(getPuntosDeIngenieria() + 2);
         setPuntosDeEstrategia(getPuntosDeEstrategia() + 1);
         setPuntosDeLiderazgo(getPuntosDeLiderazgo() + 1);
         setPuntosDePilotaje(getPuntosDePilotaje() + 1);
         setPuntosDeResistencia(getPuntosDeResistencia() + 1);
    }

    @Override
    public void aplicarHabilidadPiloto(Nave navePiloteada) {
    }
    
}

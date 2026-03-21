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
public class Ace extends Piloto {

    public Ace(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje,
            int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, puntosDeIngenieria,
                puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
    }

    @Override
    public void bonificacion() {
        int puntosPilotaje =+ 3;
        setPuntosDePilotaje(puntosPilotaje); 
    }
    
    private void bonificacionNave(Nave navePiloteada){
        int puntosSP = 2;
        navePiloteada.setVelocidad(navePiloteada.getVelocidad() +  puntosSP);
    }
    

    @Override
    public void aplicarHabilidadPiloto(Nave navePiloteada) {
      double probabilidadExtra = 0.60;
      navePiloteada.setEvasionBase(probabilidadExtra);
    }
    
}

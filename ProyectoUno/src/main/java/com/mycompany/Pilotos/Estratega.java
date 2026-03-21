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
public class Estratega extends Piloto {

    private final int turnoPerdido; 
    private final int turnoEnfriamiento;
    
    public Estratega(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, 
            int puntosDePilotaje, int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, 
                puntosDeIngenieria, puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
        this.turnoPerdido = 1;
        this.turnoEnfriamiento = 1;
    }

    @Override
    public void bonificacion() {
        int puntosEstrategia =  3;
        int puntosLiderazgo = 1;
        
        setPuntosDeEstrategia(puntosEstrategia);
        setPuntosDeLiderazgo(puntosLiderazgo);        
    }

    @Override
    public void aplicarHabilidadPiloto(Nave naveEnemiga) {
    }
    
    

    public int getTurnoPerdido() {
        return turnoPerdido;
    }

    public int getTurnoEnfriamiento() {
        return turnoEnfriamiento;
    }
    
    
    
}

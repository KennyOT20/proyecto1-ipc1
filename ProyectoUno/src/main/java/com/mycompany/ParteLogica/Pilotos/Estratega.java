/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Pilotos;

import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class Estratega extends Piloto {

    private final int turnoEnfriamiento;
    private int enfriamientoActual; 
    
    public Estratega(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, 
            int puntosDePilotaje, int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, 
                puntosDeIngenieria, puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
        this.turnoEnfriamiento = 1;
        this.enfriamientoActual = 0;
    }

    @Override
    public void bonificacion() {
        setPuntosDeEstrategia(getPuntosDeEstrategia() + 3);
        setPuntosDeLiderazgo(getPuntosDeLiderazgo() + 1);
        
        System.out.println("El Estratega ha subido de nivel. Recibe +3 en Estrategia y +1 en Liderazgo.");
    }

    @Override
    public void aplicarHabilidadPiloto(Nave naveEnemiga) {
        if (enfriamientoActual == 0) {
            naveEnemiga.setPierdeTurno(true);
            enfriamientoActual = turnoEnfriamiento;
            
            System.out.println("Habilidad Retardo aplicada. La nave enemiga perdera su proximo turno.");
        } else {
            System.out.println("La habilidad Retardo no esta disponible. Faltan " + enfriamientoActual + " turnos de enfriamiento.");
        }
    }
    
    public void reducirEnfriamiento() {
        if (enfriamientoActual > 0) {
            enfriamientoActual--;
            if (enfriamientoActual == 0) {
                System.out.println("La habilidad Retardo del Estratega esta lista.");
            }
        }
    }

    public int getTurnoEnfriamiento() {
        return turnoEnfriamiento;
    }
    
    public int getEnfriamientoActual() {
        return enfriamientoActual;
    }
}
    
    


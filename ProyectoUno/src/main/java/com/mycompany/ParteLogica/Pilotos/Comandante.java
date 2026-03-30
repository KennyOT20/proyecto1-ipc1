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
public class Comandante extends Piloto {

    private boolean ordenDeAtaqueUsada;
    
    public Comandante(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, 
            int puntosDePilotaje, int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, 
                puntosDeIngenieria, puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
        this.ordenDeAtaqueUsada = false;
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
        
        if (!ordenDeAtaqueUsada) {
            
         
            navePiloteada.setTurnoExtra(true); 
            
            ordenDeAtaqueUsada = true;
            
            System.out.println("" + getNombrePiloto() + " Orden de ataque activado");
            System.out.println(" La nave aliada recibe un turno adicional inmediato.");
            
        } else {
            System.out.println("El Comandante ya utiliz0 su Orden de Ataque en este combate.");
        }
    }

    public void reiniciarHabilidadCombate() {
        this.ordenDeAtaqueUsada = false;
    }

}

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
public class Ingeniero extends Piloto{

    private final int  turnosEnfriamiento;
    
    public Ingeniero(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje,
            int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, puntosDeIngenieria, 
                puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
        this.turnosEnfriamiento = 2;
    }

    @Override
    public void bonificacion() {
        int puntosIngeniero = 3;
        setPuntosDeIngenieria(getPuntosDeIngenieria() + puntosIngeniero);
    }

    @Override
    public void aplicarHabilidadPiloto(Nave naveElegida) {
        int hpRecuperado = naveElegida.getVidaMax();
        
        naveElegida.setPuntosDeVida(naveElegida.getPuntosDeVida() + hpRecuperado);
    }
    
}

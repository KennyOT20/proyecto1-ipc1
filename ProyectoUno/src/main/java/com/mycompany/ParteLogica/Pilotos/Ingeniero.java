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
public class Ingeniero extends Piloto{
    
    private final int TURNOS_ENFRIAMIENTO_TOTAL = 2;
    private int enfriamientoActual;
    
    public Ingeniero(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje,
            int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, puntosDeIngenieria, 
                puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
        this.enfriamientoActual = 0;
    }

   @Override
    public void bonificacion() {
        setPuntosDeIngenieria(getPuntosDeIngenieria() + 3);
        System.out.println("Subida de nivel: Ingeniero gana +3 ING.");
    }
    
    public void bonificacionNave(Nave navePiloteada) {
        int bonoEscudo = 20; 
        navePiloteada.setEscudo(navePiloteada.getPuntosDeEscudoMax() + bonoEscudo);
        navePiloteada.setEscudo(navePiloteada.getEscudo() + bonoEscudo); 
        
        System.out.println("Subida de nivel: El Ingeniero ha mejorado los escudos de la nave en +" + bonoEscudo);
    }

    @Override
    public void aplicarHabilidadPiloto(Nave naveElegida) {
        
        if (enfriamientoActual == 0) {
            
            int hpRecuperado = (int) (naveElegida.getVidaMax() * 0.25);
            
            int vidaFutura = naveElegida.getPuntosDeVida() + hpRecuperado;
            if (vidaFutura > naveElegida.getVidaMax()) {
                vidaFutura = naveElegida.getVidaMax(); 
            }
            
            naveElegida.setPuntosDeVida(vidaFutura);
            
            enfriamientoActual = TURNOS_ENFRIAMIENTO_TOTAL;
            
            System.out.println("Ingeniero:  Reparacion de emergencia acticada");
            System.out.println(" Nave reparada en " + hpRecuperado + " HP. (Vida actual: " + vidaFutura + "/" + naveElegida.getVidaMax() + ")");
            
        } else {
            System.out.println("La habilidad del Ingeniero aún se está recargando. (Faltan " + enfriamientoActual + " turnos)");
        }
    }

    public void reducirEnfriamiento() {
        if (enfriamientoActual > 0) {
            enfriamientoActual--; 
            if (enfriamientoActual == 0) {
                System.out.println("Reparacion de emergencia del Ingeniero esta  lista para usarse");
            }
        }
    }
    
}

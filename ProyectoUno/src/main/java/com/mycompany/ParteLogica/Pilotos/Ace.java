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
public class Ace extends Piloto {

    public Ace(String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje,
            int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia, int precioPiloto) {
        super(nombrePiloto, nivel, puntosDeExperiencia, puntosDeEstrategia, puntosDePilotaje, puntosDeIngenieria,
                puntosDeLiderazgo, puntosDeResistencia, precioPiloto);
    }
    
    
    @Override
        public void bonificacion() {
            int puntosActuales = getPuntosDePilotaje();
            setPuntosDePilotaje(puntosActuales + 3);

            System.out.println("Subida de nivel" + getNombrePiloto()+ " (Ace) gana +3 PIL.");
        }

        public void bonificacionNave(Nave navePiloteada){
            int velocidadActual = navePiloteada.getVelocidad();
            navePiloteada.setVelocidad(velocidadActual + 2);

            System.out.println("Subida de nivel la nave: " + navePiloteada.getNombreDeNave() + " gana +2 sp por el piloto Ace");
        }

        @Override
        public void aplicarHabilidadPiloto(Nave navePiloteada) {
          
            navePiloteada.setEvasionTemporal(0.80);

            System.out.println( getNombrePiloto()+ ": Habilidad MANIOBRA activada");
            System.out.println("Evasión para el próximo ataque establecida en 80%.");
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Partida;

import com.mycompany.Personajes.PersonajeDeJugador;

/**
 *
 * @author Kenny
 */
public class Partida {
    
    private PersonajeDeJugador jugador;
    private String nombrePartida;
    
    public Partida(){
        this.jugador = new PersonajeDeJugador(2);
    }
    
    public void iniciarPartida(){
        
    }

    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }

    
    
    
    
    
}

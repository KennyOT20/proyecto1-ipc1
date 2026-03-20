/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Enemigos;

import com.mycompany.Personajes.PersonajeDelJugador;

/**
 *
 * @author Kenny
 */
public class Batalla {
    
    private final Enemigo enemigo;
    private final PersonajeDelJugador jugador;
    
    public Batalla(PersonajeDelJugador jugador){
        this.enemigo = new Enemigo();
        this.jugador = jugador;
    }
    
    public void batallaRandom(){
        enemigo.generarEnemigosRandom();
        System.out.println("Se ha generado una batalla");
        System.out.println("Naves de jugador: ");
        jugador.mostrarNaves();
        System.out.println("Naves jugador");
        enemigo.getPersonajeMaquina().mostrarNaves();
    }
    
    
}

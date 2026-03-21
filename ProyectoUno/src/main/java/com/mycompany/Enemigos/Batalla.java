/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Enemigos;

import com.mycompany.Menus.MenuBatalla.MenuBatalla;
import com.mycompany.Personajes.PersonajeDelJugador;

/**
 *
 * @author Kenny
 */
public class Batalla {
    
    private final PersonajeDelJugador jugador;
    private final MenuBatalla menuBatalla;
    
    public Batalla(PersonajeDelJugador jugador){
        this.jugador = jugador;
        this.menuBatalla = new MenuBatalla();
    }
    
    public void batallaRandom(){
        Enemigo enemigo = new Enemigo();
        enemigo.generarEnemigosRandom();
        System.out.println("Se ha generado una batalla");
        System.out.println("Naves de jugador: ");
        jugador.mostrarNaves();
        System.out.println("Naves de: " + enemigo.getPersonajeMaquina().getNombrePersonaje());
        enemigo.getPersonajeMaquina().mostrarNaves();
        menuBatalla.mostrarInformacion();
    }
    
    
}

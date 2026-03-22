/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Enemigos;

import com.mycompany.Menus.MenuBatalla.MenuBatalla;
import com.mycompany.Personajes.Jugador;

/**
 *
 * @author Kenny
 */
public class Batalla {
    
    private final Jugador jugador;
    private final MenuBatalla menuBatalla;
    
    public Batalla(Jugador jugador){
        this.jugador = jugador;
        this.menuBatalla = new MenuBatalla();
    }
    
    public void batallaRandom(){
        Enemigo enemigo = new Enemigo();
        enemigo.generarEnemigosRandom();
        System.out.println("Se ha generado una batalla");
        System.out.println("Naves de jugador: ");
        System.out.println("Naves de: " + enemigo.getPersonajeMaquina().getNombrePersonaje());
        menuBatalla.mostrarInformacion();
    }
    
    
}

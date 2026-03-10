/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores;

import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Naves.Nave;
import com.mycompany.Personajes.PersonajeDeJugador;

/**
 *
 * @author Kenny
 */
public class ControladorFlota {
    
    private final GeneradorDeNaves generarNaves;
    
    public ControladorFlota(){
        this.generarNaves = new GeneradorDeNaves();
    }
    
    public void asignarFlotaInicialJugador(PersonajeDeJugador personajeJugador){
        Nave fragata = generarNaves.crearFragata();
        personajeJugador.agregarNave(fragata);
    }
    
    public void asignarFlotaEnemigoRandom(){
        
    }
    
}

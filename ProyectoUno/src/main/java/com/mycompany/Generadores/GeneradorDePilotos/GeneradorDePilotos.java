/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDePilotos;

import com.mycompany.Pilotos.Ace;
import com.mycompany.Pilotos.Comandante;
import com.mycompany.Pilotos.Estratega;
import com.mycompany.Pilotos.Ingeniero;
import com.mycompany.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class GeneradorDePilotos {
    
    /**
     * Metodos encargados de crear a los pilotos, reciben como parametros los siguientes atributos:
     * String nombrePiloto, int nivel, int puntosDeExperiencia, int puntosDeEstrategia, int puntosDePilotaje,
     * int puntosDeIngenieria, int puntosDeLiderazgo, int puntosDeResistencia
     * @return 
     */
    
    public Piloto crearIngeniero(){
        return new Ingeniero("Ingeniero", 1, 0, 0, 0, 500, 0, 250, 800);
    }
    
    public Piloto crearEstratega(){
        return new Estratega("Estratega", 1, 0, 500, 0, 0, 0, 125, 450);
    }
    
    public Piloto crearAce(){
        return new Ace("Ace", 1, 0, 125, 500, 0, 0, 0 , 600); 
    }
    
    public Piloto crearComandante(){
        return new Comandante("Comandante", 1, 0, 125, 200, 175, 500, 120, 200);
    }
}

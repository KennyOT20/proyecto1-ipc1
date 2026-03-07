/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Personajes;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public abstract class Personaje {
    
    private String nombrePersonaje;
    Nave[] flotaObtenida; 

    public Personaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }
    
    
    
    public abstract void ejecutarOpcion(); 
    
}

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
public abstract class Piloto {
    
    private String nombrePiloto;
    private int puntosExperiencia;
    private int nivel;
    private int puntosDeEstrategia;
    private int puntosDeLiderazgo;
    private int puntosDeResistencia; 
    
    public void subirNivel(){
        nivel ++;   
    }
    
    public abstract void bonificacion();
    public abstract void aplicarHabilidadPiloto(Nave navePiloteada);
    
}

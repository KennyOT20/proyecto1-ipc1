/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Flota;

import com.mycompany.Naves.Nave;
import com.mycompany.Personajes.PersonajeDeJugador;
import com.mycompany.Personajes.PersonajeDeLaMaquina;

/**
 *
 * @author Kenny
 */
public class Flota {
    
    private final EnsambladorDeNaves ensambladorNave;
    
    public Flota(){
        this.ensambladorNave = new EnsambladorDeNaves();
    }

    public void asingarFlotaInicial(PersonajeDeJugador jugador){
    }
    
    
 
    public void agregarFlotaMejorada(PersonajeDeLaMaquina personajeMaquina){
        Nave naveObtenida = ensambladorNave.naveEnsmablada();
        int contadorArreglo = -1;
        
        while(contadorArreglo <= personajeMaquina.getFlota().length){
        personajeMaquina.agregarNave(naveObtenida);
        contadorArreglo ++;
        }
    }
    
    public void agregarFlotaRandom(){
        
    }
    
    
}

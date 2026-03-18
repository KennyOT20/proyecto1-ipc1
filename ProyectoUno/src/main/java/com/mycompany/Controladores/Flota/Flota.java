/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Flota;

import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Naves.Nave;
import com.mycompany.Personajes.PersonajeDeJugador;
import com.mycompany.Personajes.PersonajeDeLaMaquina;
import com.mycompany.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class Flota {
    
    private final GeneradorDeNaves generarNave;
    private final EnsambladorDeNaves ensambladorNave;
    
    public Flota(){
        this.generarNave = new GeneradorDeNaves();
        this.ensambladorNave = new EnsambladorDeNaves();
    }

    public void asingarFlotaInicial(PersonajeDeJugador jugador){
        Nave fragata = generarNave.crearFragata();
        Piloto pilotoObtenido = ensambladorNave.obtenerPilotoRandom();
        fragata.agregarPiloto(pilotoObtenido);
        ensambladorNave.agregarComponente(fragata);
        jugador.agregarNave(fragata);
    }
    
    
 
    public void flotaRandom(PersonajeDeLaMaquina personajeMaquina){
        int contadorArreglo = -1;
        
        while(contadorArreglo <= personajeMaquina.getFlota().length){
         Nave naveObtenida = ensambladorNave.naveEnsamblada();
        personajeMaquina.agregarNave(naveObtenida);
        contadorArreglo ++;
        }
    }
    
    
}

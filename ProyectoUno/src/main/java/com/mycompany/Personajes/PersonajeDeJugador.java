/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Personajes;

/**
 *
 * @author Kenny
 */
public class PersonajeDeJugador extends Personaje {

    private int creditosGalacticos;
    private int puntosDeTecnologia;

    public PersonajeDeJugador(int cantidadDeFlota) {
        super("Ender Wiggin", cantidadDeFlota);
    }
    
    @Override
    public void ejecutarOpcion() {
    }
    


    public void recibirRecompensas(){
        
    }

    public int getCreditosGalacticos() {
        return creditosGalacticos;
    }

    public void setCreditosGalacticos(int creditosGalacticos) {
        this.creditosGalacticos = creditosGalacticos;
    }

    public int getPuntosDeTecnologia() {
        return puntosDeTecnologia;
    }

    public void setPuntosDeTecnologia(int puntosDeTecnologia) {
        this.puntosDeTecnologia = puntosDeTecnologia;
    }

    
    
    
    
}

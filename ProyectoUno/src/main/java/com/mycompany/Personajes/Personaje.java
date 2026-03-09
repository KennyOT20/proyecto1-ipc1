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
    
    private Nave[] flota;
    private String nombrePersonaje;
    private int cantidadDeFlota;
    
    public Personaje(String nombrePersonaje, int cantidadDeFlota) {
        this.nombrePersonaje = nombrePersonaje;
        this.flota = new Nave[cantidadDeFlota];
        
    }
    
    public void agregarNave(Nave nave){
        for (int i = 0; i < flota.length; i++) {
            if(flota[i] == null){
                flota[i] = nave; 
                return;
            }
        }
       
    }
    
    public void mostrarNaves(){
        for (int i = 0; i < flota.length; i++) {
            if(flota[i] != null){
                System.out.println("Nave " + (i + 1 ) + " : " + flota[i].getNombreDeNave() );
            }
        }
    }
    
    public abstract void ejecutarOpcion(); 


    public int getCantidadDeFlota() {
        return cantidadDeFlota;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public Nave[] getFlota() {
        return flota;
    }

    public void setFlota(Nave[] flota) {
        this.flota = flota;
    }

    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Personajes;

import com.mycompany.ParteLogica.Inventarios.InventarioObjetos;
import com.mycompany.ParteLogica.Naves.Nave;


/**
 *
 * @author Kenny
 */
public abstract class Personaje {
    
    private final Flota flota;
    private final String nombrePersonaje;
    private final InventarioObjetos inventarioObjetos;
    private int cantidadDeFlota;
    
    public Personaje(String nombrePersonaje, int cantidadDeFlota) {
        this.nombrePersonaje = nombrePersonaje;
        this.flota = new Flota(cantidadDeFlota);
        this.inventarioObjetos = new InventarioObjetos();
    }
    
    public abstract void ejecutarOpcion(); 


    public int getCantidadDeFlota() {
        return cantidadDeFlota;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public Flota getFlota() {
        return flota;
    }

    
    
    public InventarioObjetos getInventarioObjetos() {
        return inventarioObjetos;
    }

}

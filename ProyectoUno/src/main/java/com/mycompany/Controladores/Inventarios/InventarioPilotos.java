/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Inventarios;

import com.mycompany.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class InventarioPilotos {
    
    private Piloto[] inventarioPiloto;
    private int cantidadDePilotos;
    
    public InventarioPilotos(){
        this.inventarioPiloto = new Piloto[1];
        this.cantidadDePilotos = 0;
    }
    
    public void agregarPiloto(Piloto pilotoObtenido){
        if(cantidadDePilotos == inventarioPiloto.length){
            agrandarInventario();
        }
        
        inventarioPiloto[cantidadDePilotos] = pilotoObtenido;
        
        cantidadDePilotos ++;
        
    }
    
    private void agrandarInventario(){
        
        Piloto[] nuevoArreglo = new Piloto[inventarioPiloto.length * 2 ];
        
        for (int i = 0; i < inventarioPiloto.length; i++) {
            nuevoArreglo[i] = inventarioPiloto[i];
        }
        
        inventarioPiloto = nuevoArreglo;
        
    }

    public Piloto[] getInventarioPiloto() {
        return inventarioPiloto;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Inventarios;

import com.mycompany.ParteLogica.Pilotos.Piloto;

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
        
        for (int i = 0; i < cantidadDePilotos; i++) {
            nuevoArreglo[i] = inventarioPiloto[i];
        }
        
        inventarioPiloto = nuevoArreglo;
        
    }

    
    public Piloto eliminarObjeto(int indiceObtenido){

        int indiceReal = indiceObtenido - 1;
        
        if(indiceReal < 0 || indiceReal >=cantidadDePilotos){

             throw new IllegalArgumentException("Opcion invalida ");
         }
        
        Piloto pilotoEliminado = inventarioPiloto[indiceReal];

        for (int i = indiceReal; i < cantidadDePilotos - 1; i++) {
            inventarioPiloto[i] = inventarioPiloto[i + 1];
        }

        cantidadDePilotos --;
        inventarioPiloto[cantidadDePilotos] = null;
        
        return pilotoEliminado;
    }


    public Piloto[] getInventarioPiloto() {
        return inventarioPiloto;
    }

    public int getCantidadDePilotos() {
        return cantidadDePilotos;
    }
    
    
     
}

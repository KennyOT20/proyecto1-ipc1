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
        
        for (int i = 0; i < inventarioPiloto.length; i++) {
            nuevoArreglo[i] = inventarioPiloto[i];
        }
        
        inventarioPiloto = nuevoArreglo;
        
    }

    public Piloto[] getInventarioPiloto() {
        return inventarioPiloto;
    }
    
    
    public void eliminarObjeto(int indiceObtenido){

        int indiceReal = indiceObtenido - 1;

        inventarioPiloto[indiceReal] = null;

        actualizarInventario();
    }

    private void actualizarInventario(){

        for (int i = 0; i < inventarioPiloto.length - 1; i++) {

            if(inventarioPiloto[i] == null){

                int j = i;

                while(j < inventarioPiloto.length - 1){

                    inventarioPiloto[j] = inventarioPiloto[j + 1];
                    j++;
                }

                inventarioPiloto[inventarioPiloto.length - 1] = null;
            }
        }
    }
    
}

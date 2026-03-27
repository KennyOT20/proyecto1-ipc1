/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Inventarios;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public class InventarioComponente {
    
    private ComponenteDeNave[] inventarioComponentes;
    private int cantidadDeComponentes;
    
    public InventarioComponente(){
        this.inventarioComponentes = new ComponenteDeNave[1];
        this.cantidadDeComponentes = 0;
    }
    
    public void agregarComponente(ComponenteDeNave componenteRecibido){
        
        if(cantidadDeComponentes == inventarioComponentes.length){
            duplicarInventario();
        }
        
        inventarioComponentes[cantidadDeComponentes] = componenteRecibido;
        componenteRecibido.calcularPrecioDeVenta();
        cantidadDeComponentes ++; 
        
    }
    
    private void duplicarInventario(){
        
        ComponenteDeNave[] arregloDuplicado = new ComponenteDeNave[inventarioComponentes.length * 2];
        
        for (int i = 0; i < inventarioComponentes.length; i++) {
            arregloDuplicado[i] = inventarioComponentes[i];
        }
        
        inventarioComponentes = arregloDuplicado;
        
    }
    
    public ComponenteDeNave eliminarComponente(int opcion){
        int indiceReal = opcion  - 1 ;
        
         if(indiceReal < 0 || indiceReal >= inventarioComponentes.length  || inventarioComponentes[indiceReal] == null){

             throw new IllegalArgumentException("Opcion invalida ");
         }
            
         ComponenteDeNave componenteEliminado = inventarioComponentes[indiceReal];
         
         for (int i = indiceReal; i < inventarioComponentes.length - 1; i++) {
            inventarioComponentes[i] = inventarioComponentes[i + 1];
        }
         
         inventarioComponentes[inventarioComponentes.length -1 ] = null;
         
         return componenteEliminado;
    }
    
    public int contarComponentes(){
        int contadorComponentes = 0;
        
        for (int i = 0; i < inventarioComponentes.length; i++) {
            if(inventarioComponentes != null){
                contadorComponentes ++;
            }
        }
        
        return contadorComponentes;
    }


    public int getCantidadDeComponentes() {
        return cantidadDeComponentes;
    }

    public ComponenteDeNave[] getInventarioComponentes() {
        return inventarioComponentes;
    }
    
    
    
}

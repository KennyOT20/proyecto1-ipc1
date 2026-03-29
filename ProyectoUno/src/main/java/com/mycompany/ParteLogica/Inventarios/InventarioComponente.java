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
        
        for (int i = 0; i < cantidadDeComponentes; i++) {
            arregloDuplicado[i] = inventarioComponentes[i];
        }
        
        inventarioComponentes = arregloDuplicado;
        
    }
    
    public ComponenteDeNave eliminarComponente(int opcion){

        int indiceReal = opcion - 1;

        if(indiceReal < 0 || indiceReal >= cantidadDeComponentes){
            throw new IllegalArgumentException("Opcion invalida");
        }

        ComponenteDeNave eliminado = inventarioComponentes[indiceReal];

        for (int i = indiceReal; i < cantidadDeComponentes - 1; i++) {
            inventarioComponentes[i] = inventarioComponentes[i + 1];
        }

        cantidadDeComponentes--;
        inventarioComponentes[cantidadDeComponentes] = null;

        return eliminado;
    }
    

    public int getCantidadDeComponentes() {
        return cantidadDeComponentes;
    }

    public ComponenteDeNave[] getInventarioComponentes() {
        return inventarioComponentes;
    }
    
    
    
}

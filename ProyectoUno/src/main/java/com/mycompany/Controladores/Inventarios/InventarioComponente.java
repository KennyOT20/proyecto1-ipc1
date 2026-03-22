/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Inventarios;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;

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
        cantidadDeComponentes ++; 
        
    }
    
    private void duplicarInventario(){
        
        ComponenteDeNave[] arregloDuplicado = new ComponenteDeNave[inventarioComponentes.length * 2];
        
        for (int i = 0; i < inventarioComponentes.length; i++) {
            arregloDuplicado[i] = inventarioComponentes[i];
        }
        
        inventarioComponentes = arregloDuplicado;
        
    }

    public int getCantidadDeComponentes() {
        return cantidadDeComponentes;
    }
    
    
    
}

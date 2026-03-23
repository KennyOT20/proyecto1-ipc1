/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Inventarios;

/**
 *
 * @author Kenny
 */
public class Mochila {
    
    private final InventarioComponente inventarioComponente;
    private final InventarioNave inventarioNave;
    private final InventarioObjetos inventarioObjetos;
    private final InventarioPilotos inventarioPilotos;

    public Mochila(InventarioComponente inventarioComponente, InventarioNave inventarioNave, InventarioObjetos inventarioObjetos, InventarioPilotos inventarioPilotos) {
        this.inventarioComponente = inventarioComponente;
        this.inventarioNave = inventarioNave;
        this.inventarioObjetos = inventarioObjetos;
        this.inventarioPilotos = inventarioPilotos;
    }
    
    public void mostrarInventarioComponente(){
        
       int cantidadDeComponentes = inventarioComponente.getInventarioComponentes().length;
       
        for (int i = 0; i < cantidadDeComponentes; i++) {
            if(inventarioComponente.getInventarioComponentes()[i] != null){
                
            }
        }
        
    }
    
}

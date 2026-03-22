/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Inventarios;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class InventarioNave {
    
    private Nave[] inventarioNave;
    private int cantidadArreglo;

    public InventarioNave() {
        this.cantidadArreglo = 0;
        this.inventarioNave = new Nave[1];
    }
    
    public void agregarNavesInventario(Nave naveObtenida){
        
        if(cantidadArreglo == inventarioNave.length){
            agrandarInventario();
        } 
        
        inventarioNave[cantidadArreglo] = naveObtenida;
        cantidadArreglo ++;
    }
    
    private void agrandarInventario(){
        Nave[] arregloAgrandado = new Nave[inventarioNave.length * 2 ];
        
        for (int i = 0; i < inventarioNave.length; i++) {
            arregloAgrandado[i] = inventarioNave[i];
        }
        
        inventarioNave = arregloAgrandado;
    }

    public Nave[] getInventarioNave() {
        return inventarioNave;
    }
    
}

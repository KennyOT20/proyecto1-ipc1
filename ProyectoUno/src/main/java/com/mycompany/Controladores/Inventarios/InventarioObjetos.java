/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Inventarios;

import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public class InventarioObjetos {
    
    private ObjetoPrincipal[] inventarioDeObjetos;
    private int cantidadDeObjetos;
    
    public InventarioObjetos(){
        this.inventarioDeObjetos = new ObjetoPrincipal[1];
        this.cantidadDeObjetos = 0;
    }
    
    public void agregarObjeto(ObjetoPrincipal objetoObtenido){
        if(cantidadDeObjetos == inventarioDeObjetos.length){
            agrandarInventario();
        }
        
        inventarioDeObjetos[cantidadDeObjetos] = objetoObtenido;
        cantidadDeObjetos ++;
        
    }
    
    private void agrandarInventario(){
        
        ObjetoPrincipal[] nuevoArreglo = new ObjetoPrincipal[inventarioDeObjetos.length * 2];
        
        for (int i = 0; i < inventarioDeObjetos.length; i++) {
            nuevoArreglo[i] = inventarioDeObjetos[i];
        }
        
        inventarioDeObjetos = nuevoArreglo;
        
    }

    public ObjetoPrincipal[] getInventarioDeObjetos() {
        return inventarioDeObjetos;
    }
    
    
    
}

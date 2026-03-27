/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Inventarios;

import com.mycompany.ParteLogica.Objetos.ObjetoPrincipal;

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
        objetoObtenido.calcularPrecioDeVenta();
        cantidadDeObjetos ++;
        
    }
    
    private void agrandarInventario(){
        
        ObjetoPrincipal[] nuevoArreglo = new ObjetoPrincipal[inventarioDeObjetos.length * 2];
        
        for (int i = 0; i < inventarioDeObjetos.length; i++) {
            nuevoArreglo[i] = inventarioDeObjetos[i];
        }
        
        inventarioDeObjetos = nuevoArreglo;
        
    }
    
    public ObjetoPrincipal eliminarObjeto(int opcion){
        
        int indiceReal = opcion - 1;
        
        if(indiceReal < 0 || indiceReal >= inventarioDeObjetos.length  || inventarioDeObjetos[indiceReal] == null){

             throw new IllegalArgumentException("Opcion invalida ");
         }
        
        ObjetoPrincipal objetoVendido = inventarioDeObjetos[indiceReal];

        for (int i = indiceReal; i < inventarioDeObjetos.length - 1; i++) {
            inventarioDeObjetos[i] = inventarioDeObjetos[i + 1];
        }

        inventarioDeObjetos[inventarioDeObjetos.length - 1] = null;
        
        return objetoVendido;
    
    }
    
    

    
    public int contadorObjetos(){
        int contador = 0;
        
        for (int i = 0; i < inventarioDeObjetos.length; i++) {
            if(inventarioDeObjetos[i] != null){
                contador ++;
            }
        }
        
        return contador;
    }

    public ObjetoPrincipal[] getInventarioDeObjetos() {
        return inventarioDeObjetos;
    }
    
    
    
}

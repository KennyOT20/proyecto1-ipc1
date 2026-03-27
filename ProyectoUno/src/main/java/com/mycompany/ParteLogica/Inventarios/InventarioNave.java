/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Inventarios;

import com.mycompany.ParteLogica.Naves.Nave;

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
        naveObtenida.calcularPrecioVenta();
        cantidadArreglo ++;
    }
    
    private void agrandarInventario(){
        Nave[] arregloAgrandado = new Nave[inventarioNave.length * 2 ];
        
        for (int i = 0; i < inventarioNave.length; i++) {
            arregloAgrandado[i] = inventarioNave[i];
        }
        
        inventarioNave = arregloAgrandado;
    }

    public Nave eliminarNave(int opcion){

        int indiceReal = opcion - 1;
        
        if(indiceReal < 0 || indiceReal >= inventarioNave.length  || inventarioNave[indiceReal] == null){

             throw new IllegalArgumentException("Opcion invalida ");
         }
        
        Nave naveEliminada = inventarioNave[indiceReal];

        for (int i = indiceReal; i < inventarioNave.length - 1; i++) {
            inventarioNave[i] = inventarioNave[i + 1];
        }

        inventarioNave[inventarioNave.length - 1] = null;
        
        return naveEliminada;
    }
    
    public int contarNaves(){

        int contador = 0;

        for (int i = 0; i < inventarioNave.length; i++) {
            if(inventarioNave[i] != null){
                contador++;
            }
        }
        return contador;
    }

    public Nave[] getInventarioNave() {
        return inventarioNave;
    }
    
}

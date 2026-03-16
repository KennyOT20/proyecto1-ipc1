/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArregloDeObjetos;

import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public abstract class ArregloDeObjetos {
    
    private final ObjetoPrincipal[] objetos;
    
    public ArregloDeObjetos(int cantidadDeObjetos){
        this.objetos = new ObjetoPrincipal[cantidadDeObjetos];
    }
    
    public abstract void generarArregloDeObjetos();
    
    public void mostrarArregloDeObjetos(){
        for (int i = 0; i < objetos.length; i++) {
            System.out.println((i+1) + objetos[i].getNombreDeObjeto());
        }
    }

    public ObjetoPrincipal[] getObjetos() {
        return objetos;
    }
    
    
    
}

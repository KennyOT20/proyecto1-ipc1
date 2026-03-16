/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class ArregloDeComponentes {
    
    private final ComponenteDeNave[] arregloDeComponentes;
    
    public ArregloDeComponentes(int tamaño ){
        this.arregloDeComponentes = new ComponenteDeNave[tamaño];
    }
    
    public abstract void crearArreglo();
    
    public void mostrarArreglo(){
        for (int i = 0; i < arregloDeComponentes.length; i++) {
            if(arregloDeComponentes[i] != null){
            System.out.println((i+1) + arregloDeComponentes[i].getNombreComponente());
            }
        }
    }

    public ComponenteDeNave[] getArregloDeComponentes() {
        return arregloDeComponentes;
    }
    
}

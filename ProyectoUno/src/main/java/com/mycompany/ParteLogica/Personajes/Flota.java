/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Personajes;

import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class Flota {
    
    private final Nave [] naves;
    private int cantidadDeNaves;
    
    public Flota(int cantidadNave){
        this.naves = new Nave[cantidadNave];
    }
    
    public void agregarNave(Nave nave){
        for (int i = 0; i < naves.length; i++) {
            if(naves[i] == null){
                naves[i] = nave; 
                return;
            }
        }
    }
    
    public Nave eliminarNave(int opcion){

        int cantidadDeNaves = contarNaves(); 

        if(cantidadDeNaves <= 1){
            return null;
        }

        int indiceReal = opcion - 1;

        if(indiceReal < 0 || indiceReal >= cantidadDeNaves){
            return null;
        }

        Nave naveEliminada = naves[indiceReal];

        for (int i = indiceReal; i < naves.length - 1; i++) {
            naves[i] = naves[i + 1];
        }

        naves[naves.length - 1] = null;

        return naveEliminada;
    }

    public int contarNaves(){
        
        int cantidad = 0;

            for (int i = 0; i < naves.length; i++) {
                if(naves[i] != null){
                    cantidad++;
                }
            }

            return cantidad;
    }
    
     public Nave[] getNaves() {
        return naves;
    }
        
    public int getCantidadDeNaves() {
        return cantidadDeNaves;
    }
    
}



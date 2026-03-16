/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArregloDeNaves;

import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class ArregloDeNaves {
    
    private final Nave[] arregloDeNaves;
    private final GeneradorDeNaves crearNave;
    
    public ArregloDeNaves(){
        this.arregloDeNaves = new Nave[4];
        this.crearNave = new GeneradorDeNaves();
    }
    
    public void crearArregloNaves(){
        arregloDeNaves[0] = crearNave.crearAcorazado();
        arregloDeNaves[1]= crearNave.crearCaza();
        arregloDeNaves[2] = crearNave.crearFragata();
        arregloDeNaves[3] = crearNave.crearNaveApoyo();
    }

    public Nave[] getArregloDeNaves() {
        return arregloDeNaves;
    }
    
    
    
}

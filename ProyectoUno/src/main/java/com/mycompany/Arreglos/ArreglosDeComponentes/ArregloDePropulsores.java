/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDePropulsores;

/**
 *
 * @author Kenny
 */
public class ArregloDePropulsores {
    private final ComponenteDeNave[] propulsores;
    private final GeneradorDePropulsores crearPropulsores;
    
    public ArregloDePropulsores(){
        this.propulsores = new ComponenteDeNave[4];
        this.crearPropulsores = new GeneradorDePropulsores();
    }
    
    public void generarArregloDePropulsores(){
        for (int i = 0; i < propulsores.length; i++) {
            switch(i){
                case 0:
                    propulsores[i] = crearPropulsores.crearMicroPropulsor();
                    break;
                case 1:
                    propulsores[i]  = crearPropulsores.crearPropulsorCuantico();
                    break;
                case 2:
                    propulsores[i] = crearPropulsores.crearSistemaDeManiobra();
                    break;
                case 3:
                    propulsores[i] = crearPropulsores.crearTurboCompresor();
                    break;
            }
        }
    }
    
    public void mostrarArregloDePropulsores(){
        for (int i = 0; i < propulsores.length; i++) {
            System.out.println((i + 1) + propulsores[i].getNombreComponente());
        }
    }

    public ComponenteDeNave[] getPropulsores() {
        return propulsores;
    }
    
    
    
}

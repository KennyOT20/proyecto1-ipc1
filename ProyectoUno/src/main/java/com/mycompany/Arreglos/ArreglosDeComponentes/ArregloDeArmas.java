/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeArmas;

/**
 *
 * @author Kenny
 */
public class ArregloDeArmas {
    
    private final ComponenteDeNave[] armas;
    private final GeneradorDeArmas generarArmas;
    
    public ArregloDeArmas(){
        this.armas = new ComponenteDeNave[5];
        this.generarArmas = new GeneradorDeArmas();
    }
    
    public void generarArreglo(){
        for (int i = 0; i < armas.length; i++) {
            switch(i){
                case 0 :
                    armas[i] = generarArmas.crearCampoDeMinas();
                    break;
                case 1:
                    armas[i] = generarArmas.crearCañonDeLones();  
                    break;
                case 2:
                    armas[i] = generarArmas.crearLanzaTorpedos();
                    break;
                case 3:
                    armas[i] = generarArmas.crearLaserDePulsos();
                    break;
                case 4:
                    armas[i] = generarArmas.crearMisilTeledirigido();
                    break;
                case 5:
                    armas[i] = generarArmas.crearRayoDeParticulas();
                    break;
            }
        }
    }
    
    public void mostrarArregloDeArmas(){
        for (int i = 0; i < armas.length; i++) {
            System.out.println((i + 1) + armas[i].getNombreComponente());
        }    
    }

    public ComponenteDeNave[] getArmas() {
        return armas;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeEscudos;

/**
 *
 * @author Kenny
 */
public class ArregloDeEscudos {
    private final ComponenteDeNave[] escudos;
    private final GeneradorDeEscudos crearEscudo;
    
    public ArregloDeEscudos(){
        this.escudos = new ComponenteDeNave[5];
        this.crearEscudo =  new GeneradorDeEscudos();
    }
    
    public void generarArregloEscudos(){
        for (int i = 0; i < escudos.length; i++) {
            switch(i){
                case 0:
                    escudos[i] = crearEscudo.crearCampoDeflexion();
                    break;
                case 1:
                    escudos[i] = crearEscudo.crearEscudoReforzado();
                    break;
                case 2:
                    escudos[i] = crearEscudo.crearGeneradorDeOndas();
                    break;
                case 3:
                    escudos[i] = crearEscudo.crearNucleoDeEnergia();
                    break;
                case 4:
                    escudos[i] = crearEscudo.crearPantallaDeAsteroides();
                    break;
            }
        }
    }
    
    public void mostrarArregloDeEscudos(){
        for (int i = 0; i < escudos.length; i++) {
            System.out.println((i+ 1) + escudos[i].getNombreComponente());
        }
    }

    public ComponenteDeNave[] getEscudos() {
        return escudos;
    }
    
    
    
}

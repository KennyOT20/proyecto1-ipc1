/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeSistemasDeApoyo;

/**
 *
 * @author Kenny
 */
public class ArregloDeSistemas {
    private final ComponenteDeNave[] sistemas;
    private final GeneradorDeSistemasDeApoyo crearSistema;
    
    public ArregloDeSistemas(){
        this.sistemas = new ComponenteDeNave[5];
        this.crearSistema = new GeneradorDeSistemasDeApoyo();
    }
    
    public void crearArregloDeSistemas(){
        for (int i = 0; i < sistemas.length; i++) {
            switch(i){
                case 0:
                    sistemas[i] = crearSistema.crearCampoDistorcion();
                    break;
                case 1:
                    sistemas[i] = crearSistema.crearCamuflajeTactico();
                    break;
                case 2:
                    sistemas[i] = crearSistema.crearDronDeReparacion();
                    break;
                case 3:
                    sistemas[i] = crearSistema.crearGeneradorDeEscudo();
                    break;
                case 4:
                    sistemas[i] = crearSistema.crearNucleoDeSobreCarga();
                    break;
            }
        }
    }

    public void mostrarArregloSistemas(){
        for (int i = 0; i < sistemas.length; i++) {
            System.out.println((i+1) + sistemas[i].getNombreComponente());
        }
    }
    
    public ComponenteDeNave[] getSistemas() {
        return sistemas;
    }
    
    
}

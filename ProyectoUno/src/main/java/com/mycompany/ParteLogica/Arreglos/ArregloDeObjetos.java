/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Arreglos;

import com.mycompany.ParteLogica.Generadores.GeneradorDeObjetos.GeneradorDeObjetos;
import com.mycompany.ParteLogica.Objetos.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public class ArregloDeObjetos {
    
    private final ObjetoPrincipal[] arregloDeObjetos;
    private final GeneradorDeObjetos generarObjeto;
    
    public ArregloDeObjetos(){
        this.arregloDeObjetos = new ObjetoPrincipal[6];
        this.generarObjeto = new GeneradorDeObjetos();
        generarArreglo();
    }
    
    private void generarArreglo(){
        arregloDeObjetos[0] = generarObjeto.crearDeMejora();
        arregloDeObjetos[1] = generarObjeto.crearEscape();
        arregloDeObjetos[2] = generarObjeto.crearEscudo();
        arregloDeObjetos[3] = generarObjeto.crearReparacion();
        arregloDeObjetos[4] = generarObjeto.objetoDeSabotaje();
        arregloDeObjetos[5] = generarObjeto.objetoDeVelocidad();
    }

    public ObjetoPrincipal[] getArregloDeObjetos() {
        return arregloDeObjetos;
    }
    
    
    
}

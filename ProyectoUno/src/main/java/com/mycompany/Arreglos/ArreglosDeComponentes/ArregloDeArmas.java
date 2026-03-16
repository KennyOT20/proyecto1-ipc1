/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Arreglos.ArreglosDeComponentes;

import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeArmas;


/**
 *
 * @author Kenny
 */
public class ArregloDeArmas extends ArregloDeComponentes {

    private final GeneradorDeArmas crearArma;
    
    public ArregloDeArmas() {
        super(6);
        this.crearArma = new GeneradorDeArmas();
    }

    @Override
    public void crearArreglo() {
        getArregloDeComponentes()[0] = crearArma.crearCampoDeMinas();
        getArregloDeComponentes()[1] = crearArma.crearCañonDeLones();
        getArregloDeComponentes()[2] = crearArma.crearLanzaTorpedos();
        getArregloDeComponentes()[3] = crearArma.crearLaserDePulsos();
        getArregloDeComponentes()[4] = crearArma.crearMisilTeledirigido();
        getArregloDeComponentes()[5] = crearArma.crearRayoDeParticulas();
    }

}

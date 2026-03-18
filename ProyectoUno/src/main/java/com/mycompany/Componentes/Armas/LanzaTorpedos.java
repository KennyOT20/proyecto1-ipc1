/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Armas;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class LanzaTorpedos extends Arma {

    public LanzaTorpedos(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

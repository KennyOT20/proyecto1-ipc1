/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Propulsores;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class MicroPropulsor extends Propulsor {

    public MicroPropulsor(int consumoDeEnergia, String pesoComponente, String nombreComponente, int velocidadExtra, double evasion) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, velocidadExtra, evasion);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

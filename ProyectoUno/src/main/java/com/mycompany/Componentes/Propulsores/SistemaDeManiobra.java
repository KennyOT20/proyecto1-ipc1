/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Propulsores;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class SistemaDeManiobra extends Propulsor {

    public SistemaDeManiobra(int consumoDeEnergia, int pesoComponente, String nombreComponente, int velocidadExtra, double evasion) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, velocidadExtra, evasion);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }
    
}

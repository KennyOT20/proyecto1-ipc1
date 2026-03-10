/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Propulsores;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class Propulsor extends ComponenteDeNave {

    private int velocidadExtra;
    private double evasion; 

    public Propulsor(int consumoDeEnergia, String pesoComponente, String nombreComponente, int velocidadExtra, double evasion) {
        super(consumoDeEnergia, pesoComponente, nombreComponente);
        this.velocidadExtra = velocidadExtra;
        this.evasion = evasion;
        
    }

}

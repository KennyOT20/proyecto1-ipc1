/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Escudos;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class Escudo extends ComponenteDeNave {

    private int escudoExtra; 
    
    public Escudo(int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, "Escudo");
        this.escudoExtra = escudoExtra;
    }

    public int getEscudoExtra() {
        return escudoExtra;
    }

    

    
}

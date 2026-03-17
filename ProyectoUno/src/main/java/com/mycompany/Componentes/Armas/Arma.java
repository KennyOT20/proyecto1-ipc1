/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Armas;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class Arma extends ComponenteDeNave {
    
    private int dañoDeArma;

    public Arma(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, "Arma");
        this.dañoDeArma = dañoDeArma;
    }

    
    public int getDañoDeArma() {
        return dañoDeArma;
    }

    public void setDañoDeArma(int dañoDeArma) {
        this.dañoDeArma = dañoDeArma;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.Escudos;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class Escudo extends ComponenteDeNave {

    private int escudoExtra; 
    private boolean escudoFucionadoConNave;
    
    public Escudo(int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, "Escudo", precioComponente);
        this.escudoExtra = escudoExtra;
        this.escudoFucionadoConNave = false;
    }

    public int getEscudoExtra() {
        return escudoExtra;
    }

    public void setEscudoExtra(int escudoExtra) {
        this.escudoExtra = escudoExtra;
    }

    public boolean isEscudoFucionadoConNave() {
        return escudoFucionadoConNave;
    }

    public void setEscudoFucionadoConNave(boolean escudoFucionadoConNave) {
        this.escudoFucionadoConNave = escudoFucionadoConNave;
    }
    
    

    
}

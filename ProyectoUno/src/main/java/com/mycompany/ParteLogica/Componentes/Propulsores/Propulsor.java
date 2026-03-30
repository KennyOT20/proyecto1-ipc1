/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.Propulsores;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class Propulsor extends ComponenteDeNave {

    private int velocidadExtra;
    private double evasion; 
    private boolean propulsorFusionadoConNave;

    public Propulsor(int consumoDeEnergia, String pesoComponente, String nombreComponente, 
            int velocidadExtra, double evasion, int precioDeComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, "Propulsor", precioDeComponente);
        this.velocidadExtra = velocidadExtra;
        this.evasion = evasion;
        this.propulsorFusionadoConNave = false;
    }

    public int getVelocidadExtra() {
        return velocidadExtra;
    }

    public double getEvasion() {
        return evasion;
    }

    public void setVelocidadExtra(int velocidadExtra) {
        this.velocidadExtra = velocidadExtra;
    }

    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }

    public boolean isPropulsorFusionadoConNave() {
        return propulsorFusionadoConNave;
    }

    public void setPropulsorFusionadoConNave(boolean propulsorFusionadoConNave) {
        this.propulsorFusionadoConNave = propulsorFusionadoConNave;
    }
    
    

}

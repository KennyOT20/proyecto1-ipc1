/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.SistemasDeApoyo;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class SistemaDeApoyo extends ComponenteDeNave {
    
    private int enfriamiento; 
    private int turnosRestantesEnfriamiento; 
    private boolean sistemaFusionadoConNave; 

    public SistemaDeApoyo(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, "Sistema de Apoyo", precioComponente);
        this.enfriamiento = enfriamiento;
        this.turnosRestantesEnfriamiento = 0; 
        this.sistemaFusionadoConNave = false;
    }

    public int getEnfriamiento() {
        return enfriamiento;
    }

    public void setEnfriamiento(int enfriamiento) {
        this.enfriamiento = enfriamiento;
    }

    public int getTurnosRestantesEnfriamiento() {
        return turnosRestantesEnfriamiento;
    }

    public void setTurnosRestantesEnfriamiento(int turnosRestantesEnfriamiento) {
        this.turnosRestantesEnfriamiento = turnosRestantesEnfriamiento;
    }

    public boolean isSistemaFusionadoConNave() {
        return sistemaFusionadoConNave;
    }

    public void setSistemaFusionadoConNave(boolean sistemaFusionadoConNave) {
        this.sistemaFusionadoConNave = sistemaFusionadoConNave;
    }
}
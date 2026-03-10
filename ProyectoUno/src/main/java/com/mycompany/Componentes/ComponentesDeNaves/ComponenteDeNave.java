/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.ComponentesDeNaves;

import com.mycompany.Naves.Nave;


/**
 *
 * @author Kenny
 */
public abstract class ComponenteDeNave {
    
    private final int consumoDeEnergia; 
    private final String pesoComponente;
    private final String nombreComponente;

    public ComponenteDeNave(int consumoDeEnergia, String pesoComponente, String nombreComponente) {
        this.consumoDeEnergia = consumoDeEnergia;
        this.pesoComponente = pesoComponente;
        this.nombreComponente = nombreComponente;
    }

    public abstract void aplicarEfectoComponente(Nave naveElegida);

    public int getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public String getPesoComponente() {
        return pesoComponente;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    

}

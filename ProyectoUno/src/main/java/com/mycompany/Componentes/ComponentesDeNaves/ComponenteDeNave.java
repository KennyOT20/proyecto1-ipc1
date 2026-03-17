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
    
    private String tipoDeComponente;
    private int consumoDeEnergia; 
    private  String pesoComponente;
    private  String nombreComponente;

    public ComponenteDeNave(int consumoDeEnergia, String pesoComponente, String nombreComponente, String tipoDeComponente) {
        this.tipoDeComponente = tipoDeComponente;
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

    public String getTipoDeComponente() {
        return tipoDeComponente;
    }

    
    
    

}

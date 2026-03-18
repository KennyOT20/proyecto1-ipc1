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
    private int VECES_MAX_MEJORA = 3;
    private int vezMejorada;

    public ComponenteDeNave(int consumoDeEnergia, String pesoComponente, String nombreComponente, String tipoDeComponente) {
        this.tipoDeComponente = tipoDeComponente;
        this.consumoDeEnergia = consumoDeEnergia;
        this.pesoComponente = pesoComponente;
        this.nombreComponente = nombreComponente;
    }

    public abstract void aplicarEfectoComponente(Nave naveElegida);
    public abstract void mejorarComponente(ComponenteDeNave componente);
    
   

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

    public int getVECES_MAX_MEJORA() {
        return VECES_MAX_MEJORA;
    }

    public int getVezMejorada() {
        return vezMejorada;
    }

    
    
    

}

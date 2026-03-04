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
    
    private int consumoDeEnergia; 
    private int pesoComponente;
    private String nombreComponente;

    public ComponenteDeNave(int consumoDeEnergia, int pesoComponente, String nombreComponente) {
        this.consumoDeEnergia = consumoDeEnergia;
        this.pesoComponente = pesoComponente;
        this.nombreComponente = nombreComponente;
    }

    public abstract void aplicarEfectoComponente(Nave naveElegida);
    
    
    
}

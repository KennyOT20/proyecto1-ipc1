/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Armas;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class CañonDeLones extends Arma{

    public CañonDeLones(int consumoDeEnergia, int pesoComponente, String nombreComponente, int dañoDeArma) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }

    
    
}

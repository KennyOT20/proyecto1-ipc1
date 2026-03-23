/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.Armas;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class CampoDeMinas extends Arma {

    public CampoDeMinas(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma,int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

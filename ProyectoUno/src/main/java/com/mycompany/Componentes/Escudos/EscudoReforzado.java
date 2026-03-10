/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Escudos;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class EscudoReforzado extends Escudo{

    public EscudoReforzado(int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, escudoExtra);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }
    
}

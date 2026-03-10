/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.SistemasDeApoyo;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class CamuflajeTactico extends SistemaDeApoyo {

    public CamuflajeTactico(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, enfriamiento);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
    }
    
}

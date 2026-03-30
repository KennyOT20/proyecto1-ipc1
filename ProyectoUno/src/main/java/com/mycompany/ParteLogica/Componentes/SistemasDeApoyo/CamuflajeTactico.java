/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.SistemasDeApoyo;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class CamuflajeTactico extends SistemaDeApoyo {

    public CamuflajeTactico(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, enfriamiento, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (getTurnosRestantesEnfriamiento() > 0) {
            System.out.println("Camuflaje Tactico en enfriamiento. Faltan " + getTurnosRestantesEnfriamiento() + " turnos.");
            return;
        }

        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            
            naveElegida.setEvasionGarantizada(true); 
            
            setTurnosRestantesEnfriamiento(getEnfriamiento());
            System.out.println("Camuflaje Tactico activado. La nave es invisible y evadira por completo el proximo ataque.");
        } else {
            System.out.println("Energia insuficiente para activar el Camuflaje Tactico.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            System.out.println("Camuflaje Tactico mejorado al nivel " + getVezMejorada() + ". Eficiencia del sistema aumentada.");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
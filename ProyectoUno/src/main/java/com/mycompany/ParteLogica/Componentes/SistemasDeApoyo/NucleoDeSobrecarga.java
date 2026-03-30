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
public class NucleoDeSobrecarga extends SistemaDeApoyo {

    public NucleoDeSobrecarga(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, enfriamiento, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (getTurnosRestantesEnfriamiento() > 0) {
            System.out.println("Nucleo de Sobrecarga en enfriamiento. Faltan " + getTurnosRestantesEnfriamiento() + " turnos.");
            return;
        }

        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            
            naveElegida.setSobrecargaActiva(true);
            
            setTurnosRestantesEnfriamiento(getEnfriamiento());
            System.out.println("Nucleo de Sobrecarga activado. El proximo ataque hara el doble de daño, con un 50% de daño de retroceso.");
        } else {
            System.out.println("Energia insuficiente para activar el Nucleo de Sobrecarga.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            System.out.println("Nucleo de Sobrecarga mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}

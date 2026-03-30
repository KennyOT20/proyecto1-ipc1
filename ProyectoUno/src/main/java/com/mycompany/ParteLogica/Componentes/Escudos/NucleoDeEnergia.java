/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.Escudos;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class NucleoDeEnergia extends Escudo {

    public NucleoDeEnergia(int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, escudoExtra, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (!isEscudoFucionadoConNave()) {
            int shpAsignado = getEscudoExtra();
            naveElegida.setPuntosDeEscudoMax(naveElegida.getPuntosDeEscudoMax() + shpAsignado);
            naveElegida.setEscudo(naveElegida.getEscudo()+ shpAsignado);
            setEscudoFucionadoConNave(true);
            System.out.println("Nucleo de Energia fusionado. Nave recibe " + shpAsignado + " SHP adicionales.");
        }

        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            naveElegida.setNucleoDeEnergiaActivo(true);
        } else {
            System.out.println("Energia insuficiente para mantener activo el Nucleo de Energia.");
            naveElegida.setNucleoDeEnergiaActivo(false);
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setEscudoExtra(getEscudoExtra() + 35);
            System.out.println("Nucleo de Energia mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
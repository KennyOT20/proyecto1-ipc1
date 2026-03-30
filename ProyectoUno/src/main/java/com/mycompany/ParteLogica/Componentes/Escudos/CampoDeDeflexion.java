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
public class CampoDeDeflexion extends Escudo {

    public CampoDeDeflexion(int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, escudoExtra, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (!isEscudoFucionadoConNave()) {
            int shpAsignado = getEscudoExtra();
            naveElegida.setPuntosDeEscudoMax(naveElegida.getPuntosDeEscudoMax() + shpAsignado);
            naveElegida.setEscudo(naveElegida.getEscudo() + shpAsignado);
            setEscudoFucionadoConNave(true);
            System.out.println("Campo de Deflexion fusionado. Nave recibe " + shpAsignado + " SHP adicionales.");
        }

        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            naveElegida.setCampoDefleccionActivo(true);
        } else {
            System.out.println("Energia insuficiente para mantener el Campo de Deflexion.");
            naveElegida.setCampoDefleccionActivo(false);
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setEscudoExtra(getEscudoExtra() + 25);
            System.out.println("Campo de Deflexion mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
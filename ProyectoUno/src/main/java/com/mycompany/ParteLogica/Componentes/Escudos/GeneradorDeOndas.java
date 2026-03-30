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
public class GeneradorDeOndas extends Escudo {

    public GeneradorDeOndas(int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, escudoExtra, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (!isEscudoFucionadoConNave()) {
            int shpAsignado = getEscudoExtra();
            naveElegida.setPuntosDeEscudoMax(naveElegida.getPuntosDeEscudoMax() + shpAsignado);
            naveElegida.setEscudo(naveElegida.getEscudo()+ shpAsignado);
            setEscudoFucionadoConNave(true);
            System.out.println("Generador de Ondas fusionado. Nave recibe " + shpAsignado + " SHP adicionales.");
        }

        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            
            int nuevoEscudo = naveElegida.getEscudo()+ 20;
            
            if (nuevoEscudo > naveElegida.getPuntosDeEscudoMax()) {
                nuevoEscudo = naveElegida.getPuntosDeEscudoMax();
            }
            
            naveElegida.setEscudo(nuevoEscudo);
            System.out.println("Habilidad Generador de Ondas activada. Regenerados 20 SHP.");
        } else {
            System.out.println("Energia insuficiente para activar la regeneracion del Generador de Ondas.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setEscudoExtra(getEscudoExtra() + 40);
            System.out.println("Generador de Ondas mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
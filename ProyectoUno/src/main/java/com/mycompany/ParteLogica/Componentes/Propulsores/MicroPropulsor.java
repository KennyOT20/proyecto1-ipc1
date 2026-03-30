/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.Propulsores;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class MicroPropulsor extends Propulsor {

    public MicroPropulsor(int consumoDeEnergia, String pesoComponente, String nombreComponente, int velocidadExtra, double evasion, int precioDeComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, velocidadExtra, evasion, precioDeComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            
            if (!isPropulsorFusionadoConNave()) {
                naveElegida.setEvasionBase(naveElegida.getEvasionBase() + getEvasion());
                naveElegida.setVelocidad(naveElegida.getVelocidad() + getVelocidadExtra());
                
                setPropulsorFusionadoConNave(true);
                System.out.println("MicroPropulsor activado y fusionado. Velocidad y evasion incrementadas.");
            }
        } else {
            System.out.println("Energia insuficiente para el MicroPropulsor.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setVelocidadExtra(getVelocidadExtra() + 10);
            setEvasion(getEvasion() + 2.5);
            System.out.println("MicroPropulsor mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
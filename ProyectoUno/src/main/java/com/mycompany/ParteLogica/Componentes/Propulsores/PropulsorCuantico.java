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
public class PropulsorCuantico extends Propulsor {

    private int turnosEnfriamiento;

    public PropulsorCuantico(int consumoDeEnergia, String pesoComponente, String nombreComponente, int velocidadExtra, double evasion, int precioDeComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, velocidadExtra, evasion, precioDeComponente);
        this.turnosEnfriamiento = 0;
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            
            if (!isPropulsorFusionadoConNave()) {
                naveElegida.setEvasionBase(naveElegida.getEvasionBase() + getEvasion());
                naveElegida.setVelocidad(naveElegida.getVelocidad() + getVelocidadExtra());
                
                setPropulsorFusionadoConNave(true);
                System.out.println("Propulsor Cuantico fusionado. Velocidad y evasion incrementadas.");
            }

            if (turnosEnfriamiento == 0) {
                naveElegida.setOmitirTurnoEnemigoActivo(true);
                turnosEnfriamiento = 2;
                System.out.println("Habilidad Propulsor Cuantico activada. El enemigo perdera su proximo turno.");
            } else {
                naveElegida.setOmitirTurnoEnemigoActivo(false);
                turnosEnfriamiento--;
                System.out.println("Propulsor Cuantico en enfriamiento. Faltan " + turnosEnfriamiento + " turnos.");
            }

        } else {
            System.out.println("Energia insuficiente para el Propulsor Cuantico.");
            naveElegida.setOmitirTurnoEnemigoActivo(false);
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setVelocidadExtra(getVelocidadExtra() + 10);
            setEvasion(getEvasion() + 2.5);
            System.out.println("Propulsor Cuantico mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
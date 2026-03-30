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
public class TurboCompresor extends Propulsor {

    private int turnosRestantes;
    private int velocidadAumentada;

    public TurboCompresor(int consumoDeEnergia, String pesoComponente, String nombreComponente, int velocidadExtra, double evasion, int precioDeComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, velocidadExtra, evasion, precioDeComponente);
        this.turnosRestantes = 0;
        this.velocidadAumentada = 0;
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (!isPropulsorFusionadoConNave()) {
            naveElegida.setEvasionBase(naveElegida.getEvasionBase() + getEvasion());
            naveElegida.setVelocidad(naveElegida.getVelocidad() + getVelocidadExtra());
            
            setPropulsorFusionadoConNave(true);
            System.out.println("TurboCompresor fusionado. Velocidad y evasion incrementadas");
        }

        if (turnosRestantes > 0) {
            turnosRestantes--;
            System.out.println("TurboCompresor activo. Turnos restantes del turbo: " + turnosRestantes);
            
            if (turnosRestantes == 0) {
                naveElegida.setVelocidad(naveElegida.getVelocidad() - velocidadAumentada);
                velocidadAumentada = 0;
                System.out.println("El efecto del TurboCompresor ha terminado. La velocidad vuelve a la normalidad.");
            }
        } else {
            if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
                naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
                
                velocidadAumentada = naveElegida.getVelocidad() / 2;
                naveElegida.setVelocidad(naveElegida.getVelocidad() + velocidadAumentada);
                
                turnosRestantes = 2;
                System.out.println("Habilidad TurboCompresor activada. Velocidad aumentada un 50% (" + velocidadAumentada + " extra) por 2 turnos.");
            } else {
                System.out.println("Energia insuficiente para activar el TurboCompresor.");
            }
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setVelocidadExtra(getVelocidadExtra() + 15);
            setEvasion(getEvasion() + 3.0);
            System.out.println("TurboCompresor mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
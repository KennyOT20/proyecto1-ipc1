/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.Armas;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class LaserDePulso extends Arma {

    public LaserDePulso(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        int energiaNecesaria = getConsumoDeEnergia();

        if (naveElegida.getPuntosEnergia() >= energiaNecesaria) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - energiaNecesaria);
            naveElegida.setLaserCriticoActivo(true);
            System.out.println("Laser de pulso activado.");
        } else {
            System.out.println("Energia insuficiente para usar el laser de pulso.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setDañoDeArma(getDañoDeArma() + 20);
            System.out.println("Laser de pulso mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
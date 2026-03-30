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
public class RayoDeParticulas extends Arma {

    public RayoDeParticulas(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        int energiaNecesaria = 40;

        if (naveElegida.getPuntosEnergia() >= energiaNecesaria) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - energiaNecesaria);
            naveElegida.setRayoParticulasActivo(true);
            System.out.println("Rayo de particulas activado. Ignorara escudos y reducira la defensa.");
        } else {
            System.out.println("Energia insuficiente para usar el rayo de particulas.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            setDañoDeArma(getDañoDeArma() + 35);
            System.out.println("Rayo de particulas mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
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
public class CampoDeDistorsion extends SistemaDeApoyo {

    public CampoDeDistorsion(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, enfriamiento, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (getTurnosRestantesEnfriamiento() > 0) {
            System.out.println("Campo de Distorsion en enfriamiento. Faltan " + getTurnosRestantesEnfriamiento() + " turnos.");
            return;
        }

        if (naveElegida.getPuntosEnergia() >= getConsumoDeEnergia()) {
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - getConsumoDeEnergia());
            
            naveElegida.setCampoDeDistorsion(true);
            naveElegida.setTurnosCampoDistorcion(2);
            
            setTurnosRestantesEnfriamiento(getEnfriamiento());
            System.out.println("Campo de Distorsion activado. La velocidad de los enemigos cercanos se reducira un 30% por 2 turnos.");
        } else {
            System.out.println("Energia insuficiente para activar el Campo de Distorsion.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            System.out.println("Campo de Distorsion mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}
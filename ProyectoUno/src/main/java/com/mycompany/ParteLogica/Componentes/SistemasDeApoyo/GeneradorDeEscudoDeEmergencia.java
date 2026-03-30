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
public class GeneradorDeEscudoDeEmergencia extends SistemaDeApoyo {

    private boolean escudoActivado;

    public GeneradorDeEscudoDeEmergencia(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, enfriamiento, precioComponente);
        this.escudoActivado = false;
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        if (!escudoActivado) {
            double vida = naveElegida.getVidaMax()* 0.20;
            
            if (naveElegida.getVidaMax()<= vida) {
                naveElegida.setEscudo(naveElegida.getEscudo()+ 500);
                this.escudoActivado = true;
                System.out.println("¡Alerta crítica! Generador de Escudo de Emergencia activado automáticamente. +500 SHP.");
            }
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            setVezMejorada(getVezMejorada() + 1);
            System.out.println("Generador de Escudo de Emergencia mejorado al nivel " + getVezMejorada() + ".");
        } else {
            System.out.println("Nivel maximo de mejoras alcanzado.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Naves;

import com.mycompany.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class NaveAcorazado extends Nave{

    public NaveAcorazado(String nombreDeNave, int cantidadDeComponentes, String tipoDeNave, int puntosDeVida, int vidaMax, int velocidad, int puntosDeEscudo, int combustiblePremium, int puntosDeEnergia, int precioDeNave) {
        super(nombreDeNave, cantidadDeComponentes, tipoDeNave, puntosDeVida, vidaMax, velocidad, puntosDeEscudo, combustiblePremium, puntosDeEnergia, precioDeNave);
    }

    @Override
    public void aplicarAtaque(Nave naveAtacante, Nave naveObjetivo) {
    }

    @Override
    public void aplicarHabilidad() {
    }

    @Override
    public void aplicarEfectoDePiloto(Nave navePiloteada, Piloto pilotoEnTurno) {
    }


}

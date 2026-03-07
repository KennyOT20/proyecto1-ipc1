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
public class NaveCaza extends Nave {

    private final double evasionExtra;

    /**
     * Constructor que se encarga de enviar los siguientes parametros:
     * NombreDeNave, capacidadDeComponentes, vida, vidaMax, velocidad, combustiblePremium, puntosDeEnergia y precio de la nave
     */
    public NaveCaza() {
        super("Caza", 4, "Ligero", 200, 200 ,500, 300, 0, 400, 2000);
        this.evasionExtra = 0.20; 
    }
    
 

    @Override
    public void aplicarAtaque(Nave naveAtacante, Nave naveObjetivo) {
    }

    @Override
    public void aplicarHabilidad() {
        double nuevaEvasion = getEvasionBase() + evasionExtra;
        setEvasionBase(nuevaEvasion);
    }

    @Override
    public void aplicarEfectoDePiloto(Nave navePiloteada, Piloto pilotoEnTurno) {
    }
    
}

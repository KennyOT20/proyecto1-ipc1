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
public class CampoDeMinas extends Arma {

    public CampoDeMinas(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        int energiaNecesaria = getConsumoDeEnergia();
        
        if (naveElegida.getPuntosEnergia() >= energiaNecesaria) {
            
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia()- energiaNecesaria);
            
            naveElegida.setTieneCampoDeMinas(true);
            
            System.out.println("Campo de minas activado. La mina detonara despues del proximo ataque enemigo.");
        } else {
            System.out.println("Energia insuficiente para activar el campo de minas.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            
            setVezMejorada(getVezMejorada() + 1);
            
            int dañoActual = getDañoDeArma();
            int dañoMejorado = dañoActual + 30;
            setDañoDeArma(dañoMejorado);
            
            System.out.println("Campo de minas mejorado al nivel " + getVezMejorada() + ". Nuevo daño: " + dañoMejorado + ".");
        } else {
            System.out.println("El campo de minas ha alcanzado el nivel maximo de mejoras.");
        }
    }
}

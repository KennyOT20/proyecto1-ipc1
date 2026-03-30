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
public class CañonDeLones extends Arma {

    public CañonDeLones(int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, dañoDeArma, precioComponente);
    }

    @Override
    public void aplicarEfectoComponente(Nave naveElegida) {
        int energiaNecesaria = getConsumoDeEnergia(); 
        
        if (naveElegida.getPuntosEnergia() >= energiaNecesaria) {
            
            naveElegida.setPuntosEnergia(naveElegida.getPuntosEnergia() - energiaNecesaria);
            
            naveElegida.setCañonIonesActivo(true);
            
            System.out.println("Canon de iones activado. El proximo ataque tiene 30% de probabilidad de paralizar.");
        } else {
            System.out.println("Energia insuficiente para usar el canon de iones.");
        }
    }

    @Override
    public void mejorarComponente(ComponenteDeNave componente) {
        if (getVezMejorada() < getVECES_MAX_MEJORA()) {
            
            setVezMejorada(getVezMejorada() + 1);
            
            int dañoActual = getDañoDeArma();
            int dañoMejorado = dañoActual + 15;
            setDañoDeArma(dañoMejorado);
            
            System.out.println("Canon de iones mejorado al nivel " + getVezMejorada() + ". Nuevo daño: " + dañoMejorado + ".");
        } else {
            System.out.println("El canon de iones ha alcanzado el nivel maximo de mejoras.");
        }
    }
}
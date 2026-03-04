/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.Armas;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public abstract class Arma extends ComponenteDeNave {
    
    private final Random  random = new Random();
    private int dañoDeArma;

    public Arma(int consumoDeEnergia, int pesoComponente, String nombreComponente, int dañoDeArma) {
        super(consumoDeEnergia, pesoComponente, nombreComponente);
        this.dañoDeArma = dañoDeArma;
    }
    
    protected int  calcularAtaque(int valorInicial, int valorFinal){
        int valorCalculado = random.nextInt(valorInicial, valorFinal);
        return valorCalculado;
    }
    
    public int getDañoDeArma() {
        return dañoDeArma;
    }

    public void setDañoDeArma(int dañoDeArma) {
        this.dañoDeArma = dañoDeArma;
    }
    
    
    
}

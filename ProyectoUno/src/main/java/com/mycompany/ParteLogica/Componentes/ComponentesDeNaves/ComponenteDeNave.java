/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Componentes.ComponentesDeNaves;

import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Naves.Nave;


/**
 *
 * @author Kenny
 */
public abstract class ComponenteDeNave {
    
    private ControladorRandom random;
    private String tipoDeComponente;
    private int consumoDeEnergia; 
    private  String pesoComponente;
    private  String nombreComponente;
    private int VECES_MAX_MEJORA = 3;
    private int vezMejorada;
    private int precioDeVenta;
    private int precioComponente;

    public ComponenteDeNave(int consumoDeEnergia, String pesoComponente, String nombreComponente, String tipoDeComponente,
    int precioComponente ) {
        this.tipoDeComponente = tipoDeComponente;
        this.consumoDeEnergia = consumoDeEnergia;
        this.pesoComponente = pesoComponente;
        this.nombreComponente = nombreComponente;
        this.precioComponente = precioComponente;
        this.random = new ControladorRandom();
        
    }

    public abstract void aplicarEfectoComponente(Nave naveElegida);
    public abstract void mejorarComponente(ComponenteDeNave componente);
    
    public void calcularPrecioDeVenta(){
        precioDeVenta = precioComponente/ 2 + random.calcularNumeroAleatorios(0, precioComponente) * vezMejorada;
    }
    

    public int getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public String getPesoComponente() {
        return pesoComponente;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public String getTipoDeComponente() {
        return tipoDeComponente;
    }

    public int getVECES_MAX_MEJORA() {
        return VECES_MAX_MEJORA;
    }

    public int getVezMejorada() {
        return vezMejorada;
    }

    public int getPrecioComponente() {
        return precioComponente;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    
    
    
    
    

}

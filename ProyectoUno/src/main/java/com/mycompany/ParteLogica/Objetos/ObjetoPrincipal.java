/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Objetos;

import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public abstract class ObjetoPrincipal {
    
    private final ControladorRandom random;
    private String nombreDeObjeto;
    private int precioDeObjeto;
    private int precioDeVenta;

    public ObjetoPrincipal(String nombreDeObjeto, int precioDeObjeto) {
        this.nombreDeObjeto = nombreDeObjeto;
        this.precioDeObjeto = precioDeObjeto;
        this.random = new ControladorRandom();
        calcularPrecioDeVenta();
    }

    public abstract void efectoEspecialObjeto(Nave naveElegida);
    
    public final void calcularPrecioDeVenta(){
        int precioCalculado = random.calcularNumeroAleatorios(0, precioDeObjeto);
        precioDeObjeto = precioCalculado;
    }

    public String getNombreDeObjeto() {
        return nombreDeObjeto;
    }

    public int getPrecioDeObjeto() {
        return precioDeObjeto;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }
    
    
}



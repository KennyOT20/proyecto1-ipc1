/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos.ObjetoPrincipal;

import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public abstract class ObjetoPrincipal {
    
    private String nombreDeObjeto;
    private int precioDeObjeto;

    public ObjetoPrincipal(String nombreDeObjeto, int precioDeObjeto) {
        this.nombreDeObjeto = nombreDeObjeto;
        this.precioDeObjeto = precioDeObjeto;
    }

    public abstract void efectoEspecialObjeto(Nave naveElegida);

    public String getNombreDeObjeto() {
        return nombreDeObjeto;
    }

    public int getPrecioDeObjeto() {
        return precioDeObjeto;
    }
    
    
}



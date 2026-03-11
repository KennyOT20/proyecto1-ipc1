/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos.ObjetosDeCuracion;

import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public abstract class ObjetoDeCuracion extends ObjetoPrincipal {

    private int hpRecuperada; 
    
    public ObjetoDeCuracion(String nombreDeObjeto, int precioDeObjeto) {
        super(nombreDeObjeto, precioDeObjeto);
       
    }

}

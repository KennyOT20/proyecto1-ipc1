/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos.ObjetosDeEscape;

import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public abstract  class ObjetoDeEscape extends ObjetoPrincipal {

    private int cantidadCombustiblePremium; 
    private String tipoCombustible; 
    
    public ObjetoDeEscape(String nombreDeObjeto, int precioDeObjeto, int cantidadCombustiblePremium, String tipoCombustible ) {
        super(nombreDeObjeto, precioDeObjeto);
        this.cantidadCombustiblePremium = cantidadCombustiblePremium;
        this.tipoCombustible = tipoCombustible;
    }


}

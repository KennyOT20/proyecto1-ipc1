/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos.ObjetosDeEscudo;

import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public abstract class ObjetoDeEscudo extends ObjetoPrincipal{

    private int escudoReparado;
    
    public ObjetoDeEscudo(String nombreDeObjeto, int precioDeObjeto) {
        super(nombreDeObjeto, precioDeObjeto);
    }
    
}

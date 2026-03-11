/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos.ObjetosDeReparacion;


import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public abstract class ObjetoDeReparacion extends ObjetoPrincipal {

    public ObjetoDeReparacion(String nombreDeObjeto, int precioDeObjeto) {
        super(nombreDeObjeto, precioDeObjeto);
    }
    
    public abstract void repararObjeto(ComponenteDeNave componenteElegida);
}

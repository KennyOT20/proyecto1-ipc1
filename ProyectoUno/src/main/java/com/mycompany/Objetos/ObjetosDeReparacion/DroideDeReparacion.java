/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos.ObjetosDeReparacion;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class DroideDeReparacion extends ObjetoDeReparacion {

    public DroideDeReparacion(String nombreDeObjeto, int precioDeObjeto) {
        super(nombreDeObjeto, precioDeObjeto);
    }

    @Override
    public void repararObjeto(ComponenteDeNave componenteElegida) {
    }

    @Override
    public void efectoEspecialObjeto(Nave naveElegida) {
    }
    
}

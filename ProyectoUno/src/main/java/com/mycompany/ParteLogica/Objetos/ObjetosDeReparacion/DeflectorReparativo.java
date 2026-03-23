/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Objetos.ObjetosDeReparacion;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Naves.Nave;

/**
 *
 * @author Kenny
 */
public class DeflectorReparativo extends ObjetoDeReparacion {

    public DeflectorReparativo(String nombreDeObjeto, int precioDeObjeto) {
        super(nombreDeObjeto, precioDeObjeto);
    }

    @Override
    public void repararObjeto(ComponenteDeNave componenteElegida) {
    }

    @Override
    public void efectoEspecialObjeto(Nave naveElegida) {
    }
    
}

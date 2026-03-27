/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Objetos;

import com.mycompany.ParteLogica.Naves.Nave;


/**
 *
 * @author Kenny
 */
public class ObjetoDeEscape  extends ObjetoPrincipal{

    public ObjetoDeEscape(String nombreDeObjeto, int precioDeObjeto) {
        super(nombreDeObjeto, precioDeObjeto);
    }

    @Override
    public void efectoEspecialObjeto(Nave naveElegida) {
        naveElegida.setCombustiblePremium(naveElegida.getCombustiblePremium() + 100);
    }


}

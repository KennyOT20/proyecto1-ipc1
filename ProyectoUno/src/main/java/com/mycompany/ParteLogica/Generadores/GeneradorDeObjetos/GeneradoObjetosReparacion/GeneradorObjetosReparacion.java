/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Generadores.GeneradorDeObjetos.GeneradoObjetosReparacion;

import com.mycompany.ParteLogica.Objetos.ObjetosDeReparacion.DeflectorReparativo;
import com.mycompany.ParteLogica.Objetos.ObjetosDeReparacion.DinamoDeReparacion;
import com.mycompany.ParteLogica.Objetos.ObjetosDeReparacion.DroideDeReparacion;
import com.mycompany.ParteLogica.Objetos.ObjetosDeReparacion.ObjetoDeReparacion;
import com.mycompany.ParteLogica.Objetos.ObjetosDeReparacion.ReactorDeReparacion;

/**
 *
 * @author Kenny
 */
public class GeneradorObjetosReparacion {
    
    /**
     * Metodo encargado de ir iniciando los metodos de reparacion, recibe como parametros:
     * String nombreDeObjeto, int precioDeObjeto
     * @return 
     */
    public ObjetoDeReparacion crearDinamoReparacion(){
        return new DinamoDeReparacion("Dinamo de reparacion", 500);
    }
    
    public ObjetoDeReparacion crearDeflectorReparacion(){
        return new DeflectorReparativo("Reflector de reparacion", 1200);
    }
    
    public ObjetoDeReparacion crearDroideReparacion(){
        return new DroideDeReparacion("Droide reparativo", 800);
    }
    
    public ObjetoDeReparacion crearReactorReparativo(){
        return new ReactorDeReparacion("Reactor reparativo", 4000);
    }
    
}

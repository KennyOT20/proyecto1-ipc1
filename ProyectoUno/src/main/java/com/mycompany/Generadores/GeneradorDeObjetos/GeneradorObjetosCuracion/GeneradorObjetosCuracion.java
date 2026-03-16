/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeObjetos.GeneradorObjetosCuracion;

import com.mycompany.Objetos.ObjetosDeCuracion.DronDeCuracion;
import com.mycompany.Objetos.ObjetosDeCuracion.DroideDeHp;
import com.mycompany.Objetos.ObjetosDeCuracion.SistemaDeCuracion;
import com.mycompany.Objetos.ObjetosDeCuracion.ObjetoDeCuracion;

/**
 *
 * @author Kenny
 */
public class GeneradorObjetosCuracion {
    
    /**
     * Metodos encargados de ir creando los objetos de curacion, recibe como parametros:
     * String nombreDeObjeto, int precioDeObjeto
     * @return 
     */
    public ObjetoDeCuracion crearDroideCuracion(){
        return new DronDeCuracion("Dron de curacion", 5000);
    }
    
    public ObjetoDeCuracion crearHttps5(){
        return new DroideDeHp("Https35", 200);
    }
    
    public ObjetoDeCuracion crearIsotope5(){
        return new SistemaDeCuracion("Isotope5", 800);
    }
    
}

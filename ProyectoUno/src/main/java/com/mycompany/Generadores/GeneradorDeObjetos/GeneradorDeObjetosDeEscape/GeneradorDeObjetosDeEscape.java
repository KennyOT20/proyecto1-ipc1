/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeObjetos.GeneradorDeObjetosDeEscape;

import com.mycompany.Objetos.ObjetosDeEscape.Coaxium;
import com.mycompany.Objetos.ObjetosDeEscape.Hyppermatter;
import com.mycompany.Objetos.ObjetosDeEscape.ObjetoDeEscape;
import com.mycompany.Objetos.ObjetosDeEscape.Rydhonium;

/**
 *
 * @author Kenny
 */
public class GeneradorDeObjetosDeEscape {
    
    /**
     * Metodo encargado de crear los objetos de escape: 
     * String nombreDeObjeto, int precioDeObjeto, int cantidadCombustiblePremium, String tipoCombustible 
     * @return 
     */
    public ObjetoDeEscape crearCoaxium(){
        return new Coaxium("Coaxium", 13000, 700, "Combustible general"); 
    }
    
    public ObjetoDeEscape crearHyppermatter(){
        return new Hyppermatter("Hyppermatter", 200, 2000, "Combustible medio");
        
    }
    
    public ObjetoDeEscape  crearRydhonium(){
        return new Rydhonium("Rydhonium", 500, 4000, "Combustible ligero");
    }
    
    
}

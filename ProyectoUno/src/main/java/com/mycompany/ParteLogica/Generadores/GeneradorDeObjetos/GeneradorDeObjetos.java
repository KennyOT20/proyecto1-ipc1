/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Generadores.GeneradorDeObjetos;

import com.mycompany.ParteLogica.Objetos.ObjetoDeEscape;
import com.mycompany.ParteLogica.Objetos.ObjetoDeMejora;
import com.mycompany.ParteLogica.Objetos.ObjetoDeReparacion;
import com.mycompany.ParteLogica.Objetos.ObjetoDeSabotaje;
import com.mycompany.ParteLogica.Objetos.ObjetoDeVelocidad;
import com.mycompany.ParteLogica.Objetos.ObjetoPrincipal;

/**
 *
 * @author Kenny
 */
public class GeneradorDeObjetos {
    
    public ObjetoPrincipal crearEscape(){
        return new ObjetoDeEscape("Objeto de escape", 0);
    }
    
    public ObjetoPrincipal crearEscudo(){
        return new ObjetoDeMejora("Objeto de escudo", 0);
    }
    
    public ObjetoPrincipal crearReparacion(){
        return new ObjetoDeReparacion("Objeto de reparacion", 0 );
    }
    
    public ObjetoPrincipal crearDeMejora(){
        return new ObjetoDeMejora("Objeto de mejora", 0);
    }
    
    public ObjetoPrincipal objetoDeSabotaje(){
        return new ObjetoDeSabotaje("Objeto de sabotaje", 0);
    }
    
    public ObjetoPrincipal objetoDeVelocidad(){
        return new ObjetoDeVelocidad("Objeto de velocidad", 0);
    }
    
}

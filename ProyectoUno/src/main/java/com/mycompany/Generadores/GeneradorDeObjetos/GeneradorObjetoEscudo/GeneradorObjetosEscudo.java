/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeObjetos.GeneradorObjetoEscudo;

import com.mycompany.Objetos.ObjetosDeEscudo.CupulaDeHierro;
import com.mycompany.Objetos.ObjetosDeEscudo.HydroSpanner;
import com.mycompany.Objetos.ObjetosDeEscudo.MouseDroide;
import com.mycompany.Objetos.ObjetosDeEscudo.ObjetoDeEscudo;

/**
 *
 * @author Kenny
 */
public class GeneradorObjetosEscudo {
    
    /**
     * Metodos encargados de ir creando los objetos de escudo, reciben como parametro:
     * 
     * String nombreDeObjeto, int precioDeObjeto
     * @return 
     */
    public ObjetoDeEscudo crearCupulaDeHierro(){
        return new CupulaDeHierro("Cupula de hierro", 600);
    }
    
    public ObjetoDeEscudo crearMouseDroide(){
        return new MouseDroide("Mouse Droide", 4000);
    }
    
    public ObjetoDeEscudo crearHydroSpanner(){
        return new HydroSpanner("HydroSpanner", 700);
    }
}

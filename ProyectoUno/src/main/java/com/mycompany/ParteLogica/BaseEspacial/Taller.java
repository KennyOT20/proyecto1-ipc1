/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.BaseEspacial;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Personajes.Jugador;

/**
 *
 * @author Kenny
 */
public class Taller {
    
    
    public boolean repararNave(Nave nave, Jugador jugador){
         
        int precioReparacion = nave.calcularPrecioReparacion();
        
        if(jugador.getCreditosGalacticos() >= precioReparacion ) {
            if(nave.getPuntosDeVida() < nave.getVidaMax() ||  nave.getPuntosDeEnergia() < nave.getPuntosDeEnergiaMax()
                    || nave.getEscudo() < nave.getPuntosDeEscudoMax()){
                nave.setPuntosDeVida(nave.getVidaMax());
                nave.setPuntosDeEnergia(nave.getPuntosDeEnergiaMax());
                nave.setEscudo(nave.getPuntosDeEscudoMax());
                jugador.setCreditosGalacticos(jugador.getCreditosGalacticos() - precioReparacion);
            
                return true;
            } 
            return false;
            
        } else{
            return false;
        }
    }
    
}

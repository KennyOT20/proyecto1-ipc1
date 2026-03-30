/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Mapas.Mapas;

/**
 *
 * @author Kenny
 */
public class GestionarMovimientos  {
    
    private final MapaBase mapaBase;
    
    public GestionarMovimientos(MapaBase mapaBase){
        this.mapaBase = mapaBase;
    }
    
    
     public boolean calcularMovimientos(String movimiento){
            
            switch(movimiento){
                case "W" :
                     int coordenadaArriba = mapaBase.getJugador().getPosicionX() - 1;
                     if(coordenadaArriba >= 0){
                     mapaBase.getJugador().setPosicionX(coordenadaArriba);
                     return true;
                     } else {
                         return false;
                     }
                case "S" :
                    int coordenadaAbajo = mapaBase.getJugador().getPosicionX()  + 1;
                    if(coordenadaAbajo < mapaBase.getCantidadFilas()){
                    mapaBase.getJugador().setPosicionX(coordenadaAbajo);
                    return true;
                    } else{
                         return false;
                    }
                case "D" :
                     int coordenadaDerecha = mapaBase.getJugador().getPosicionY() + 1;
                     if(coordenadaDerecha < mapaBase.getCantidadColumnas()) {
                     mapaBase.getJugador().setPosicionY(coordenadaDerecha);
                     return true;
                     } else {
                         return false;
                     }
                case "A" :
                     int coordenadaIzquierda = mapaBase.getJugador().getPosicionY() - 1;
                     if(coordenadaIzquierda >= 0){
                     mapaBase.getJugador().setPosicionY(coordenadaIzquierda);
                     return true;
                     }
                     else {
                          return false;
                     }
                default: 
                   return false;
            }
        }
    
}

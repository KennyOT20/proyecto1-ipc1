/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.BaseEspacial;

import com.mycompany.ParteLogica.Arreglos.ArregloDePilotos.ArregloDePilotos;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteLogica.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class Barraca {
    private final ArregloDePilotos pilotos;
    private final Partida partida;
    
    public Barraca(Partida partida){
        this.pilotos = new ArregloDePilotos();
        this.partida = partida;
        pilotos.generarArregloPiloto();
    }
    
    public boolean validarCompra(Piloto pilotoComprado){
        int crJugador = partida.getJugador().getCreditosGalacticos();
        int precioPiloto = pilotoComprado.getPrecioPiloto();
        
        if(crJugador >= precioPiloto){
            partida.getJugador().getInventarioPilotos().agregarPiloto(pilotoComprado);
            partida.getJugador().setCreditosGalacticos(crJugador - precioPiloto);
            return true;
        } else {
            return false;
        }
        
    }

    public ArregloDePilotos getPilotos() {
        return pilotos;
    }
    
    
}

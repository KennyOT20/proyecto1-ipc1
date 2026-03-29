/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Inventarios;

import com.mycompany.ParteLogica.Personajes.Flota;
import com.mycompany.ParteVisual.Bordes.Bordes;

/**
 *
 * @author Kenny
 */
public class MostrarFlota extends Bordes {
    
    private final Flota flota;
    
    public MostrarFlota(Flota flota){
        this.flota = flota;
    }
    
    public void mostrarFlota(){
        int cantidadFlota = flota.getNaves().length;
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves en flota");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nave:                     Piloto abordo:   ");
         
        for (int i = 0; i <cantidadFlota; i++) {
           if(flota.getNaves()[i] != null){
            String nombreDeNave = flota.getNaves()[i].getNombreDeNave();
            String pilotoAbordo = flota.getNaves()[i].getPiloto()[0].getNombrePiloto();
            
            while(nombreDeNave.length() < 25){
                nombreDeNave += " ";
            }

            while(pilotoAbordo.length() < 20){
                pilotoAbordo += " ";
            }

            String lineaDeTexto = (i + 1) + ". " + nombreDeNave + pilotoAbordo;

            imprimirLineaDeTexto(lineaDeTexto);
                   }
        }

    }
}

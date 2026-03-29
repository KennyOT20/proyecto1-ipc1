/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Inventarios;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteVisual.Bordes.Bordes;

/**
 *
 * @author Kenny
 */
public class MostrarNave extends Bordes{
    
    
    public void visualizarEspacionNave(Nave naveElegida){
        
        imprimirBordeDeMenu();
        
        for (int i = 0; i < naveElegida.getComponentesDeNave().length; i++) {

            String linea = (i + 1) + ". ";

            if(naveElegida.getComponentesDeNave()[i] == null){
                linea += "Espacio vacio";
            } else {
                String nombre = naveElegida.getComponentesDeNave()[i].getNombreComponente();
                linea += nombre;
            }

            imprimirLineaDeTexto(linea);
        }
        
        imprimirBordeDeMenu();
    }
}

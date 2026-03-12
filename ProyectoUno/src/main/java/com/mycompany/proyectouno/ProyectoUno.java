/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectouno;

import com.mycompany.Mapas.Mapas.MapaBase;
import com.mycompany.Menus.MenuInicial.MenuInicial;


/**
 *
 * @author Kenny
 */
public class ProyectoUno {

    public static void main(String[] args) {
        
        MapaBase mapaBase = new MapaBase(25, 30);
        mapaBase.generarMapa();
        mapaBase.imprimirMapa();

    }
}

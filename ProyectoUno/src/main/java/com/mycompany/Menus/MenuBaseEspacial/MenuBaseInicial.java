/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial;

import com.mycompany.BaseEspacial.Barraca;
import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MenuBaseInicial extends MenuBase {

    private final Partida partida;

    public MenuBaseInicial(Partida partida) {
        this.partida = partida;
    }
            
            
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Base Espacial");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Tienda");
        imprimirLineaDeTexto("2. Taller");
        imprimirLineaDeTexto("3. Barraca");
        imprimirLineaDeTexto("4. Volver al mapa");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                Barraca barraca = new Barraca();
                barraca.mostrarPilotos();
                break;
            case 4:
                partida.getMapaGalactico().imprimirMapa();
                break;
        }
    }
    
}

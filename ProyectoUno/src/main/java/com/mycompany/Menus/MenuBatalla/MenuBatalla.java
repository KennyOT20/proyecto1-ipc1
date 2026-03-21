/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBatalla;

import com.mycompany.Menus.MenuBase.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuBatalla extends MenuBase{

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Ingrese una opcion para contraatacar. ");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Atacar");
        imprimirLineaDeTexto("2. Activar componente");
        imprimirLineaDeTexto("3. Usar objeto");
        imprimirLineaDeTexto("4. Saltar turno");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    
}

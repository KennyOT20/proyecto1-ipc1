/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral;

import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraNave;

/**
 *
 * @author Kenny
 */
public class MenuTiendaGeneral extends MenuBase {

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Comprar");
        imprimirLineaDeTexto("2. Vender");
        imprimirLineaDeTexto("3. Regresar al menu de base espacial");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                MenuCompraNave compra = new MenuCompraNave();
                compra.mostrarInformacion();
                break;
            case 2:
                break;
            case 3:
                break;
                
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.Menus.MenuBase.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuDeCompras extends MenuBase{


    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Compra de accesorios");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Naves");
        imprimirLineaDeTexto("2. Componentes de nave");
        imprimirLineaDeTexto("3. Objetos de consumo");
        imprimirLineaDeTexto("4. Volver al menu de tienda");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

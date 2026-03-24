/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteVisual.Menus.MenuBase.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuDeVentas extends MenuBase{


    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de accesorios");
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

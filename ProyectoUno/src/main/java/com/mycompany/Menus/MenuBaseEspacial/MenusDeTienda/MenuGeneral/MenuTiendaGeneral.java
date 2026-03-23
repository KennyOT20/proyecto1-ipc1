/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral;

import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Menus.MenuBaseEspacial.MenuBaseInicial.MenuBaseInicial;
import com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MenuTiendaGeneral extends MenuBase {

    private MenuBaseInicial menuBaseEspacial;
    private final Partida partida;
    
    public MenuTiendaGeneral(MenuBaseInicial menuBaseEspacial, Partida partida){
        this.menuBaseEspacial = menuBaseEspacial;
        this.partida = partida;
    }
    
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
                MenuOpcionesCompra comprar = new MenuOpcionesCompra(partida);
                limpiarPantalla();
                comprar.mostrarInformacion();
                break;
            case 2:
                break;
            case 3:
                limpiarPantalla();
                menuBaseEspacial.mostrarInformacion();
                break;
                
        }
    }
    
}

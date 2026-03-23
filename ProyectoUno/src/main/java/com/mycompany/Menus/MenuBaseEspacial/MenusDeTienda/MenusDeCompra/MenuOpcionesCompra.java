/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MenuOpcionesCompra extends MenuBase {

    private final Partida partida;
    
    public MenuOpcionesCompra(Partida partida){
        this.partida = partida;
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Que deseas comprar");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Naves");
        imprimirLineaDeTexto("2. Componentes");
        imprimirLineaDeTexto("3. Objetos de consumo");
        imprimirLineaDeTexto("4. Volver al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                MenuCompraDeNaves comprarNaves = new MenuCompraDeNaves(this, partida);
                limpiarPantalla();
                comprarNaves.mostrarInformacion();
                break;
            case 2:
                break;
            case 3: 
                break;
            case 4:
                break;
            default:
                break;
        }
    
    }
}

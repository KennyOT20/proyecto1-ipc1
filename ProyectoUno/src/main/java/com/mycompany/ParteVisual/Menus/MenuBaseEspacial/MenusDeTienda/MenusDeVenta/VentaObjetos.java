/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class VentaObjetos extends MenuCompraVenta {

    public VentaObjetos(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
    }

    @Override
    public void mostrarOpciones() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Que desea vender");
        imprimirBordeDeMenu();
        mostrarInformacion();
        validarOpcion();
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion");
    }

    @Override
    public void mostrarInformacion() {
        imprimirLineaDeTexto("1. Naves ");
        imprimirLineaDeTexto("2. Pilotos");
        imprimirLineaDeTexto("3. Componentes");
        imprimirLineaDeTexto("4. Objetos");
        imprimirLineaDeTexto("5. Volver al menu anterior");
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
                
            
        }
    }
    
}

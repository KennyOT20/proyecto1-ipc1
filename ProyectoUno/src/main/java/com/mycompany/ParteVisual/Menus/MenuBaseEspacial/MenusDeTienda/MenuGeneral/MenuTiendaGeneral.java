/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral;

import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenuBaseInicial.MenuBaseInicial;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta.MenuDeVentas;

/**
 *
 * @author Kenny
 */
public class MenuTiendaGeneral extends MenuBase {

    private MenuBaseInicial menuBaseEspacial;
    private final Inventarios inventario;
    private final Partida partida;
    private final MenuOpcionesCompra opciones;
    
    public MenuTiendaGeneral(MenuBaseInicial menuBaseEspacial, Partida partida, Inventarios inventario){
        this.menuBaseEspacial = menuBaseEspacial;
        this.partida = partida;
        this.inventario = inventario;
        this.opciones = new MenuOpcionesCompra(partida, this);
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Comprar");
        imprimirLineaDeTexto("2. Vender");
        imprimirLineaDeTexto("3. Ver inventario");
        imprimirLineaDeTexto("4. Regresar al menu de base espacial");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                MenuOpcionesCompra comprar = new MenuOpcionesCompra(partida, this);
                limpiarPantalla();
                comprar.mostrarInformacion();
                break;
            case 2:
                MenuDeVentas menuVender = new MenuDeVentas( partida, inventario, this);
                limpiarPantalla();
                menuVender.mostrarInformacion();
                break;
            case 3:
               mostrarInventario();
                break;
            case 4:
                limpiarPantalla();
                menuBaseEspacial.mostrarInformacion();
                break;
            default: 
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo.");
                mostrarInformacion();
                break;
        }
    }
    
    private void mostrarInventario(){
        limpiarPantalla();
        inventario.mostraInventarioNaves();
        inventario.mostrarPilotos();
        inventario.mostrarObjetos();
        inventario.mostrarComponentes();

        System.out.print("Presione cualquier tecla para continuar: ");
        getScanner().nextLine();
        limpiarPantalla(); 
        mostrarInformacion();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral;

import com.mycompany.ParteLogica.Inventarios.InventarioComponente;
import com.mycompany.ParteLogica.Inventarios.InventarioNave;
import com.mycompany.ParteLogica.Inventarios.InventarioObjetos;
import com.mycompany.ParteLogica.Inventarios.InventarioPilotos;
import com.mycompany.ParteVisual.Menus.MenuBase.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenuBaseInicial.MenuBaseInicial;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;

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
                break;
            case 3:
                limpiarPantalla();
                mostrarInventario();
                getScanner().nextLine();
                limpiarPantalla();
                mostrarInformacion();
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
        InventarioComponente inventarioComponente = partida.getJugador().getInventarioComponentes();
                InventarioNave inventarioDeNaves = partida.getJugador().getInventarioNaves();
                InventarioObjetos inventarioDeObjetos = partida.getJugador().getInventarioObjetos();
                InventarioPilotos inventarioDePilotos = partida.getJugador().getInventarioPilotos();
                Inventarios inventario = new Inventarios(inventarioComponente, inventarioDeNaves, inventarioDeObjetos, inventarioDePilotos);
                inventario.mostraInventarioNaves();
                inventario.mostrarPilotos();
                inventario.mostrarObjetos();
                inventario.mostrarComponentes();
                System.out.print("Presione enter para continuar");
    }
    
}

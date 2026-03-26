/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraDeComponentes;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBase.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class MenuComponentes extends MenuBase{
    
    private final MenuOpcionesCompra menuCompra;
    private final Partida partida;

    public MenuComponentes(MenuOpcionesCompra menuCompra, Partida partida) {
        this.menuCompra = menuCompra;
        this.partida = partida;
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Compra de Componentes");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Armas");
        imprimirLineaDeTexto("2. Propulsores");
        imprimirLineaDeTexto("3. Sistemas de apoyo");
        imprimirLineaDeTexto("4. Escudos");
        imprimirLineaDeTexto("5. Regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        switch(opcion){
            case 1: 
                MenuArmas armas = new MenuArmas(menuCompra, partida);
                limpiarPantalla();
                armas.mostrarInformacion();
                break;
            case 2: 
                MenuPropulsores propulsores = new MenuPropulsores(menuCompra, partida);
                limpiarPantalla();
                propulsores.mostrarInformacion();
                break;
            case 3: 
                MenuSistemas comprarSistema = new MenuSistemas(menuCompra, partida);
                limpiarPantalla();
                comprarSistema.mostrarInformacion();
                break;
            case 4: 
                MenuEscudos menuEscudos = new MenuEscudos(menuCompra, partida);
                limpiarPantalla();
                menuEscudos.mostrarInformacion();
                break;
            case 5: 
                limpiarPantalla();
                menuCompra.mostrarInformacion();
                break;
            default: 
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                mostrarInformacion();
                break;
        }
    }

    
    
}

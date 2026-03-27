/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenuBaseInicial;

import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenuBarraca.MenuBarraca;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral.MenuTiendaGeneral;
import com.mycompany.ParteVisual.Menus.MenusDePartida.MenuPartidaInicial;
import com.mycompany.ParteLogica.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MenuBaseInicial extends MenuBase {

    private final Partida partida;
    private final MenuPartidaInicial menuPartida;

    public MenuBaseInicial(Partida partida) {
        this.partida = partida;
        this.menuPartida = new MenuPartidaInicial(partida);
    }
            
            
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Base Espacial");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Tienda");
        imprimirLineaDeTexto("2. Taller");
        imprimirLineaDeTexto("3. Barraca");
        imprimirLineaDeTexto("4. Volver al mapa");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                MenuTiendaGeneral menuTienda = new MenuTiendaGeneral(this, partida);
                limpiarPantalla();
                menuTienda.mostrarInformacion();
                break;
            case 2:
                break;
            case 3:
                MenuBarraca barraca = new MenuBarraca(partida, this);
                limpiarPantalla();
                barraca.mostrarInformacion();
                break;
            case 4:
                limpiarPantalla();
                menuPartida.mostrarSimbologia();
                partida.getMapaGalactico().imprimirMapa();
                menuPartida.mostrarInformacion();
                break;
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo.");
                mostrarInformacion();
                break;
        }
    }
    
}

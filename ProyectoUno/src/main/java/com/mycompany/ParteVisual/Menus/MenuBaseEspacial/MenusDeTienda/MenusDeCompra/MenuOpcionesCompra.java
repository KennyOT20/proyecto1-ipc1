/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.ParteVisual.Menus.MenuBase.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral.MenuTiendaGeneral;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraDeComponentes.MenuComponentes;

/**
 *
 * @author Kenny
 */
public class MenuOpcionesCompra extends MenuBase {

    private final MenuTiendaGeneral menuGeneral;
    private final Partida partida;
    
    public MenuOpcionesCompra(Partida partida, MenuTiendaGeneral menuGeneral){
        this.partida = partida;
        this.menuGeneral = menuGeneral;
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
                MenuComponentes comprarComponentes = new MenuComponentes(this, partida);
                limpiarPantalla();
                comprarComponentes.mostrarInformacion();
                break;
            case 3: 
                MenuObjetos menuObjetos = new MenuObjetos(this, partida);
                limpiarPantalla();
                menuObjetos.mostrarInformacion();
                break;
            case 4:
                limpiarPantalla();
                menuGeneral.mostrarInformacion();
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaVenta;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuGeneral.MenuTiendaGeneral;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuDeVentas extends MenuBase{

    private final Inventarios inventarios;
    private final TiendaVenta tiendaVenta;
    private final Partida partida;
    private final MenuTiendaGeneral menuGeneral;

    public MenuDeVentas( Partida partida, Inventarios inventarios, MenuTiendaGeneral menuGeneral) {
        this.partida = partida;
        this.tiendaVenta = new TiendaVenta(partida);
        this.inventarios = inventarios;
        this.menuGeneral = menuGeneral;
    }
    
    

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de accesorios");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Naves");
        imprimirLineaDeTexto("2. Componentes de nave");
        imprimirLineaDeTexto("3. Objetos de consumo");
        imprimirLineaDeTexto("4. Pilotos");
        imprimirLineaDeTexto("5. Volver al menu de tienda");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                VentaNave venderNave = new VentaNave( inventarios, partida, tiendaVenta, this);
                limpiarPantalla();
                venderNave.mostrarOpciones();
                break;
            case 2:
                VentaComponente venderComponente = new VentaComponente(inventarios, partida,tiendaVenta, this);
                limpiarPantalla();
                venderComponente.mostrarInformacion();
                break;
            case 3:
                MenuVentaObjetos venderObjetos = new MenuVentaObjetos(inventarios, partida,tiendaVenta, this);
                limpiarPantalla();
                venderObjetos.mostrarInformacion();
                break;
            case 4:
                VentaPiloto venderPiloto = new VentaPiloto(inventarios, partida,tiendaVenta, this);
                limpiarPantalla();
                venderPiloto.mostrarInformacion();
                break;
            case 5:
                limpiarPantalla();
                menuGeneral.mostrarInformacion();
                break;
            default:
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                imprimirBordeDeMenu();
                mostrarInformacion();
                break;
        }
    }

    
}

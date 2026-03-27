/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class VentaNave extends MenuModelo{

    private final Inventarios inventario; 

    public VentaNave(MenuOpcionesCompra menuOpciones, Partida partida, Inventarios inventario) {
        super(menuOpciones, partida);
        this.inventario = inventario;
    }

    

    @Override
    public void mostrarOpciones() {
        String crJugador = "CR: " + String.valueOf(getPartida().getJugador().getCreditosGalacticos());
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de naves");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Que nave deseas vender.");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(crJugador);
        imprimirBordeDeMenu();
        
    }

    @Override
    public void mostrarInformacion() {
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

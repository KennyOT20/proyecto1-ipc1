/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaCompra;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public abstract  class MenuCompraVenta extends MenuBase{
    
    private final MenuOpcionesCompra menuOpciones;
    private final Partida partida;
    private final TiendaCompra tienda;

    public MenuCompraVenta(MenuOpcionesCompra menuOpciones, Partida partida ){
        this.menuOpciones = menuOpciones;
        this.partida = partida;
        this.tienda = new TiendaCompra(partida);
    }
    
    public abstract void mostrarOpciones();

    public MenuOpcionesCompra getMenuOpciones() {
        return menuOpciones;
    }

    public Partida getPartida() {
        return partida;
    }

    public TiendaCompra getTienda() {
        return tienda;
    }
    
    
    
    
}

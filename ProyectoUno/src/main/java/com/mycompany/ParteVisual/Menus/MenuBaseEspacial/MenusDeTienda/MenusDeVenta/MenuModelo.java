/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaVenta;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public abstract class MenuModelo extends MenuCompraVenta{
    
    private final TiendaVenta vender;
    
    public MenuModelo(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.vender = new TiendaVenta(partida);
    }

    public TiendaVenta getVender() {
        return vender;
    }
    
    
    
}

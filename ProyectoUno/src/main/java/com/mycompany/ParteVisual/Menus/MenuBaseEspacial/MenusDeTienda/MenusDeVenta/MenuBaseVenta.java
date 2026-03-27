/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaVenta;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public abstract class MenuBaseVenta extends MenuBase{
    
    private final Inventarios inventario; 
    private final Partida partida;
    private final TiendaVenta vender;
    private final MenuDeVentas menuVentas;

    public MenuBaseVenta(Inventarios inventario, Partida partida, TiendaVenta vender, MenuDeVentas menuVentas) {
        this.inventario = inventario;
        this.partida = partida;
        this.vender = vender;
        this.menuVentas = menuVentas;
    }
    
    public abstract void mostrarDatosDeVenta(int opcion);

    public Inventarios getInventario() {
        return inventario;
    }

    public Partida getPartida() {
        return partida;
    }

    public TiendaVenta getVender() {
        return vender;
    }

    public MenuDeVentas getMenuVentas() {
        return menuVentas;
    }

    
    
    


    
    
}

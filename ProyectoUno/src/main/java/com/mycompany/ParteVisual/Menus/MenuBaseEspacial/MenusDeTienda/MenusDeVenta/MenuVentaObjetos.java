/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaVenta;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;

/**
 *
 * @author Kenny
 */
public class MenuVentaObjetos extends MenuBaseVenta{

    public MenuVentaObjetos(Inventarios inventario, Partida partida, TiendaVenta vender, MenuDeVentas menuVentas) {
        super(inventario, partida, vender, menuVentas);
    }

    @Override
    public void mostrarDatosDeVenta(int opcion) {
    }

    @Override
    public void mostrarInformacion() {
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

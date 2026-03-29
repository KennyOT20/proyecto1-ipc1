/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Inventarios.MostrarNave;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuReparacion extends MenuBase {
    
    private final MenuTaller menuTaller;
    private final Partida partida;
    private final Inventarios inventario;
    private final MostrarNave mostrarNave;
    
    public MenuReparacion(MenuTaller menuTaller, Partida partida, Inventarios inventario){
        this.menuTaller = menuTaller;
        this.partida = partida;
        this.inventario = inventario;
        this.mostrarNave = new MostrarNave();
    }

    @Override
    public void mostrarInformacion() {
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

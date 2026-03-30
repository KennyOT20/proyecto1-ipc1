/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusFlota;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuAgregarNave extends MenuBase {

    private final Inventarios inventario;
    private final Partida partida;
    private final Nave nave;
    private final MenuFlota menuFlota;
    
    private MenuAgregarNave(Partida partida, MenuFlota menuFlota, Inventarios inventario ){
        this.nave = null;
        this.partida = partida;
        this.menuFlota = menuFlota;
        this.inventario = inventario;
    }
    
    @Override
    public void mostrarInformacion() {
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

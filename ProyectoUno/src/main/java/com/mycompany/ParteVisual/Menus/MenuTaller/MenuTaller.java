/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenuBaseInicial.MenuBaseInicial;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuTaller extends MenuBase {

    private final Inventarios inventario;
    private final Partida partida;
    private final MenuBaseInicial menuBase;

    public MenuTaller(Inventarios inventario, Partida partida,  MenuBaseInicial menuBase) {
        this.inventario = inventario;
        this.partida = partida;
        this.menuBase = menuBase;
    }
     
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Taller");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Reparar nave");
        imprimirLineaDeTexto("2. Equipar componentes o  pilotos");
        imprimirLineaDeTexto("3. Mejorar componete ");
        imprimirLineaDeTexto("4. Regresar al menu anterior");
        imprimirBordeDeMenu();
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
              
                break;
            case 2:
                MenuElegiNave elegirNave = new MenuElegiNave(inventario, partida, this);
                limpiarPantalla();
                elegirNave.mostrarInformacion();
                break;
            case 3:
                break;
            case 4:
                limpiarPantalla();
                menuBase.mostrarInformacion();
                break;
            default:
                break;
                
            
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusFlota;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuFlota extends MenuBase {

    private final Partida partida;
    
    public MenuFlota(Partida partida){
        this.partida = partida;
    }
    
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Editar Flota");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Agregar naves");
        imprimirLineaDeTexto("2. Eliminar naves");
        imprimirLineaDeTexto("3. Regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        switch(opcion){
            case 1:
                break;
            case 2:
                MenuEliminarNave eliminarNave = new MenuEliminarNave(partida, this);
                limpiarPantalla();
                eliminarNave.mostrarInformacion();
                break;
            case 3:
                break;
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo.");
                imprimirBordeDeMenu();
                mostrarInformacion();
                break;
    }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteVisual.Menus.MenuTaller.MenuEquipacion.MenuEleccionNaveE;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenuEquipacion.MenuEleccionNaveD;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenuBaseInicial.MenuBaseInicial;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenusPilotos.MenuOpcionesPiloto;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenusPilotos.MenuEliminarPiloto;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenusPilotos.MenuEliminarPilotoOpciones;

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
        imprimirLineaDeTexto("2. Equipar componentes");
        imprimirLineaDeTexto("3. Desquipar componentes");
        imprimirLineaDeTexto("4. Equipar piloto");
        imprimirLineaDeTexto("5. Desequipar piloto");
        imprimirLineaDeTexto("6. Mejorar componete ");
        imprimirLineaDeTexto("7. Regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                MenuReparacion menuReparar = new MenuReparacion(this, partida, inventario);
                limpiarPantalla();
                menuReparar.mostrarInformacion();
                break;
            case 2:
                MenuEleccionNaveE elegirNave = new MenuEleccionNaveE(inventario, partida, this);
                limpiarPantalla();
                elegirNave.mostrarInformacion();
                break;
            case 3:
                MenuEleccionNaveD eleccion = new MenuEleccionNaveD(partida, inventario, this);
                limpiarPantalla();
                eleccion.mostrarInformacion();
                break;
            case 4:
                MenuOpcionesPiloto agregarPiloto = new MenuOpcionesPiloto(partida, inventario, this);
                limpiarPantalla();
                agregarPiloto.mostrarInformacion();
                break;
            case 5:
                MenuEliminarPilotoOpciones eliminarPiloto = new MenuEliminarPilotoOpciones(partida, inventario, this);
                limpiarPantalla();
                eliminarPiloto.mostrarInformacion();
                break;
            case 6:
                break;
            case 7:
                limpiarPantalla();
                menuBase.mostrarInformacion();
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

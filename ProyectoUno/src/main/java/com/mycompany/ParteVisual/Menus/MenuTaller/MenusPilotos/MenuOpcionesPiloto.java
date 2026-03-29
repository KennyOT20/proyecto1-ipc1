/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller.MenusPilotos;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenuTaller;

/**
 *
 * @author Kenny
 */
public class MenuOpcionesPiloto extends MenuBase {

    private final Partida partida;
    private final Inventarios inventario;
    private final MenuTaller menuTaller;

    public MenuOpcionesPiloto(Partida partida, Inventarios inventario, MenuTaller menuTaller) {
        this.partida = partida;
        this.inventario = inventario;
        this.menuTaller = menuTaller;
    }
    
    
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves ");
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirLineaDeTexto("0. Regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int cantidadDeNaves = partida.getJugador().getInventarioNaves().getCantidadArreglo();
        
        if(opcion == 0){
            limpiarPantalla();
            menuTaller.mostrarInformacion();
        }
        
        if(opcion > 0 && opcion <= cantidadDeNaves){
            limpiarPantalla();
            Nave naveObtenida = partida.getJugador().getInventarioNaves().eliminarNave(opcion);
            MenuAgregarPiloto menuAgregar = new MenuAgregarPiloto(partida, inventario, menuTaller);
            menuAgregar.ObtenerNave(naveObtenida);
            menuAgregar.mostrarInformacion();
        } else {
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }
    
}

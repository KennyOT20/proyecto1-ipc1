/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller.MenuEquipacion;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenuTaller;

/**
 *
 * @author Kenny
 */
public class MenuEleccionNaveE extends MenuBase{
    
    private final MenuTaller menuTaller;
    private final Inventarios inventario;
    private final Partida partida;
    
    public MenuEleccionNaveE(Inventarios inventario, Partida partida, MenuTaller menuTaller) {
        this.inventario = inventario;
        this.partida = partida; 
        this.menuTaller = menuTaller;
        
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Taller de ensamblaje");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Elija una nave para agregarle componentes");
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Elija una opcion: ");
        validarOpcion();
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        int cantidadDeNaves = partida.getJugador().getInventarioNaves().getCantidadArreglo();
        if(opcion == 0){
            limpiarPantalla();
            menuTaller.mostrarInformacion();
        } 
        
        if(opcion > 0  && opcion <= cantidadDeNaves){
           Nave naveObtenida =  partida.getJugador().getInventarioNaves().eliminarNave(opcion);
           MenuEnsamblaje ensamblarNave = new MenuEnsamblaje(partida, inventario, menuTaller);
           limpiarPantalla();
           ensamblarNave.obtenerNave(naveObtenida);
           ensamblarNave.mostrarInformacion();
        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    } 

    
}

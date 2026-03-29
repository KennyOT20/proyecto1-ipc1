/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuEleccionNaveD extends MenuBase{

    private final Partida partida; 
    private final Inventarios inventario;
    private final MenuTaller menuTaller;

    public MenuEleccionNaveD(Partida partida, Inventarios inventario, MenuTaller menuTaller) {
        this.partida = partida;
        this.inventario = inventario;
        this.menuTaller = menuTaller;
    }
    
    
    
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Taller de desequipamiento");
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Para regresar al menu anterior");
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
            Nave naveObtenida = partida.getJugador().getInventarioNaves().eliminarNave(opcion);
            MenuDesequipar desequipar = new MenuDesequipar(partida, inventario, menuTaller);
            limpiarPantalla();
            desequipar.obtenerNave(naveObtenida);
            desequipar.mostrarInformacion();
        } else {
            limpiarPantalla();
            imprimirLineaDeTexto("Opcion incorrecta, intente de nuevo");
            mostrarInformacion();
        }
    }
    
}

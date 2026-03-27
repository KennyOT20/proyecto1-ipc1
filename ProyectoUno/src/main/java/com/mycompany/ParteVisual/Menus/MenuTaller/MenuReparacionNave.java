/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.BaseEspacial.Taller;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuReparacionNave extends MenuBase{
    
    private final MenuTaller menuTaller;
    private final Inventarios inventario;
    private final Partida partida;
    private final Taller taller;
    
    public MenuReparacionNave(Inventarios inventario, Partida partida, MenuTaller menuTaller) {
        this.inventario = inventario;
        this.partida = partida; 
        this.menuTaller = menuTaller;
        
    }
    
    


    
    

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Taller de ensamblaje");
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Regresar al menu anterior");
        System.out.print("Ingrese una opcion: ");
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        int cantidadDeNaves = partida.getJugador().getInventarioNaves().contarNaves();
        if(opcion == 0){
            limpiarPantalla();
            menuTaller.mostrarInformacion();
        } else if(opcion > 0  && opcion <= cantidadDeNaves){
            Nave naveObtenida =  partida.getJugador().getInventarioNaves().eliminarNave(opcion);
           
        }
    }
    
}

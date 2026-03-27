/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuTaller extends MenuBase {

    private final Inventarios inventario;
    private final Partida partida;

    public MenuTaller(Inventarios inventario, Partida partida) {
        this.inventario = inventario;
        this.partida = partida;
    }
     
    
    
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Taller");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Seleccione la nave a mejorar");
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        int cantidadDeNaves = partida.getJugador().getInventarioNaves().contarNaves();
        
        if(){
            
        }
    }
    
}

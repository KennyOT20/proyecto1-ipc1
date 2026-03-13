/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuInicial;

import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Controladores.ControladorPartida.ControladorPartida;

/**
 *
 * @author Kenny
 */
public class MenuInicial extends MenuBase{

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(" ");
        imprimirLineaDeTexto("Bienvenido a");
        imprimirLineaDeTexto("Ender's Armada");
        imprimirLineaDeTexto(" ");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(" 1. Iniciar partida.");
        imprimirLineaDeTexto(" 2. Cargar partida. ");
        imprimirLineaDeTexto(" 3. Reportes. ");
        imprimirLineaDeTexto(" 4. Salir.");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch(opcion){
            case 1:
                ControladorPartida controladorPartida = new ControladorPartida();
                limpiarPantalla();
                controladorPartida.obtenerNombreDePartida();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default :
                limpiarPantalla();
                System.out.println("Opcion incorrecta, intente de nuevo. ");
                mostrarInformacion();
        }
    }    
    
   
}

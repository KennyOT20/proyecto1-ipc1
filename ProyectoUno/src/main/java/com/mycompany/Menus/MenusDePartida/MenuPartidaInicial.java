/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenusDePartida;

import com.mycompany.Controladores.ControladorPartida.ControladorPartida;
import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MenuPartidaInicial extends MenuBase {

    private Partida partida;
    
    public MenuPartidaInicial(Partida partida){
        this.partida = partida;
    }
   
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("W : Arriba,  A: Derecha, S : Abajo, D: Derecha, G : Guardar partida,  X : Salir ");
        imprimirBordeDeMenu(); 
        System.out.print("Ingrese un movimiento: ");
        validarOpcionUsuario();
    }
    
    public void validarOpcionUsuario(){
        String opcion;
        opcion = getScanner().nextLine();
        
        switch(opcion){
            case "W" :
                partida.getMapaGalactico().calcularMovimientos(opcion);
                limpiarPantalla();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
            case "A":
                partida.getMapaGalactico().calcularMovimientos(opcion);
                limpiarPantalla();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
            case "S" :
                limpiarPantalla();
                partida.getMapaGalactico().calcularMovimientos(opcion);
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
            case "D":
                limpiarPantalla();
                partida.getMapaGalactico().calcularMovimientos(opcion);
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;    
        }
        
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

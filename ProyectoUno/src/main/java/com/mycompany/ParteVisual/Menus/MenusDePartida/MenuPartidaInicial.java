/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenusDePartida;

import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.MostrarFlota;

/**
 *
 * @author Kenny
 */
public class MenuPartidaInicial extends MenuBase {

    private final Partida partida;
    
    public MenuPartidaInicial(Partida partida){
        this.partida = partida;
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("W : Arriba,  D: Derecha, S : Abajo, A: Izquierda G : Guardar partida,  X : Salir ");
        imprimirBordeDeMenu(); 
        System.out.print("Ingrese un movimiento: ");
        validarOpcionUsuario();
    }
    
    private void mostrarInformacionNavesJugador(){
        MostrarFlota verFlota = new MostrarFlota (partida.getJugador().getFlota());
        verFlota.mostrarFlota();
    }
    
    public void mostrarSimbologia(){
        String RESET = "\u001B[0m";

        String COMBATE = "\u001B[31m⚔" + RESET;
        String ESTACION = "\u001B[35m⚙" + RESET;
        String NORMAL = "\u001B[34m✦" + RESET;
        String BASE = "\u001B[33m☣" + RESET;
        String ESTRELLA = "\u001B[37m★" + RESET;
        String JUGADOR ="\u001B[42m▲" + RESET;

        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nombre de Partida: " + partida.getNombrePartida());
        imprimirLineaDeTexto(
            "Estrella: " + ESTRELLA +
            "  Combate: " + COMBATE +
            "  Estación: " + ESTACION +
            "  Normal: " + NORMAL +
            "  Base: " + BASE +
            "  Jugador: " + JUGADOR + "                       "
        );
        
        imprimirBordeDeMenu();
        mostrarInformacionNavesJugador();
        imprimirBordeDeMenu();
    }
    
    public void validarOpcionUsuario(){
        String opcion;
        opcion = getScanner().nextLine().toUpperCase();
        
        switch(opcion){
            case "W" :
                limpiarPantalla();
                verificarMovimiento(opcion);
                break;
            case "A":
                limpiarPantalla();
                verificarMovimiento(opcion);
                break;
            case "S" :
                limpiarPantalla();
                verificarMovimiento(opcion);
                break;
            case "D":
                limpiarPantalla();
                verificarMovimiento(opcion);
                break;    
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                imprimirBordeDeMenu();
                mostrarSimbologia();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
        } 
    }
    
    private void verificarMovimiento(String opcion){
         boolean opcionValida =   partida.getMapaGalactico().calcularMovimientos(opcion);
         
        if(!opcionValida){
         imprimirBordeDeMenu();
         imprimirLineaDeTexto("Movimiento no valido");
         imprimirBordeDeMenu();
        } else {
            partida.getMapaGalactico().verificarCasilla();
        }
        
         mostrarSimbologia();
         partida.getMapaGalactico().imprimirMapa();
         mostrarInformacion();
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

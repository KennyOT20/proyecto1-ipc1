/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenusDePartida;

import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Partida.Partida;

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
    
    public void mostrarInformacionNavesJugador(){
        imprimirLineaDeTexto("Naves en turno");
        imprimirLineaDeTexto("Nave:                     Piloto abordo:   ");
        for (int i = 0; i < partida.getJugador().getFlota().length; i++) {
           if(partida.getJugador().getFlota()[i] != null){
            String nombreDeNave = partida.getJugador().getFlota()[i].getNombreDeNave();
            String pilotoAbordo = partida.getJugador().getFlota()[i].getPiloto()[0].getNombrePiloto();
            
            while(nombreDeNave.length() < 25){
                nombreDeNave += " ";
            }

            while(pilotoAbordo.length() < 20){
                pilotoAbordo += " ";
            }

            String lineaDeTexto = (i + 1) + ". " + nombreDeNave + pilotoAbordo;

            imprimirLineaDeTexto(lineaDeTexto);
                   }
         }
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
        mostrarInformacionNavesJugador();
        imprimirBordeDeMenu();
    }
    
    public void validarOpcionUsuario(){
        String opcion;
        opcion = getScanner().nextLine().toUpperCase();
        
        switch(opcion){
            case "W" :
                partida.getMapaGalactico().calcularMovimientos(opcion);
                limpiarPantalla();
                partida.getMapaGalactico().verificarCasilla();
                mostrarSimbologia();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
            case "A":
                partida.getMapaGalactico().calcularMovimientos(opcion);
                limpiarPantalla();
                partida.getMapaGalactico().verificarCasilla();
                mostrarSimbologia();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
            case "S" :
                partida.getMapaGalactico().calcularMovimientos(opcion);
                limpiarPantalla();
                partida.getMapaGalactico().verificarCasilla();
                partida.getMapaGalactico().verificarCasilla();
                mostrarSimbologia();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;
            case "D":
                partida.getMapaGalactico().calcularMovimientos(opcion);
                limpiarPantalla();
                partida.getMapaGalactico().verificarCasilla();
                mostrarSimbologia();
                partida.getMapaGalactico().imprimirMapa();
                mostrarInformacion();
                break;    
        }
        
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
}

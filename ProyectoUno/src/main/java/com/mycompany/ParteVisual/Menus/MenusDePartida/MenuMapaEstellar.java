/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenusDePartida;

import com.mycompany.ParteLogica.Mapas.Mapas.GestionarMovimientos;
import com.mycompany.ParteLogica.Mapas.Mapas.MapaDeEstrella;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.MostrarFlota;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *c
 * @author Kenny
 */
public class MenuMapaEstellar extends MenuBase{

    private final Partida partida;
    private final GestionarMovimientos verificarMovimiento;
    private final MapaDeEstrella mapaEstelar;
  
    
    public MenuMapaEstellar(Partida partida, MapaDeEstrella mapaEstelar){
        this.partida = partida;
        this.mapaEstelar = mapaEstelar;
        this.verificarMovimiento = new GestionarMovimientos(mapaEstelar);
    }
    
   @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("W : Arriba,  D: Derecha, S : Abajo, A: Izquierda  X : Salir ");
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
        String WARP = "\u001B[36m↩" + RESET;  
        String JUGADOR ="\u001B[42m▲" + RESET;

        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nombre de Partida: " + partida.getNombrePartida());
        imprimirLineaDeTexto(
            "Warp: " + WARP + 
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
            case "A":
            case "S" :
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
                mapaEstelar.imprimirMapa(); 
                mostrarInformacion();
                break;
        } 
    }
    
    private void verificarMovimiento(String opcion){
    
        boolean opcionValida = verificarMovimiento.calcularMovimientos(opcion);
         
        if(!opcionValida){
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Movimiento no valido");
            imprimirBordeDeMenu();
        } else {
            mapaEstelar.verificarCasilla();
        }
        
        mostrarSimbologia();
        mapaEstelar.imprimirMapa(); 
        mostrarInformacion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }

}

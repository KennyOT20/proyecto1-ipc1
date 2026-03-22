/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial;

import com.mycompany.BaseEspacial.Barraca;
import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Partida.Partida;
import com.mycompany.Personajes.Jugador;

/**
 *
 * @author Kenny
 */
public class MenuBarraca extends MenuBase{

    private final Barraca barraca;
    private final Partida partida;
    private final Jugador jugador;
    
    public MenuBarraca(Jugador jugador, Partida partida){
        this.partida = partida;
        this.barraca = new Barraca(partida);
        this.jugador = jugador;
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Barraca");
        imprimirBordeDeMenu();
        mostrarDatos();
        mostrarPilotos();
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
    }
    
    
    private void mostrarPilotos(){
        imprimirLineaDeTexto("Pilotos ");
        imprimirLineaDeTexto("Nombre de piloto:    Precio:        Estadisticas:");
        imprimirBordeDeMenu();
        
        for (int i = 0; i < barraca.getPilotos().getArregloDePilotos().length; i++) {
            
            String nombrePiloto = barraca.getPilotos().getArregloDePilotos()[i].getNombrePiloto();
            String precioPiloto = String.valueOf(barraca.getPilotos().getArregloDePilotos()[i].getPrecioPiloto()) + " CR";
            imprimirLineaDeTexto("");
            
            while(nombrePiloto.length() < 20){
                nombrePiloto += " ";
            }
            
            while(precioPiloto.length() < 10) {
                precioPiloto += " ";
            }
            
           String estadisticaDePiloto =
                "EXP:" + barraca.getPilotos().getArregloDePilotos()[i].getPuntosDeExperiencia() + " " +
                "EST:" + barraca.getPilotos().getArregloDePilotos()[i].getPuntosDeEstrategia() + " " +
                "PIL:" + barraca.getPilotos().getArregloDePilotos()[i].getPuntosDePilotaje() + " " +
                "ENG:" + barraca.getPilotos().getArregloDePilotos()[i].getPuntosDeIngenieria() + " " +
                "LEA:" + barraca.getPilotos().getArregloDePilotos()[i].getPuntosDeLiderazgo() + " " +
                "RES:" + barraca.getPilotos().getArregloDePilotos()[i].getPuntosDeResistencia();
           
           String lineaDeTexto = (i+1) + "." + nombrePiloto + precioPiloto + estadisticaDePiloto;
           
            imprimirLineaDeTexto(lineaDeTexto);
        }
        
    }
    
    public void mostrarDatos(){
         String creditosEstelarJugador = String.valueOf(jugador.getCreditosGalacticos());
        String datos = "CR: " + creditosEstelarJugador;
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(datos);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("EXP: Puntos de experiencia");
        imprimirLineaDeTexto("LEA: Puntos de liderazgo");
        imprimirLineaDeTexto("ENG: Puntos de ingenieria");
        imprimirLineaDeTexto("PIL: Puntos de pilotaje");
        imprimirLineaDeTexto("RES: Puntos de resistencia ");
        imprimirLineaDeTexto("EST: Puntos de estrategia");
        imprimirBordeDeMenu();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
    
}

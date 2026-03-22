/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Partida;

import com.mycompany.Controladores.ControladorPartida.ControladorPartida;
import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Controladores.Flota.GenerarFlota;
import com.mycompany.Mapas.Mapas.MapaGalactico;
import com.mycompany.Menus.MenusDePartida.MenuPartidaInicial;
import com.mycompany.Personajes.Jugador;

/**
 *
 * @author Kenny
 */
public class Partida {
    
    private final Jugador jugador;
    private final MapaGalactico mapaGalactico;
    private final ControladorRandom random;
    private final MenuPartidaInicial menuPartida;
    private final GenerarFlota flota;
    private int filasRandom;
    private int columnasRandom;
    private String nombrePartida;
    private final ControladorPartida controladorPartida;
    
    public Partida(){
        this.random = new ControladorRandom();
        this.filasRandom = random.calcularNumeroAleatorios(12, 16);
        this.columnasRandom = random.calcularNumeroAleatorios(13, 18);
        this.jugador = new Jugador();
        this.mapaGalactico = new MapaGalactico(filasRandom, columnasRandom, this);
        this.flota = new GenerarFlota();
        this.controladorPartida = new ControladorPartida(this);
        this.menuPartida = new MenuPartidaInicial(this);
    }
    
    public void preprararPartida(){
        int cantidadEstrellas = random.calcularNumeroAleatorios(2, 4);
        String SIMBOLO_ESTRELLA = "★";
        controladorPartida.obtenerNombreDePartida();
        flota.asingarFlotaInicial(jugador);
        mapaGalactico.generarMapa(cantidadEstrellas, SIMBOLO_ESTRELLA );
    }
    
    public void iniciarPartida(){
        boolean partidaEnCurso = controladorPartida.verificarEstadoPartida();
        while(partidaEnCurso){
            menuPartida.mostrarSimbologia();
            mapaGalactico.imprimirMapa();
            menuPartida.mostrarInformacion();
        }
    }

    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }

    public MapaGalactico getMapaGalactico() {
        return mapaGalactico;
    }

    public Jugador getJugador() {
        return jugador;
    }
    
}

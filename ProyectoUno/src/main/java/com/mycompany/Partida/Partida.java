/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Partida;

import com.mycompany.Controladores.ControladorPartida.ControladorPartida;
import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Controladores.Flota.EnsambladorDeNaves;
import com.mycompany.Controladores.Flota.Flota;
import com.mycompany.Mapas.Mapas.MapaGalactico;
import com.mycompany.Menus.MenusDePartida.MenuPartidaInicial;
import com.mycompany.Personajes.PersonajeDeJugador;

/**
 *
 * @author Kenny
 */
public class Partida {
    
    private final PersonajeDeJugador jugador;
    private final MapaGalactico mapaGalactico;
    private final ControladorRandom random;
    private final MenuPartidaInicial menuPartida;
    private final Flota flota;
    private int filasRandom;
    private int columnasRandom;
    private String nombrePartida;
    private final ControladorPartida controladorPartida;
    
    public Partida(){
        this.random = new ControladorRandom();
        this.filasRandom = random.calcularNumeroAleatorios(12, 16);
        this.columnasRandom = random.calcularNumeroAleatorios(13, 18);
        this.jugador = new PersonajeDeJugador();
        this.mapaGalactico = new MapaGalactico(filasRandom, columnasRandom);
        this.flota = new Flota();
        this.controladorPartida = new ControladorPartida(this);
        this.menuPartida = new MenuPartidaInicial(this);
    }
    
    public void preprararPartida(){
        controladorPartida.obtenerNombreDePartida();
        flota.asingarFlotaInicial(jugador);
        mapaGalactico.generarMapa();
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

    public PersonajeDeJugador getJugador() {
        return jugador;
    }
    
    
    
}

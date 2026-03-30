/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Partida;

import com.mycompany.ParteLogica.Controladores.ControladorPartida.ControladorPartida;
import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Controladores.ControladoresFlota.GenerarFlota;
import com.mycompany.ParteLogica.Mapas.Casillas.CasillaEstrella;
import com.mycompany.ParteLogica.Mapas.Mapas.MapaGalactico;
import com.mycompany.ParteVisual.Menus.MenusDePartida.MenuPartidaInicial;
import com.mycompany.ParteLogica.Personajes.Jugador;

/**
 *
 * @author Kenny
 */
public class Partida {
    
    
    private final Jugador jugador;
    private final CasillaEstrella casillaEstelar;
    private final MapaGalactico mapaGalactico;
    private final ControladorRandom random;
    private final MenuPartidaInicial menuPartida;
    private final GenerarFlota flota;
    private int filasRandom;
    private int columnasRandom;
    private String nombrePartida;
    private final ControladorPartida controladorPartida;
    private final String SIMBOLO_ESTRELLA = "★";
    private final String BLANCO = "\u001B[37m";
    
    public Partida(){
        this.random = new ControladorRandom();
        this.filasRandom = random.calcularNumeroAleatorios(12, 16);
        this.columnasRandom = random.calcularNumeroAleatorios(13, 18);
        this.jugador = new Jugador();
        this.mapaGalactico = new MapaGalactico(filasRandom, columnasRandom, this);
        this.casillaEstelar = new CasillaEstrella(SIMBOLO_ESTRELLA, BLANCO, this);
        this.flota = new GenerarFlota();
        this.controladorPartida = new ControladorPartida(this);
        this.menuPartida = new MenuPartidaInicial(this);
    }
    
    public void preprararPartida(){
        int cantidadEstrellas = random.calcularNumeroAleatorios(2, 4);
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

    public Jugador getJugador() {
        return jugador;
    }

    public CasillaEstrella getCasillaEstelar() {
        return casillaEstelar;
    }

  
    
}

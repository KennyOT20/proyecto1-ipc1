/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Mapas.Mapas;

import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Generadores.GeneradorDeCasillas.GeneradorCasillasMapa;
import com.mycompany.ParteLogica.Mapas.Casillas.CasillaModelo;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteLogica.Personajes.Jugador;




/**
 *
 * @author Kenny
 */
public abstract class MapaBase {

    private final CasillaModelo[][] tableroMapa;
    private final Partida partida;
    private final Jugador jugador;
    
    private final ControladorRandom random;
    private final GeneradorCasillasMapa generadorCasillas;
    private final String RESETEAR_COLOR = "\u001B[0m";
    
    private int cantidadFilas;
    private int cantidadColumnas;
    private boolean mapaPrincipal;
    
    public MapaBase(int cantidadFilas, int cantidadColumnas, Partida partida){
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.tableroMapa = new CasillaModelo[cantidadFilas][cantidadColumnas];
        this.generadorCasillas = new GeneradorCasillasMapa(partida);
        this.jugador = new Jugador();
        this.random = new ControladorRandom();
        this.partida = partida;
    }
    
 
    public void generarMapa(int cantEstrellas, int cantidadWarp, int cantBases, int cantEstaciones, int cantCombates) {
        calcularPosicionJugador(); 

        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                tableroMapa[i][j] = null;
            }
        }

         esparcirCasillas(cantEstrellas, 4);
         esparcirCasillas(cantidadWarp, 3);   
         esparcirCasillas(cantEstaciones, 2);
         esparcirCasillas(cantCombates, 1); 
         esparcirCasillas(cantBases, 0);    

        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                if (tableroMapa[i][j] == null) {
                    tableroMapa[i][j] = generadorCasillas.crearCasillaNormal();
                }
            }
        }
    }

    private void esparcirCasillas(int cantidadDeseada, int tipoCasilla) {
        int casillasColocadas = 0;
        int limiteIntentos = cantidadFilas * cantidadColumnas * 2; 

        while (casillasColocadas < cantidadDeseada && limiteIntentos > 0) {
            int x = random.calcularNumeroAleatorios(0, cantidadFilas);
            int y = random.calcularNumeroAleatorios(0, cantidadColumnas);

            boolean esEspacioVacio = (tableroMapa[x][y] == null);
            boolean jugadorEnMapa = (x == jugador.getPosicionX() && y == jugador.getPosicionY());

            if (esEspacioVacio && !jugadorEnMapa) {
                switch (tipoCasilla) {
                    case 0: 
                        tableroMapa[x][y] = generadorCasillas.crearCasillaBase();
                        break;
                    case 1: 
                        tableroMapa[x][y] = generadorCasillas.crearCasillaCombate();
                    break;
                    case 2: 
                        tableroMapa[x][y] = generadorCasillas.crearCasillaEstacion(); 
                        break;
                    case 3:
                        tableroMapa[x][y] = generadorCasillas.crearCasillaWarp(); 
                        break;
                    case 4: 
                        tableroMapa[x][y] = generadorCasillas.crearCasillaEstrella();
                }
                casillasColocadas++;
            }
            limiteIntentos--;
        }
    }
    
    private void calcularPosicionJugador(){
       int posicionX = random.calcularNumeroAleatorios(0, cantidadFilas);
       int posicionY = random.calcularNumeroAleatorios(0, cantidadColumnas);
       
       jugador.setPosicionX(posicionX);
       jugador.setPosicionY(posicionY);
    }
    
    public void imprimirMapa(){
        String RESET = RESETEAR_COLOR;
        
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {

                String contenidoDeCasilla;

                if(i == jugador.getPosicionX() && j == jugador.getPosicionY()){
                    contenidoDeCasilla = " " + jugador.getSIMBOLO_FLOTA() + " ";
                    System.out.print(RESET + jugador.getFONDO_JUGADOR() + contenidoDeCasilla + RESET); 
                } else {
                    String simboloCasilla = tableroMapa[i][j].getSimboloCasilla();
                    String color = tableroMapa[i][j].getColorCasilla();

                    contenidoDeCasilla = " " + simboloCasilla + " ";
                    System.out.print(RESET + color + contenidoDeCasilla + RESET);
                }
            }
            System.out.println();
        }
    }
  
    public void verificarCasilla(){
         
         int x = jugador.getPosicionX();
         int y = jugador.getPosicionY();
         
         CasillaModelo casillaActual = tableroMapa[x][y];
         casillaActual.efectoDeCasilla();
    }    


    public GeneradorCasillasMapa getGeneradorCasillas() {
        return generadorCasillas;
    }

    public int getCantidadFilas() {
        return cantidadFilas;
    }

    public int getCantidadColumnas() {
        return cantidadColumnas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public boolean isMapaPrincipal() {
        return mapaPrincipal;
    }

    public ControladorRandom getRandom() {
        return random;
    }
}

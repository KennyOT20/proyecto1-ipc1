/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Mapas;

import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Generadores.GeneradorDeCasillas.GeneradorCasillasMapa;
import com.mycompany.Mapas.Casillas.CasillaModelo;
import com.mycompany.Partida.Partida;
import com.mycompany.Personajes.PersonajeDelJugador;



/**
 *
 * @author Kenny
 */
public abstract class MapaBase {

    private final CasillaModelo[][] tableroMapa;
    private final CasillaModelo[] simbolo;
    private final CasillaModelo[] simboloObtenido;
    private final Partida partida;
    
    private final PersonajeDelJugador jugador;
    
    private final ControladorRandom random;
    private final GeneradorCasillasMapa generadorCasillas;
    private final String RESETEAR_COLOR = "\u001B[0m";
    
    private int cantidadFilas;
    private int cantidadColumnas;
    private int cantidadDeCasillas;
    
    
    public MapaBase(int cantidadFilas, int cantidadColumnas, Partida partida){
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        tableroMapa = new CasillaModelo[cantidadFilas][cantidadColumnas];
        this.cantidadDeCasillas = 5;
        this.simbolo = new CasillaModelo[cantidadDeCasillas];
        this.simboloObtenido = new CasillaModelo[1];
        this.generadorCasillas = new GeneradorCasillasMapa(partida);
        this.jugador = new PersonajeDelJugador();
        this.random = new ControladorRandom();
        this.partida = partida;
    }
    
    /**
     * Metodo encargado de generar el mapa, instancia al metodo {@link #colocarCasillasEnArreglo()} lo cual 
     * llena el arreglo con casillas dadas.
     * Instancia al metodo encargado de calcular la posicion del jugador {@link #calcularPosicionJugador() }
     * Por ultimo se encarga de generar y llenar al mapa con las casillas dadas
     * @param cantidadSimbolos
     * @param simboloCasilla
     */
    public void generarMapa(int cantidadSimbolos, String simboloCasilla){
        colocarCasillasEnArreglo();
        calcularPosicionJugador();
        
        int simbolosColocados = 0;
        
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                simboloObtenido[0] = obtenerCasilla();
                
                if(simboloObtenido[0].getSimboloCasilla().equalsIgnoreCase(simboloCasilla)){
                    if(simbolosColocados < cantidadSimbolos ){
                        tableroMapa[i][j] = simboloObtenido[0];
                        simboloObtenido[0] = null;
                        simbolosColocados ++;
                    } else {
                        tableroMapa[i][j] = simbolo[3];
                    }
                } else {
                    tableroMapa[i][j] = simboloObtenido[0];
                }
            }
        }
    }
    
    /**
     * Metodo encargado de recibir un numero random en las coordenadas x y y del arreglo
     * para que el jugador empiece en un lugar random.
     */
    private void calcularPosicionJugador(){
       int posicionX = random.calcularNumeroAleatorios(0, cantidadFilas);
       int posicionY = random.calcularNumeroAleatorios(0, cantidadColumnas);
       
       jugador.setPosicionX(posicionX);
       jugador.setPosicionY(posicionY);
       
    }
    
    /**
     * Metodo encargado de imprimir el mapa de la mejor manera posibe.
     * 
     */
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
    
        public void calcularMovimientos(String movimiento){
            
            switch(movimiento){
                case "W" :
                     int coordenadaArriba = jugador.getPosicionX() - 1;
                     if(coordenadaArriba >= 0){
                     jugador.setPosicionX(coordenadaArriba);
                     } else {
                         System.out.println("Movimiento fuera de los limites");
                     }
                     break;   
                     
                case "S" :
                    int coordenadaAbajo = jugador.getPosicionX()  + 1;
                    if(coordenadaAbajo < cantidadFilas){
                    jugador.setPosicionX(coordenadaAbajo);
                    } else{
                         System.out.println("Movimiento fuera de los limites");
                    }
                    break;
                    
                case "D" :
                     int coordenadaDerecha = jugador.getPosicionY() + 1;
                     if(coordenadaDerecha < cantidadColumnas) {
                     jugador.setPosicionY(coordenadaDerecha);
                     } else {
                          System.out.println("Movimiento fuera de los limites");
                     }
                     break;
                     
                case "A" :
                     int coordenadaIzquierda = jugador.getPosicionY() - 1;
                     if(coordenadaIzquierda >= 0){
                     jugador.setPosicionY(coordenadaIzquierda);
                     }
                     else {
                          System.out.println("Movimiento fuera de los limites");
                     }
            }
        }
    
     public void verificarCasilla(){
         int x = jugador.getPosicionX();
         int y = jugador.getPosicionY();
         
         CasillaModelo casillaActual = tableroMapa[x][y];
         
         casillaActual.efectoDeCasilla();
     }    
        
     public abstract void colocarCasillasEnArreglo();
     
     private CasillaModelo obtenerCasilla(){
        int casillasRandom = random.calcularNumeroAleatorios(0, simbolo.length);
        return simbolo[casillasRandom];
    }

    public CasillaModelo[] getSimbolo() {
        return simbolo;
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
    
    

}


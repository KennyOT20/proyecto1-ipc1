/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Mapas;

import com.mycompany.Generadores.GeneradorCasillasMapa;
import com.mycompany.Mapas.Casillas.CasillaModelo;
import java.util.Random;



/**
 *
 * @author Kenny
 */
public  class MapaBase {

    private final CasillaModelo[][] tableroMapa;
    private final CasillaModelo[] simbolo;
    private final Random random = new Random();
    private final GeneradorCasillasMapa generadorCasillas;
    private final String RESETEAR_COLOR = "\u001B[0m";
    private int cantidadFilas;
    private int cantidadColumnas;
    private int cantidadDeCasillas;
    
    
    public MapaBase(int cantidadFilas, int cantidadColumnas){
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        tableroMapa = new CasillaModelo[cantidadFilas][cantidadColumnas];
        this.cantidadDeCasillas = 4;
        this.simbolo = new CasillaModelo[cantidadDeCasillas];
        this.generadorCasillas = new GeneradorCasillasMapa();
        colocarCasillasEnArreglo();
    }
    
    public void generarMapa(){
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                tableroMapa[i][j] = obtenerCasilla();
            }
        }
    }
    
    public void imprimirMapa(){
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                System.out.print(RESETEAR_COLOR + tableroMapa[i][j].getColorCasilla() +tableroMapa[i][j].getSimboloCasilla() + RESETEAR_COLOR);
            }
            System.out.println();
        }
    }
    
    private void colocarCasillasEnArreglo(){
        for (int i = 0; i < cantidadDeCasillas; i++) {
            simbolo[i] = casillaObtenida(i);
         } 
    }
    
    private CasillaModelo casillaObtenida(int indice){
        switch (indice) {
            case 0:
                return generadorCasillas.crearCasillaBase();
            case 1:
                return generadorCasillas.crearCasillaCombate();
            case 2:
                return generadorCasillas.crearCasillaEstacion();
            case 3:
                return generadorCasillas.crearCasillaEstrella();
            case 4:
                return generadorCasillas.crearCasillaNormal();
            case 5:
                return generadorCasillas.crearCasillaWarp();
            default:
                return null;
        }
    }
    
    private CasillaModelo obtenerCasilla(){
        int casillasRandom = random.nextInt(0, simbolo.length);
        return simbolo[casillasRandom];
    }

}


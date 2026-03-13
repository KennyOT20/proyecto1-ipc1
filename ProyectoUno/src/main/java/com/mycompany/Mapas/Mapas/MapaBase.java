/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Mapas;

import com.mycompany.Generadores.GeneradorDeCasillas.GeneradorCasillasMapa;
import com.mycompany.Mapas.Casillas.CasillaModelo;
import java.util.Random;



/**
 *
 * @author Kenny
 */
public abstract class MapaBase {

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
        this.cantidadDeCasillas = 5;
        this.simbolo = new CasillaModelo[cantidadDeCasillas];
        this.generadorCasillas = new GeneradorCasillasMapa();
    }
    
    public void generarMapa(){
        colocarCasillasEnArreglo();
        
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                tableroMapa[i][j] = obtenerCasilla();
            }
        }
    }
    
    public void colocarJugadorEnMapa(){
        
    }
    
    public void imprimirMapa(){
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                System.out.print(RESETEAR_COLOR + tableroMapa[i][j].getColorCasilla() +tableroMapa[i][j].getSimboloCasilla() + RESETEAR_COLOR);
            }
            System.out.println();
        }
    }
    
    
     public abstract void colocarCasillasEnArreglo();
     
     
     protected CasillaModelo obtenerCasilla(){
        int casillasRandom = random.nextInt(0, simbolo.length);
        return simbolo[casillasRandom];
    }

    public CasillaModelo[] getSimbolo() {
        return simbolo;
    }

    public GeneradorCasillasMapa getGeneradorCasillas() {
        return generadorCasillas;
    }
    
    

}


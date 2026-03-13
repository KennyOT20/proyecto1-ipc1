/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.ControladorPartida;

import com.mycompany.Generadores.GeneradorDeMApa.GeneradorDeMapas;
import com.mycompany.Mapas.Mapas.MapaBase;
import com.mycompany.Partida.Partida;
import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class ControladorPartida {
    
    private final Partida partida;
    private final  GeneradorDeMapas crearMapaGalactico;
    
    public ControladorPartida(){
        this.partida = new Partida();
        this.crearMapaGalactico = new GeneradorDeMapas();
    }
    
    public void obtenerNombreDePartida(){
        Scanner scanner = new Scanner(System.in);
        String nombreDePartida; 
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|| Ingrese el nombre de la partida:                ||");
        System.out.println("-----------------------------------------------------");
        
        nombreDePartida = scanner.nextLine();
        
        if(!nombreDePartida.isEmpty()){
            partida.setNombrePartida(nombreDePartida);
            scanner.close();
        } else {
            System.out.println("Error el nombre no puede ir vacio.");
            obtenerNombreDePartida();
        }   
    }
    
    public void generarAtributosPartida(){
        MapaBase  mapaGalactico = crearMapaGalactico.crearMapaGalactico();
        mapaGalactico.generarMapa();
        mapaGalactico.imprimirMapa();
    }
    
    
    
}

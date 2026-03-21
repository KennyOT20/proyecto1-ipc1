/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.ControladorPartida;


import com.mycompany.Partida.Partida;
import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class ControladorPartida {
    
    private final Partida partida;
    private boolean partidaActiva;
    
    public ControladorPartida(Partida partida){
        this.partida = partida;
        this.partidaActiva = true;
    }
    
    public void obtenerNombreDePartida(){
        Scanner scanner = new Scanner(System.in);
        String nombreDePartida; 
        
        System.out.println("-----------------------------------------------------");
        System.out.println("|| Ingrese el nombre de la partida                 ||");
        System.out.println("-----------------------------------------------------");
        System.out.print("Nombre:");
        
        nombreDePartida = scanner.nextLine();
        
        if(!nombreDePartida.isEmpty()){ 
            partida.setNombrePartida(nombreDePartida);
            
        } else {
            System.out.println("Error el nombre no puede ir vacio.");
            obtenerNombreDePartida();
        }   
    }
    
    
    public boolean verificarEstadoPartida(){
        return partidaActiva == true;
    }
    
   
    
    
}

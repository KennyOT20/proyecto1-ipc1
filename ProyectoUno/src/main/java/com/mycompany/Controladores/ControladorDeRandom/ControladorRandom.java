/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.ControladorDeRandom;

import java.util.Random;

/**
 *
 * @author Kenny
 */
public class ControladorRandom {
   
    private final Random random;
    
    public ControladorRandom(){
        random = new Random();
    }
    
    public int calcularNumeroAleatorios(int min, int max){
        return random.nextInt(min, max);
    }

    public Random getRandom() {
        return random;
    }
    
    
    
    
}

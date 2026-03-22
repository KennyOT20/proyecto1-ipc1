/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeNaves;

import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Naves.Nave;
import com.mycompany.Naves.NaveAcorazado;
import com.mycompany.Naves.NaveCaza;
import com.mycompany.Naves.NaveDeApoyo;
import com.mycompany.Naves.NaveFragata;

/**
 *
 * @author Kenny
 */
public class GeneradorDeNaves {
    
    private final ControladorRandom random;
    private int espacioNave;
    
    public GeneradorDeNaves(){
        this.random = new ControladorRandom();
        this.espacioNave = 0;
    }
    
    /**
     * Serie de Metodos  encargados de crear lazs naves reciben como parametros : 
     * nombreDeNave, cantidadDeComponentes, tipoDeNave, puntosDeVida, vidaMax, 
     * velocidad,  puntosDeEscudo, combustiblePremium, puntosDeEnergia, precioDeNave
     * @return 
     */
    
    
    public Nave crearCaza(){
        espacioNave = random.calcularNumeroAleatorios(2, 3);
        return new NaveCaza("Caza", espacioNave, "Ligero", 500, 500, 1000, 400, 0, 800, 1000);
    }
    
    public Nave crearAcorazado(){
        espacioNave = random.calcularNumeroAleatorios(6 , 8);
        return new NaveAcorazado("Acorazado", espacioNave, "Pesado", 2000, 2000, 100, 100, 0, 2000, 4000 ); 
    }
    
    public Nave crearFragata(){
        espacioNave = random.calcularNumeroAleatorios(4, 5);
        return new NaveFragata("Fragata", espacioNave, "Normal", 1200, 1200,  600, 200, 0, 1200, 1500);
    }
    
    public Nave crearNaveApoyo(){
        espacioNave = random.calcularNumeroAleatorios(4, 6);
        return new NaveDeApoyo("Nave de apoyo", espacioNave, "Normal", 800, 800, 500, 400, 0, 200, 600);
    }
    
}

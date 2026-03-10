/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeNaves;

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
    
    /**
     * Serie de metodos  encargados de crear las naves reciben como parametros : 
     * nombreDeNave, cantidadDeComponentes, tipoDeNave, puntosDeVida, vidaMax, 
     * velocidad,  puntosDeEscudo, combustiblePremium, puntosDeEnergia, precioDeNave
     * @return 
     */
    
    
    public Nave crearCaza(){
        return new NaveCaza("Caza", 3, "Ligero", 500, 500, 1000, 400, 0, 800, 1000);
    }
    
    public Nave crearAcorazado(){
        return new NaveAcorazado("Acorazado", 8, "Pesado", 2000, 2000, 100, 100, 0, 2000, 4000 ); 
    }
    
    public Nave crearFragata(){
        return new NaveFragata("Fragata", 5, "Media", 1200, 1200,  600, 200, 0, 1200, 1500);
    }
    
    public Nave crearNaveApoyo(){
        return new NaveDeApoyo("Nave de apoyo", 6, "Media", 800, 800, 500, 400, 0, 200, 600);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Flota;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeArmas;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeEscudos;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDePropulsores;
import com.mycompany.Generadores.GeneradorDeComponentesNave.GeneradorDeSistemasDeApoyo;
import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Naves.Nave;



/**
 *
 * @author Kenny
 */
public class EnsambladorDeNaves {

    private final GeneradorDeNaves generarNave;
    private final GeneradorDeArmas generarArma;
    private final GeneradorDeEscudos generarEscudo;
    private final GeneradorDeSistemasDeApoyo generarSistema;
    private final GeneradorDePropulsores generarPropulsor;
    
    private final ControladorRandom random;
    
    public EnsambladorDeNaves(){
        this.generarNave = new GeneradorDeNaves();
        this.generarArma = new GeneradorDeArmas();
        this.generarEscudo = new GeneradorDeEscudos();
        this.generarSistema = new GeneradorDeSistemasDeApoyo();
        this.generarPropulsor = new GeneradorDePropulsores();
        this.random = new ControladorRandom();
    }
    
    public Nave obtenerNaveRandom(){
        
        int nave = random.calcularNumeroAleatorios(1, 5);
        
        switch(nave){
            case 1 :
                return generarNave.crearAcorazado();
            case 2:
                return generarNave.crearCaza();
            case 3: 
                return generarNave.crearFragata();
            case 4 : 
                return generarNave.crearNaveApoyo();
            default :
                return null;
        }
    }
    
   
    
    private ComponenteDeNave agregarComponente(){
        return null;
    }
    
    public Nave naveEnsmablada(){
        Nave naveCompletada = obtenerNaveRandom();
        return naveCompletada;
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.ControladorFlota;

import com.mycompany.Controladores.ControladorDeRandom.ControladorRandom;
import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Naves.Nave;
import com.mycompany.Personajes.PersonajeDeJugador;
import com.mycompany.Personajes.PersonajeDeLaMaquina;

/**
 *
 * @author Kenny
 */
public class ControladorFlota {
    
    private final GeneradorDeNaves generarNaves;
    private final ControladorRandom random;
    private final Nave[] arregloDeNaves;
    
    public ControladorFlota(){
        this.generarNaves = new GeneradorDeNaves();
        this.arregloDeNaves = new Nave[3];
        this.random = new ControladorRandom();
    }
    
    /**
     * Metodo encargado de darle la nave inicial fragata al jugador
     * @param personajeJugador recibe como parametro al personaje del jugador
     */
    public void asignarFlotaInicialJugador(PersonajeDeJugador personajeJugador){
        Nave fragata = generarNaves.crearFragata();
        personajeJugador.agregarNave(fragata);
    }
    
    /**
     * Metodo encargado de ir dandole 3-4 naves aleatorias a un enemigo del jugador.
     * @param personajeMaquina el personaje de la maquina
     */
    public void asignarFlotaEnemigoRandom(PersonajeDeLaMaquina personajeMaquina){
        
        for (int i = 0; i < personajeMaquina.getFlota().length; i++) {
            int indiceRandom = random.getRandom().nextInt(0, arregloDeNaves.length);
            Nave naveObtenida = arregloDeNaves[indiceRandom];
            personajeMaquina.agregarNave(naveObtenida);
        }
    }
    
    public void generarArregloDeNaves(){
        Nave fragata = generarNaves.crearFragata();
        Nave acorazado = generarNaves.crearAcorazado();
        Nave naveApoyo = generarNaves.crearNaveApoyo();
        Nave caza = generarNaves.crearCaza();
        arregloDeNaves[0] = fragata;
        arregloDeNaves[1] = acorazado;
        arregloDeNaves[2] = naveApoyo;
        arregloDeNaves[3] = caza;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Enemigos;

import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Controladores.Flota.Flota;
import com.mycompany.Personajes.PersonajeDeLaMaquina;

/**
 *
 * @author Kenny
 */
public class Enemigo {
    
    private final PersonajeDeLaMaquina personajeMaquina;
    private final ControladorRandom random;
    private final Flota flota;
    private int cantidadFlotaEnemiga;
    
    
    public Enemigo(){
        this.random = new ControladorRandom();
        this.cantidadFlotaEnemiga = random.calcularNumeroAleatorios(3, 4);
        this.personajeMaquina = new PersonajeDeLaMaquina("Patrulla de Mazer Rhakam", cantidadFlotaEnemiga);
        this.flota = new Flota();
    }
    
    public void generarEnemigosRandom(){
        flota.obtenerFlotaRandom(personajeMaquina);
    }

    public PersonajeDeLaMaquina getPersonajeMaquina() {
        return personajeMaquina;
    }
    
    
    
}

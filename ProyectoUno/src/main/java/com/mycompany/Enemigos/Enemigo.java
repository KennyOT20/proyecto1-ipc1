/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Enemigos;

import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Controladores.Flota.GenerarFlota;
import com.mycompany.Personajes.Maquina;

/**
 *
 * @author Kenny
 */
public class Enemigo {
    
    private final Maquina personajeMaquina;
    private final ControladorRandom random;
    private final GenerarFlota flota;
    private int cantidadFlotaEnemiga;
    
    
    public Enemigo(){
        this.random = new ControladorRandom();
        this.cantidadFlotaEnemiga = random.calcularNumeroAleatorios(1, 4);
        this.personajeMaquina = new Maquina("Patrulla de Mazer Rhakam", cantidadFlotaEnemiga);
        this.flota = new GenerarFlota();
    }
    
    public void generarEnemigosRandom(){
        flota.obtenerFlotaRandom(personajeMaquina);
    }

    public Maquina getPersonajeMaquina() {
        return personajeMaquina;
    }
    
    
    
}

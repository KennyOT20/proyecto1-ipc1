/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Controladores.ControladoresFlota;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Personajes.Jugador;
import com.mycompany.ParteLogica.Personajes.Maquina;
import com.mycompany.ParteLogica.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public class GenerarFlota {
    
    private final GeneradorDeNaves generarNave;
    private final EnsambladorDeNaves ensambladorNave;
    
    public GenerarFlota(){
        this.generarNave = new GeneradorDeNaves();
        this.ensambladorNave = new EnsambladorDeNaves();
    }

    public void asingarFlotaInicial(Jugador jugador){
        Nave fragata = generarNave.crearFragata();
        Piloto pilotoObtenido = ensambladorNave.obtenerPilotoRandom();
        ComponenteDeNave componenteObtenido = ensambladorNave.obtenerComponenteAleatorio();
        fragata.agregarPiloto(pilotoObtenido);
        
        ensambladorNave.agregarComponente(fragata, componenteObtenido);
        jugador.getFlota().agregarNave(fragata);
    }
    
    
 
    public void obtenerFlotaRandom(Maquina personajeMaquina){
        int contadorArreglo = -1;
        
        while(contadorArreglo <= personajeMaquina.getFlota().getNaves().length){
            Nave naveObtenida = ensambladorNave.naveEnsamblada();
           personajeMaquina.getFlota().agregarNave(naveObtenida);
           contadorArreglo ++;
        }
    }
    
    
}

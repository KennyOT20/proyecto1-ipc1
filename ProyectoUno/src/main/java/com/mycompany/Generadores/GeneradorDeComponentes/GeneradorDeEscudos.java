/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeComponentes;

import com.mycompany.Componentes.Escudos.CampoDeDeflexion;
import com.mycompany.Componentes.Escudos.Escudo;
import com.mycompany.Componentes.Escudos.EscudoReforzado;
import com.mycompany.Componentes.Escudos.GeneradorDeOndas;
import com.mycompany.Componentes.Escudos.NucleoDeEnergia;
import com.mycompany.Componentes.Escudos.PantallaDeAsteroides;

/**
 *
 * @author Kenny
 */
public class GeneradorDeEscudos {
    
    /**
     * Metodos encargados de ir creando los escudos, reciben como parametros :
     * int consumoDeEnergia, String pesoComponente, String nombreComponente, int escudoExtra
     * @return 
     */
    public Escudo crearCampoDeflexion(){
        return new CampoDeDeflexion(10, "Ligero", "Campo de defleccion", 100);
    }
    
    public Escudo crearEscudoReforzado(){
        return new EscudoReforzado(30, "Normal", "Escudo reforzado", 200);
    }
    
    public Escudo crearGeneradorDeOndas(){
        return new GeneradorDeOndas(15, "Normal", "Generador de Ondas", 150);
    }
    
    public Escudo crearNucleoDeEnergia(){
        return new NucleoDeEnergia(5, "Normal", "Nucleo de energia", 80);
    }
    
    public Escudo crearPantallaDeAsteroides(){
        return new PantallaDeAsteroides(45, "Pesado", "Pantalla de asteroides", 300);
    }
    
}

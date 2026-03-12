/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeComponentesNave;

import com.mycompany.Componentes.SistemasDeApoyo.CampoDeDistorcion;
import com.mycompany.Componentes.SistemasDeApoyo.CamuflajeTactico;
import com.mycompany.Componentes.SistemasDeApoyo.DronDeReparacion;
import com.mycompany.Componentes.SistemasDeApoyo.GeneradorEscudoDeEmergencia;
import com.mycompany.Componentes.SistemasDeApoyo.NucleoDeSobreCarga;
import com.mycompany.Componentes.SistemasDeApoyo.SistemaDeApoyo;

/**
 *
 * @author Kenny
 */
public class GeneradorDeSistemasDeApoyo {
    
    /**
     * Metodos encargados de inicializar los sistema de apoyos
     * reciben como parametros: int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento
     * @return 
     */
    public SistemaDeApoyo crearCampoDistorcion(){
        return new CampoDeDistorcion(35, "Normal", "Campo de distorcion", 4);
    }
    
    public SistemaDeApoyo crearCamuflajeTactico(){
        return new CamuflajeTactico(25, "Ligero", "Camuflaje tactico", 4);
    }
    
    public SistemaDeApoyo crearDronDeReparacion(){
        return new DronDeReparacion(30, "Normal", "Dron de reparacion", 3);
    }
    
    public SistemaDeApoyo crearGeneradorDeEscudo(){
        return new GeneradorEscudoDeEmergencia(0, "Normal", "Escudo de emergencia", 0);
    }
    
    public SistemaDeApoyo crearNucleoDeSobreCarga(){
        return new NucleoDeSobreCarga(50, "Pesado", "Nucleo de sobrecarga", 6);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeComponentes;

import com.mycompany.Componentes.Propulsores.MicroPropulsor;
import com.mycompany.Componentes.Propulsores.Propulsor;
import com.mycompany.Componentes.Propulsores.PropulsorCuantico;
import com.mycompany.Componentes.Propulsores.SistemaDeManiobra;
import com.mycompany.Componentes.Propulsores.TurboCompresor;

/**
 *
 * @author Kenny
 */
public class GeneradorDePropulsores {
    
    /**
     * Metodos encargados de ir creando a los propulsores los parametros que recibe son:
     * int consumoDeEnergia, String pesoComponente, String nombreComponente, int velocidadExtra, double evasion
     * @return 
     */
    public Propulsor crearMicroPropulsor(){
        return new MicroPropulsor(5, "Ligero", "Micropropulsor", 20, 0.5);
    }
    
    public Propulsor crearPropulsorCuantico(){
        return new PropulsorCuantico(40,"Pesado", "Propulsor Cuantico", 50, 0.8);
    }
    
    public Propulsor crearTurboCompresor(){
        return new TurboCompresor(25, "Normal", "Turbo compresor", 35, 0.2);
    }
    
    public Propulsor crearSistemaDeManiobra(){
        return new SistemaDeManiobra(10, "Normal", "Sistema de Maniobra", 15, 0.10);
    }
    
}

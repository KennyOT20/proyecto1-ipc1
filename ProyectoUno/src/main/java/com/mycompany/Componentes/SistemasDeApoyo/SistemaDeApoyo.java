/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Componentes.SistemasDeApoyo;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;

/**
 *
 * @author Kenny
 */
public abstract class SistemaDeApoyo extends ComponenteDeNave {
    
    private int enfriamiento;

    public SistemaDeApoyo(int consumoDeEnergia, String pesoComponente, String nombreComponente, int enfriamiento, int precioComponente) {
        super(consumoDeEnergia, pesoComponente, nombreComponente, "Sistema de Apoyo", precioComponente);
        this.enfriamiento = enfriamiento;
    }
    

    
}

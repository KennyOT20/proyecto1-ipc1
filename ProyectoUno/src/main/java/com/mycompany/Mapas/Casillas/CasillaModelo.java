/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Casillas;

/**
 *
 * @author Kenny
 */
public abstract class CasillaModelo {
    
    private String simboloCasilla;
    private String colorCasilla;

    public CasillaModelo(String simboloCasilla, String colorCasilla){
        this.simboloCasilla = simboloCasilla;
        this.colorCasilla = colorCasilla;
    }
    
    public abstract void efectoDeCasilla();
    
    public String getSimboloCasilla() {
        return simboloCasilla;
    }

    public String getColorCasilla() {
        return colorCasilla;
    }
    
    
    
    
}

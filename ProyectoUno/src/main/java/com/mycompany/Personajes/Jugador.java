/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Personajes;

import com.mycompany.Controladores.Inventarios.InventarioComponente;
import com.mycompany.Controladores.Inventarios.InventarioNave;
import com.mycompany.Controladores.Inventarios.InventarioPilotos;

/**
 *
 * @author Kenny
 */
public class Jugador extends Personaje {
    
    private final  InventarioNave inventarioNaves;            
    private final InventarioComponente inventarioComponentes;
    private final InventarioPilotos inventarioPilotos;
    private int creditosGalacticos;
    private int puntosDeTecnologia;
    private int posicionX;
    private int posicionY;
    private final String FONDO_JUGADOR ="\u001B[42m";
    private final String SIMBOLO_FLOTA = "▲";

    public Jugador() {
        super("Ender Wiggin", 3 );
        this.inventarioNaves = new InventarioNave();
        this.inventarioComponentes = new InventarioComponente();
        this.inventarioPilotos = new InventarioPilotos();
        this.creditosGalacticos = 1000;
    }
    
    @Override
    public void ejecutarOpcion() {
    }
    


    public void recibirRecompensas(){
        
    }
    

    public int getCreditosGalacticos() {
        return creditosGalacticos;
    }

    public void setCreditosGalacticos(int creditosGalacticos) {
        this.creditosGalacticos = creditosGalacticos;
    }

    public int getPuntosDeTecnologia() {
        return puntosDeTecnologia;
    }

    public void setPuntosDeTecnologia(int puntosDeTecnologia) {
        this.puntosDeTecnologia = puntosDeTecnologia;
    }

    public String getSIMBOLO_FLOTA() {
        return SIMBOLO_FLOTA;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public String getFONDO_JUGADOR() {
        return FONDO_JUGADOR;
    }

    public InventarioNave getInventarioNaves() {
        return inventarioNaves;
    }

    public InventarioComponente getInventarioComponentes() {
        return inventarioComponentes;
    }

    public InventarioPilotos getInventarioPilotos() {
        return inventarioPilotos;
    }

    
    
    
}

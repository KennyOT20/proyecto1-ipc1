/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Personajes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Naves.Nave;
import com.mycompany.Pilotos.Piloto;


/**
 *
 * @author Kenny
 */
public class Jugador extends Personaje {
    
    private final ComponenteDeNave[] inventarioComponentes;
    private final Piloto[] inventarioPiloto;
    private final Nave[] inventarioNaves;
    private int creditosGalacticos;
    private int puntosDeTecnologia;
    private int posicionX;
    private int posicionY;
    private final String FONDO_JUGADOR ="\u001B[42m";
    private final String SIMBOLO_FLOTA = "▲";

    public Jugador() {
        super("Ender Wiggin", 3 );
        this.creditosGalacticos = 1000;
        this.inventarioComponentes = new ComponenteDeNave[1];
        this.inventarioPiloto = new Piloto[1];
        this.inventarioNaves = new Nave[1];
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

    public ComponenteDeNave[] getInventarioComponentes() {
        return inventarioComponentes;
    }

    public Piloto[] getInventarioPiloto() {
        return inventarioPiloto;
    }

    public Nave[] getInventarioNaves() {
        return inventarioNaves;
    }

    
}

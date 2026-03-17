/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Naves;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public abstract class Nave {
    
    private String nombreDeNave;
    private Piloto[] piloto;
    private int cantidadDeComponentes;
    private ComponenteDeNave componentesDeNave [];
    private String tipoDeNave;
    private int puntosDeVida;
    private int vidaMax;
    private int velocidad;
    private int puntosDeEscudo;
    private int combustiblePremium;
    private int puntosDeEnergia;
    private int precioDeNave;
    private double evasionBase;

    public Nave(String nombreDeNave, int cantidadDeComponentes, String tipoDeNave,
            int puntosDeVida,int vidaMax, int velocidad, int puntosDeEscudo, int combustiblePremium, int puntosDeEnergia, int precioDeNave) {
        this.piloto = new Piloto[1];
        this.nombreDeNave = nombreDeNave;
        this.cantidadDeComponentes = cantidadDeComponentes;
        this.componentesDeNave = new ComponenteDeNave[cantidadDeComponentes];
        this.tipoDeNave = tipoDeNave;
        this.puntosDeVida = puntosDeVida;
        this.velocidad = velocidad;
        this.puntosDeEscudo = puntosDeEscudo;
        this.combustiblePremium = combustiblePremium;
        this.puntosDeEnergia = puntosDeEnergia;
        this.precioDeNave = precioDeNave;
        this.evasionBase = 0.20;
    }
    
    
    public abstract void aplicarAtaque(Nave naveAtacante , Nave naveObjetivo);
    public abstract void aplicarEfectoDePiloto(Nave navePiloteada, Piloto pilotoEnTurno);
    public abstract void aplicarHabilidad();
    
    
    public void agregarComponente (ComponenteDeNave componente){
        for (int i = 0; i < componentesDeNave.length; i++) {
            if(componentesDeNave[i] == null){
                componentesDeNave[i] = componente;
                return;
            }
        }
    }
    
    public void agregarPiloto(Piloto pilotoAsignado){
        for (int i = 0; i < piloto.length; i++) {
            if(piloto[i] == null){
                piloto[i] = pilotoAsignado;
                return;
            }
        }
    }
    
    
    public void verificarSHP(){
        
    }
    
    public void absorberAtaques(){
        
    }
    
    public void verificarVidaDeNave(){
        
    }

    public String getNombreDeNave() {
        return nombreDeNave;
    }

    public void setNombreDeNave(String nombreDeNave) {
        this.nombreDeNave = nombreDeNave;
    }

    public int getCantidadDeComponentes() {
        return cantidadDeComponentes;
    }

    public void setCantidadDeComponentes(int cantidadDeComponentes) {
        this.cantidadDeComponentes = cantidadDeComponentes;
    }

    public ComponenteDeNave[] getComponentesDeNave() {
        return componentesDeNave;
    }

    public void setComponentesDeNave(ComponenteDeNave[] componentesDeNave) {
        this.componentesDeNave = componentesDeNave;
    }

    public String getTipoDeNave() {
        return tipoDeNave;
    }

    public void setTipoDeNave(String tipoDeNave) {
        this.tipoDeNave = tipoDeNave;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuntosDeEscudo() {
        return puntosDeEscudo;
    }

    public void setPuntosDeEscudo(int puntosDeEscudo) {
        this.puntosDeEscudo = puntosDeEscudo;
    }

    public int getCombustiblePremium() {
        return combustiblePremium;
    }

    public void setCombustiblePremium(int combustiblePremium) {
        this.combustiblePremium = combustiblePremium;
    }

    public int getPuntosDeEnergia() {
        return puntosDeEnergia;
    }

    public void setPuntosDeEnergia(int puntosDeEnergia) {
        this.puntosDeEnergia = puntosDeEnergia;
    }

    public double getEvasionBase() {
        return evasionBase;
    }

    public void setEvasionBase(double evasionBase) {
        this.evasionBase = evasionBase;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public int getPrecioDeNave() {
        return precioDeNave;
    }
   
}

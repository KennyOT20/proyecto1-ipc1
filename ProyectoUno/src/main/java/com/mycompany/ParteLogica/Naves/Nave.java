/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Naves;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Pilotos.Piloto;

/**
 *
 * @author Kenny
 */
public abstract class Nave {
    
    private final ControladorRandom random;
    private String nombreDeNave;
    private final Piloto[] piloto;
    private int cantidadDeComponentes;
    private ComponenteDeNave componentesDeNave [];
    private String tipoDeNave;
    private int puntosDeVida;
    private int vidaMax;
    private int velocidad;
    private int escudo;
    private int puntosEnergia;
    private int puntosDeEscudoMax;
    private int combustiblePremium;
    private int puntosDeEnergiaMax;
    private int precioDeNave;
    private int precioDeVenta;
    private double evasionBase;
    private int componentesInventario;

    public Nave(String nombreDeNave, int cantidadDeComponentes, String tipoDeNave,
            int puntosDeVida,int vidaMax, int velocidad, int puntosDeEscudoMax, int combustiblePremium, int puntosDeEnergiaMax, int precioDeNave) {
        this.random = new ControladorRandom();
        this.piloto = new Piloto[1];
        this.nombreDeNave = nombreDeNave;
        this.cantidadDeComponentes = cantidadDeComponentes;
        this.componentesDeNave = new ComponenteDeNave[cantidadDeComponentes];
        this.tipoDeNave = tipoDeNave;
        this.puntosDeVida = vidaMax;
        this.vidaMax = vidaMax;
        this.escudo = puntosDeEscudoMax;
        this.puntosEnergia = puntosDeEnergiaMax;
        this.velocidad = velocidad;
        this.puntosDeEscudoMax = puntosDeEscudoMax;
        this.combustiblePremium = combustiblePremium;
        this.puntosDeEnergiaMax = puntosDeEnergiaMax;
        this.precioDeNave = precioDeNave;
        this.evasionBase = 0.20;
        this.componentesInventario = 0;
        calcularPrecioVenta();
    }
    
    
    public abstract void aplicarAtaque(Nave naveAtacante , Nave naveObjetivo);
    public abstract void aplicarEfectoDePiloto(Nave navePiloteada, Piloto pilotoEnTurno);
    public abstract void aplicarHabilidad();
    
    
    public boolean agregarComponente (ComponenteDeNave componente){
        for (int i = 0; i < componentesDeNave.length; i++) {
            if(componentesDeNave[i] == null){
                componentesDeNave[i] = componente;
                componentesInventario ++;
                return true;
            }
        }
        return false;
    }
    
   public ComponenteDeNave eliminarComponente(int opcion){

        int indiceReal = opcion - 1;

        if(indiceReal < 0 || indiceReal >= componentesInventario || componentesDeNave[indiceReal] == null ){
            throw new IllegalArgumentException("Opcion invalida");
        }

        ComponenteDeNave componenteEliminado = componentesDeNave[indiceReal];

        for (int i = indiceReal; i < componentesInventario - 1; i++) {
            componentesDeNave[i] = componentesDeNave[i + 1];
        }

        componentesInventario--;
        componentesDeNave[componentesInventario] = null;

        return componenteEliminado;
    }
    
    public boolean agregarPiloto(Piloto pilotoAsignado) {

       if (piloto[0] == null) {
           piloto[0] = pilotoAsignado;
           return true;
       }

       return false; 
   }


   public final void calcularPrecioVenta(){
       int puntosVida = random.calcularNumeroAleatorios(0, puntosDeVida);
       int puntosEscudo = random.calcularNumeroAleatorios(0, puntosDeEscudoMax);
       int puntosEp = random.calcularNumeroAleatorios(0, puntosEscudo);
       
       int precioTotal = puntosEp + puntosVida + puntosEscudo + random.calcularNumeroAleatorios(0, precioDeVenta);
       precioDeVenta = precioTotal;
    }
    
    public int calcularPrecioReparacion(){
        int cantidadHp = vidaMax -puntosDeVida;
        int cantidadEp = puntosDeEnergiaMax - puntosEnergia;
        int cantidadShp = puntosDeEscudoMax - escudo;
        
        return (cantidadHp + cantidadEp + cantidadShp) * 5;
    }
    

   public Piloto eliminarPiloto() {

        if (piloto[0] != null) {
            Piloto pilotoEliminado = piloto[0];
            piloto[0] = null;
            return pilotoEliminado;
        }

        return null; 
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
        return puntosDeEscudoMax;
    }

    public void setPuntosDeEscudo(int puntosDeEscudo) {
        this.puntosDeEscudoMax = puntosDeEscudo;
    }

    public int getCombustiblePremium() {
        return combustiblePremium;
    }

    public void setCombustiblePremium(int combustiblePremium) {
        this.combustiblePremium = combustiblePremium;
    }

    public int getPuntosDeEnergia() {
        return puntosDeEnergiaMax;
    }

    public void setPuntosDeEnergia(int puntosDeEnergia) {
        this.puntosDeEnergiaMax = puntosDeEnergia;
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

    public Piloto[] getPiloto() {
        return piloto;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    public int getComponentesInventario() {
        return componentesInventario;
    }

    public int getEscudo() {
        return escudo;
    }

    public int getPuntosEnergia() {
        return puntosEnergia;
    }

    public int getPuntosDeEscudoMax() {
        return puntosDeEscudoMax;
    }

    public int getPuntosDeEnergiaMax() {
        return puntosDeEnergiaMax;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
    
    
    
    
   
}

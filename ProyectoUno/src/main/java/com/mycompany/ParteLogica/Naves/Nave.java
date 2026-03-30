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
    private double evasionTemporal;
    private boolean turnoExtra;
    private boolean pierdeTurno;
    private boolean tieneCampoDeMinas;
    private boolean cañonIonesActivo;
    private boolean torpedosActivos;
    private boolean laserCriticoActivo;
    private boolean misilIgnoraEscudos;
    private boolean rayoParticulasActivo;
    private boolean campoDefleccionActivo;
    private boolean nucleoDeEnergiaActivo;
    private boolean omitirTurnoEnemigoActivo;
    private boolean evasionGarantizada;
    private boolean campoDeDistorsion;
    private int turnosCampoDistorcion;
    private boolean sobrecargaActiva;

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
        this.turnoExtra = false;
        this.pierdeTurno = false;
        this.tieneCampoDeMinas = false;
        this.cañonIonesActivo = false;
        this.torpedosActivos = false;
        this.laserCriticoActivo = false;
        this.misilIgnoraEscudos = false;
        this.rayoParticulasActivo = false;
        this.campoDefleccionActivo = false;
        this.nucleoDeEnergiaActivo = false;
        this.omitirTurnoEnemigoActivo = false;
        this.evasionGarantizada = false;
        this.campoDeDistorsion = false;
        this.turnosCampoDistorcion = 0;
        this.sobrecargaActiva = false;
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

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getPuntosEnergia() {
        return puntosEnergia;
    }

    public void setPuntosEnergia(int puntosEnergia) {
        this.puntosEnergia = puntosEnergia;
    }

    public int getPuntosDeEscudoMax() {
        return puntosDeEscudoMax;
    }

    public void setPuntosDeEscudoMax(int puntosDeEscudoMax) {
        this.puntosDeEscudoMax = puntosDeEscudoMax;
    }

    public int getCombustiblePremium() {
        return combustiblePremium;
    }

    public void setCombustiblePremium(int combustiblePremium) {
        this.combustiblePremium = combustiblePremium;
    }

    public int getPuntosDeEnergiaMax() {
        return puntosDeEnergiaMax;
    }

    public void setPuntosDeEnergiaMax(int puntosDeEnergiaMax) {
        this.puntosDeEnergiaMax = puntosDeEnergiaMax;
    }

    public int getPrecioDeNave() {
        return precioDeNave;
    }

    public void setPrecioDeNave(int precioDeNave) {
        this.precioDeNave = precioDeNave;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(int precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public double getEvasionBase() {
        return evasionBase;
    }

    public void setEvasionBase(double evasionBase) {
        this.evasionBase = evasionBase;
    }

    public int getComponentesInventario() {
        return componentesInventario;
    }

    public void setComponentesInventario(int componentesInventario) {
        this.componentesInventario = componentesInventario;
    }

    public double getEvasionTemporal() {
        return evasionTemporal;
    }

    public void setEvasionTemporal(double evasionTemporal) {
        this.evasionTemporal = evasionTemporal;
    }

    public boolean isTurnoExtra() {
        return turnoExtra;
    }

    public void setTurnoExtra(boolean turnoExtra) {
        this.turnoExtra = turnoExtra;
    }

    public boolean isPierdeTurno() {
        return pierdeTurno;
    }

    public void setPierdeTurno(boolean pierdeTurno) {
        this.pierdeTurno = pierdeTurno;
    }

    public boolean isTieneCampoDeMinas() {
        return tieneCampoDeMinas;
    }

    public void setTieneCampoDeMinas(boolean tieneCampoDeMinas) {
        this.tieneCampoDeMinas = tieneCampoDeMinas;
    }

    public boolean isCañonIonesActivo() {
        return cañonIonesActivo;
    }

    public void setCañonIonesActivo(boolean cañonIonesActivo) {
        this.cañonIonesActivo = cañonIonesActivo;
    }

    public boolean isTorpedosActivos() {
        return torpedosActivos;
    }

    public void setTorpedosActivos(boolean torpedosActivos) {
        this.torpedosActivos = torpedosActivos;
    }

    public boolean isLaserCriticoActivo() {
        return laserCriticoActivo;
    }

    public void setLaserCriticoActivo(boolean laserCriticoActivo) {
        this.laserCriticoActivo = laserCriticoActivo;
    }

    public boolean isMisilIgnoraEscudos() {
        return misilIgnoraEscudos;
    }

    public void setMisilIgnoraEscudos(boolean misilIgnoraEscudos) {
        this.misilIgnoraEscudos = misilIgnoraEscudos;
    }

    public boolean isRayoParticulasActivo() {
        return rayoParticulasActivo;
    }

    public void setRayoParticulasActivo(boolean rayoParticulasActivo) {
        this.rayoParticulasActivo = rayoParticulasActivo;
    }

    public boolean isCampoDefleccionActivo() {
        return campoDefleccionActivo;
    }

    public void setCampoDefleccionActivo(boolean campoDefleccionActivo) {
        this.campoDefleccionActivo = campoDefleccionActivo;
    }

    public boolean isNucleoDeEnergiaActivo() {
        return nucleoDeEnergiaActivo;
    }

    public void setNucleoDeEnergiaActivo(boolean nucleoDeEnergiaActivo) {
        this.nucleoDeEnergiaActivo = nucleoDeEnergiaActivo;
    }

    public Piloto[] getPiloto() {
        return piloto;
    }

    public boolean isOmitirTurnoEnemigoActivo() {
        return omitirTurnoEnemigoActivo;
    }

    public void setOmitirTurnoEnemigoActivo(boolean omitirTurnoEnemigoActivo) {
        this.omitirTurnoEnemigoActivo = omitirTurnoEnemigoActivo;
    }

    public boolean isEvasionGarantizada() {
        return evasionGarantizada;
    }

    public void setEvasionGarantizada(boolean evasionGarantizada) {
        this.evasionGarantizada = evasionGarantizada;
    }

    public boolean isCampoDeDistorsion() {
        return campoDeDistorsion;
    }

    public int getTurnosCampoDistorcion() {
        return turnosCampoDistorcion;
    }

    public void setTurnosCampoDistorcion(int turnosCampoDistorcion) {
        this.turnosCampoDistorcion = turnosCampoDistorcion;
    }

    public void setCampoDeDistorsion(boolean campoDeDistorsion) {
        this.campoDeDistorsion = campoDeDistorsion;
    }

    public boolean isSobrecargaActiva() {
        return sobrecargaActiva;
    }

    public void setSobrecargaActiva(boolean sobrecargaActiva) {
        this.sobrecargaActiva = sobrecargaActiva;
    }

    
    

    
    

}

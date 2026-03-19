/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Personajes;

import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Naves.Nave;
import com.mycompany.Objetos.ObjetoPrincipal.ObjetoPrincipal;
import com.mycompany.Pilotos.Piloto;


/**
 *
 * @author Kenny
 */
public abstract class Personaje {
    
    private final Nave[] flota;
    private final ComponenteDeNave[] inventarioComponentes;
    private final Piloto[] pilotosDisponibles;
    private final ObjetoPrincipal[] inventarioObjetos;
    private String nombrePersonaje;
    private int cantInventarioPilotos;
    private int cantInventarioComp;
    private int cantInventarioObjetos;
    private int cantidadDeFlota;
    
    public Personaje(String nombrePersonaje, int cantidadDeFlota) {
        this.nombrePersonaje = nombrePersonaje;
        this.flota = new Nave[cantidadDeFlota];
        this.cantInventarioComp = 5;
        this.cantInventarioObjetos = 5;
        this.cantInventarioPilotos = 5;
        this.inventarioComponentes = new ComponenteDeNave[5];
        this.pilotosDisponibles = new Piloto[5];
        this.inventarioObjetos = new ObjetoPrincipal[5];
        
    }
    
    public void agregarNave(Nave nave){
        for (int i = 0; i < flota.length; i++) {
            if(flota[i] == null){
                flota[i] = nave; 
                return;
            }
        }
    }
    
    public void mostrarNaves(){
        for (int i = 0; i < flota.length; i++) {
            if(flota[i] != null){
                System.out.println("||Nave " + (i + 1 ) + " : " + flota[i].getNombreDeNave() + 
                        "        Vida: " + flota[i].getPuntosDeVida() + "          Piloto abordo: " +flota[i].getPiloto()[0].getNombrePiloto() );
            }
        }
    }
    
    public void agregarInventarioComponente(ComponenteDeNave componente){
        for (int i = 0; i < inventarioComponentes.length; i++) {
            if(inventarioComponentes[i] == null){
      
            
        }
    }
   
    
        
    }
    
    public abstract void ejecutarOpcion(); 


    public int getCantidadDeFlota() {
        return cantidadDeFlota;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public Nave[] getFlota() {
        return flota;
    }



    
}

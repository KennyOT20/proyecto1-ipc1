/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Inventarios;

import com.mycompany.ParteLogica.Inventarios.InventarioComponente;
import com.mycompany.ParteLogica.Inventarios.InventarioNave;
import com.mycompany.ParteLogica.Inventarios.InventarioObjetos;
import com.mycompany.ParteLogica.Inventarios.InventarioPilotos;
import com.mycompany.ParteVisual.Bordes.Bordes;

/**
 *
 * @author Kenny
 */
public class Inventarios extends Bordes{
    
    private final InventarioComponente inventarioComponente;
    private final InventarioNave inventarioNave;
    private final InventarioObjetos inventarioObjetos;
    private final InventarioPilotos inventarioPilotos;

    public Inventarios(InventarioComponente inventarioComponente, InventarioNave inventarioNave, 
            InventarioObjetos inventarioObjetos, InventarioPilotos inventarioPilotos) {
        this.inventarioComponente = inventarioComponente;
        this.inventarioNave = inventarioNave;
        this.inventarioObjetos = inventarioObjetos;
        this.inventarioPilotos = inventarioPilotos;
    }
    
   
    public void mostraInventarioNaves(){
        
        int cantidadDeNaves = inventarioNave.getInventarioNave().length;
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves en inventario");
        imprimirBordeDeMenu();
        
        for (int i = 0; i < cantidadDeNaves; i++) {
            if(inventarioNave.getInventarioNave()[i] != null){
                
                String nombreDeNave = inventarioNave.getInventarioNave()[i].getNombreDeNave();
                String hpNave = String.valueOf(inventarioNave.getInventarioNave()[i].getPuntosDeVida());
                String lineaDeDatos = (i + 1 ) + ". " +   nombreDeNave + "        Hp: " + hpNave;
                
                imprimirLineaDeTexto(lineaDeDatos);
                
            } else if(inventarioNave.getInventarioNave()[0]== null){
                imprimirLineaDeTexto("Inventario vacio. ");
            }
            
        }
        
        imprimirBordeDeMenu();
    }
    
    
    public void mostrarPilotos(){
        
        int cantidadPilotos = inventarioPilotos.getInventarioPiloto().length;
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Pilotos en inventario");
        imprimirBordeDeMenu();
        
        for (int i = 0; i < cantidadPilotos; i++) {
            if(inventarioPilotos.getInventarioPiloto()[i] != null){
                String nombrePiloto = inventarioPilotos.getInventarioPiloto()[i].getNombrePiloto();
                String lineaDeTexto = (i+1) + ". " + nombrePiloto;
                
                imprimirLineaDeTexto(lineaDeTexto);
            }
        }
        
        imprimirBordeDeMenu();
        
    }
    
    public void mostrarComponentes(){
        int cantidadDeComponentes = inventarioComponente.getInventarioComponentes().length;
        
        imprimirBordeDeMenu();
        
        for (int i = 0; i < cantidadDeComponentes; i++) {
            
        }
    }
    
    public void mostrarObjetos(){
        
    }
}

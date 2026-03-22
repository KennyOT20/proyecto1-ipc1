/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.Arreglos.ArregloDeNaves.ArregloDeNaves;
import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Menus.MenuBase.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuCompraNave extends MenuBase{
    
    private final ArregloDeNaves arregloDeNaves;
    private final GeneradorDeNaves generarNave;
    
    public MenuCompraNave(){
        this.arregloDeNaves = new ArregloDeNaves();
        this.generarNave = new GeneradorDeNaves();
        
        arregloDeNaves.crearArregloNaves();
    }

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda de naves");
        imprimirBordeDeMenu();
        mostrarNaves();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
    }
    
    private void mostrarNaves(){
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves");
        imprimirBordeDeMenu();
        informacionDeNave();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nombre:              Precio:        Tipo:        Estadisticas:");
        imprimirBordeDeMenu();

        for (int i = 0; i < arregloDeNaves.getArregloDeNaves().length; i++) {

            String nombreDeNave = arregloDeNaves.getArregloDeNaves()[i].getNombreDeNave();
            String precioDeNave = String.valueOf(arregloDeNaves.getArregloDeNaves()[i].getPrecioDeNave());
            String tipoDeNave = arregloDeNaves.getArregloDeNaves()[i].getTipoDeNave();

            while(nombreDeNave.length() < 20){
                nombreDeNave += " ";
            }

            while(precioDeNave.length() < 12){
                precioDeNave += " ";
            }

            while(tipoDeNave.length() < 12){
                tipoDeNave += " ";
            }

            String estadisticasDeNave = 
                    "HP:" + arregloDeNaves.getArregloDeNaves()[i].getVelocidad() + " " + 
                    "SHP:" + arregloDeNaves.getArregloDeNaves()[i].getPuntosDeEscudo() +  " " + 
                    "EP:" + arregloDeNaves.getArregloDeNaves()[i].getPuntosDeEnergia() + " " + 
                    "SP:" + arregloDeNaves.getArregloDeNaves()[i].getVelocidad(); 

            String lineaCompletaDeTexto = (i+1) +". " + nombreDeNave +   precioDeNave +   tipoDeNave +  estadisticasDeNave;

            imprimirLineaDeTexto(lineaCompletaDeTexto);
        }

        imprimirBordeDeMenu();
    }
    
    
    private void informacionDeNave(){
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("HP: Puntos de vida");
        imprimirLineaDeTexto("SHP: Puntos de escudo");
        imprimirLineaDeTexto("EP: Puntos de energia");
        imprimirLineaDeTexto("SP: Velocidad");
    }
    
    
    
    
}

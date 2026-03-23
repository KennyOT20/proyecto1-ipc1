/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.Arreglos.ArregloDeNaves.ArregloDeNaves;
import com.mycompany.BaseEspacial.TiendaCompra;
import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Menus.MenuBase.MenuBase;
import com.mycompany.Naves.Nave;
import com.mycompany.Partida.Partida;

/**
 *
 * @author Kenny
 */
public class MenuCompraDeNaves extends MenuBase{
    
    private final MenuOpcionesCompra menuOpciones;
    private final ArregloDeNaves arregloDeNaves;
    private final GeneradorDeNaves generarNave;
    private final Partida partida;
    private final TiendaCompra tienda;
    
    private boolean compraValida;
    
    public MenuCompraDeNaves(MenuOpcionesCompra menuOpciones, Partida partida){
        this.menuOpciones = menuOpciones;
        this.partida = partida;
        this.arregloDeNaves = new ArregloDeNaves();
        this.generarNave = new GeneradorDeNaves();
        this.tienda = new TiendaCompra(partida);
        this.compraValida = false;
        
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
        
        Nave naveComprada;
        
        switch(opcion){
            case 1:
                naveComprada = generarNave.crearAcorazado();
                compraValida = tienda.validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 2:
                naveComprada = generarNave.crearCaza();
                compraValida = tienda.validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 3: 
                naveComprada = generarNave.crearFragata();
                compraValida = tienda.validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 4: 
                naveComprada = generarNave.crearNaveApoyo();
                compraValida = tienda.validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 5:
                limpiarPantalla();
                menuOpciones.mostrarInformacion();
                break;
            default: 
                break;
        }
    }
    
    private void mostrarNaves(){
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves");
        imprimirBordeDeMenu();
        datos();
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
        
        imprimirLineaDeTexto("5. Volver al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }
    
    
    private void datos(){
        String creditosEstelarJugador = String.valueOf(partida.getJugador().getCreditosGalacticos());
        String datos = "CR: " + creditosEstelarJugador;
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(datos);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("HP: Puntos de vida");
        imprimirLineaDeTexto("SHP: Puntos de escudo");
        imprimirLineaDeTexto("EP: Puntos de energia");
        imprimirLineaDeTexto("SP: Velocidad");
    }
    
    private void mostrarInfoCompra(Nave naveComprada){
        
        String nombreNave = naveComprada.getNombreDeNave();
        String lineaDeTexto = "Felicidades has comprado la nave " + nombreNave;
        
        imprimirBordeDeMenu();
        
        if(compraValida){
            imprimirLineaDeTexto(lineaDeTexto);
        } else {
            imprimirLineaDeTexto("CR insuficiente");
        }
        
        imprimirBordeDeMenu();
        
        mostrarInformacion();
        
    }
    
    
}

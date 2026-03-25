/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.ParteLogica.Arreglos.ArregloDeNaves.ArregloDeNaves;
import com.mycompany.ParteLogica.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;

/**
 *
 * @author Kenny
 */
public class MenuCompraDeNaves extends MenuCompraVenta{
    
    private final ArregloDeNaves arregloDeNaves;
    private final GeneradorDeNaves generarNave;
    
    private boolean compraValida;

    public MenuCompraDeNaves(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.arregloDeNaves = new ArregloDeNaves();
        this.generarNave = new GeneradorDeNaves();
        this.compraValida = false;
        
        arregloDeNaves.crearArregloNaves();
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda de naves");
        imprimirBordeDeMenu();
        mostrarOpcionesDeCompra();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        Nave naveComprada;
        
        switch(opcion){
            case 1:
                naveComprada = generarNave.crearAcorazado();
                compraValida = getTienda().validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 2:
                naveComprada = generarNave.crearCaza();
                compraValida = getTienda().validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 3: 
                naveComprada = generarNave.crearFragata();
                compraValida = getTienda().validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 4: 
                naveComprada = generarNave.crearNaveApoyo();
                compraValida = getTienda().validarCompraNave(naveComprada);
                limpiarPantalla();
                mostrarInfoCompra(naveComprada);
                break;
            case 5:
                limpiarPantalla();
                getMenuOpciones().mostrarInformacion();
                break;
            default: 
                limpiarPantalla();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo.");
                mostrarInformacion();
                break;
        }
    }
    
    @Override
    public void mostrarOpcionesDeCompra(){
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves");
        imprimirBordeDeMenu();
        mostrarDatos();
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
   
    public void mostrarDatos(){
        String creditosEstelarJugador = String.valueOf(getPartida().getJugador().getCreditosGalacticos());
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
        String creditosEstelarJugador = String.valueOf(getPartida().getJugador().getCreditosGalacticos());
        String nombreNave = naveComprada.getNombreDeNave();
        String lineaDeTexto = "Felicidades has comprado la nave " + nombreNave + " por " + creditosEstelarJugador + " CR." ;
        
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraDeComponentes;

import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeEscudos;
import com.mycompany.ParteLogica.Componentes.Escudos.Escudo;
import com.mycompany.ParteLogica.Generadores.GeneradorDeComponentesNave.GeneradorDeEscudos;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class MenuEscudos extends MenuCompraVenta {

    private final ArregloDeEscudos arregloEscudos;
    private final GeneradorDeEscudos crearEscudo;
    private boolean compraValida;
    
    public MenuEscudos(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.arregloEscudos = new ArregloDeEscudos();
        this.crearEscudo = new GeneradorDeEscudos();
        this.compraValida = false;
        arregloEscudos.crearArreglo();
        
    }


    @Override
    public void mostrarInformacion() {
        String crJugador = String.valueOf(getPartida().getJugador().getCreditosGalacticos());
        String linea = "CR: " + crJugador;
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de Escudos");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(linea);
        imprimirBordeDeMenu();
        mostrarOpcionesDeCompra();
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        Escudo escudoComprado;
        
        switch(opcion){
            case 1:
                escudoComprado = crearEscudo.crearCampoDeflexion();
                compraValida = getTienda().validarCompraComponentes(escudoComprado);
                limpiarPantalla();
                mostrarDatosCompra(escudoComprado);
                break;
            case 2:
                escudoComprado = crearEscudo.crearEscudoReforzado();
                compraValida = getTienda().validarCompraComponentes(escudoComprado);
                limpiarPantalla();
                mostrarDatosCompra(escudoComprado);
                break;
            case 3:
                escudoComprado = crearEscudo.crearGeneradorDeOndas();
                compraValida = getTienda().validarCompraComponentes(escudoComprado);
                limpiarPantalla();
                mostrarDatosCompra(escudoComprado);
                break;
            case 4:
                escudoComprado = crearEscudo.crearNucleoDeEnergia();
                compraValida = getTienda().validarCompraComponentes(escudoComprado);
                limpiarPantalla();
                mostrarDatosCompra(escudoComprado);
                break;
            case 5:
                escudoComprado = crearEscudo.crearPantallaDeAsteroides();
                compraValida = getTienda().validarCompraComponentes(escudoComprado);
                limpiarPantalla();
                mostrarDatosCompra(escudoComprado);
                break;
            case 6:
                limpiarPantalla();
                getMenuOpciones().mostrarInformacion();
                break;
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo.");
                imprimirBordeDeMenu();
                mostrarInformacion();
                break;
        }
    }
    
    @Override
    public void mostrarOpcionesDeCompra() {

     int cantidadEscudo = arregloEscudos.getArregloDeComponentes().length;

     imprimirLineaDeTexto("Escudo                  Peso            Precio");

     for (int i = 0; i < cantidadEscudo; i++) {

         String nombreEscudo = arregloEscudos.getArregloDeComponentes()[i].getNombreComponente();
         String pesoEscudo = arregloEscudos.getArregloDeComponentes()[i].getPesoComponente();
         String precioEscudo = String.valueOf(arregloEscudos.getArregloDeComponentes()[i].getPrecioComponente());

         String nombreFormateado = "";
         int contador = 0;

         while(contador < nombreEscudo.length() && contador < 20){
             nombreFormateado += nombreEscudo.charAt(contador);
             contador++;
         }

         while(nombreFormateado.length() < 20){
             nombreFormateado += " ";
         }

         while(pesoEscudo.length() < 15){
             pesoEscudo += " ";
         }

         while(precioEscudo.length() < 10){
             precioEscudo += " ";
         }

         String lineaDeEscudos =  (i+1) + ". " +   nombreFormateado + pesoEscudo + precioEscudo;

         imprimirLineaDeTexto(lineaDeEscudos);
        }

        imprimirLineaDeTexto("");
        imprimirLineaDeTexto("6. Volver al menu de compras");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
    }


    private void mostrarDatosCompra(Escudo escudoComprado){
        
        String nombreEscudo = escudoComprado.getNombreComponente();
        String linea = "Felicidades, has comprado " + nombreEscudo;
        
        imprimirBordeDeMenu();
        
        if(compraValida == true){
            imprimirLineaDeTexto(linea);
        } else {
            imprimirLineaDeTexto("CR insuficiente");
        }
        
        imprimirBordeDeMenu();
        
        mostrarInformacion();
        
        
    }
    
}
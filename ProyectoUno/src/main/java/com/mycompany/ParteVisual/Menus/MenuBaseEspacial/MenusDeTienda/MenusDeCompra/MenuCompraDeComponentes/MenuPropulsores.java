/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraDeComponentes;

import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDePropulsores;
import com.mycompany.ParteLogica.Componentes.Propulsores.Propulsor;
import com.mycompany.ParteLogica.Generadores.GeneradorDeComponentesNave.GeneradorDePropulsores;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class MenuPropulsores extends MenuCompraVenta {

    private final ArregloDePropulsores arregloPropulsores;
    private final GeneradorDePropulsores crearPropulsor;
    private boolean opcionValida;
    
    
    public MenuPropulsores(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.arregloPropulsores = new ArregloDePropulsores();
        this.crearPropulsor = new GeneradorDePropulsores();
        this.opcionValida = false;
        
        arregloPropulsores.crearArreglo();
    }

    @Override
   public void mostrarOpciones() {

        int cantidadPropulsores = arregloPropulsores.getArregloDeComponentes().length;

        imprimirLineaDeTexto("Propulsor              Peso            Precio        Velocidad");

        for (int i = 0; i < cantidadPropulsores; i++) {

            Propulsor propulsor = (Propulsor) arregloPropulsores.getArregloDeComponentes()[i];

            String nombrePropulsor = arregloPropulsores.getArregloDeComponentes()[i].getNombreComponente();
            String pesoComponente = arregloPropulsores.getArregloDeComponentes()[i].getPesoComponente();
            String precioComponente = String.valueOf(arregloPropulsores.getArregloDeComponentes()[i].getPrecioComponente());
            String velocidad = String.valueOf(propulsor.getVelocidadExtra());

            String nombreFormateado = "";
            int contador = 0;

            while(contador < nombrePropulsor.length() && contador < 20){
                nombreFormateado += nombrePropulsor.charAt(contador);
                contador++;
            }

            while(nombreFormateado.length() < 20){
                nombreFormateado += " ";
            }

            while(pesoComponente.length() < 15){
                pesoComponente += " ";
            }

            while(precioComponente.length() < 12){
                precioComponente += " ";
            }

            while(velocidad.length() < 10){
                velocidad += " ";
            }

            String linea =  (i+1) + ". " + nombreFormateado + pesoComponente +  precioComponente + velocidad;

            imprimirLineaDeTexto(linea);
        }

        imprimirLineaDeTexto("");
        imprimirLineaDeTexto("5. Volver al menu de compras");
        imprimirBordeDeMenu();
    }

    @Override
    public void mostrarInformacion() {
        
        String crJugador = "CR: " + String.valueOf(getPartida().getJugador().getCreditosGalacticos());
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda de propulsores");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(crJugador);
        imprimirBordeDeMenu();
        mostrarOpciones();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        Propulsor propulsorComprado;
        
        switch(opcion){
            case 1:
                propulsorComprado = crearPropulsor.crearMicroPropulsor();
                opcionValida = getTienda().validarCompraComponentes(propulsorComprado);
                limpiarPantalla();
                mostrarDatosVenta(propulsorComprado);
                break;
            case 2:
                propulsorComprado = crearPropulsor.crearPropulsorCuantico();
                opcionValida = getTienda().validarCompraComponentes(propulsorComprado);
                limpiarPantalla();
                mostrarDatosVenta(propulsorComprado);
                break;
            case 3:
                propulsorComprado = crearPropulsor.crearSistemaDeManiobra();
                opcionValida = getTienda().validarCompraComponentes(propulsorComprado);
                limpiarPantalla();
                mostrarDatosVenta(propulsorComprado);
                break;
            case 4:
                propulsorComprado = crearPropulsor.crearTurboCompresor();
                opcionValida = getTienda().validarCompraComponentes(propulsorComprado);
                limpiarPantalla();
                mostrarDatosVenta(propulsorComprado);
                break;
            case 5:
                limpiarPantalla();
                getMenuOpciones().mostrarInformacion();
                break;
            default:
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                mostrarInformacion();
                break;
        }
    }
    
    
    private void mostrarDatosVenta(Propulsor propulsor){
        
        imprimirBordeDeMenu();
        if(opcionValida){
            String datos = "Felicidades has comprador " + propulsor.getNombreComponente();
            imprimirLineaDeTexto(datos);
        } else {
            imprimirLineaDeTexto("CR insuficiente.");
        }
        
        imprimirBordeDeMenu();
        
        mostrarInformacion();
    }
}

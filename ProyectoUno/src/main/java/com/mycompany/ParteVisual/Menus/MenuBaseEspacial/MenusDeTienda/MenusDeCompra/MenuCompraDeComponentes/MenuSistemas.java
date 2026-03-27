/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraDeComponentes;

import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeSistemas;
import com.mycompany.ParteLogica.Componentes.SistemasDeApoyo.SistemaDeApoyo;
import com.mycompany.ParteLogica.Generadores.GeneradorDeComponentesNave.GeneradorDeSistemas;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class MenuSistemas extends MenuCompraVenta{

    private final ArregloDeSistemas arregloSistemas;
    private final GeneradorDeSistemas crearSistema;
    private boolean compraValida;
    
    public MenuSistemas(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.arregloSistemas = new ArregloDeSistemas();
        this.crearSistema = new GeneradorDeSistemas();
        this.compraValida = false;
        
        arregloSistemas.crearArreglo();
    }

        @Override
    public void mostrarInformacion() {
        
        String datos = "CR: " + getPartida().getJugador().getCreditosGalacticos();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda de sistemas de apoyo");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(datos);
        imprimirBordeDeMenu();
        mostrarOpciones();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();

    }
    
    @Override
    public void mostrarOpciones() {

        int cantidadSistemas = arregloSistemas.getArregloDeComponentes().length;

        imprimirLineaDeTexto("Sistema de apoyo              Peso            Precio");

        for (int i = 0; i < cantidadSistemas; i++) {

            String nombreSistema = arregloSistemas.getArregloDeComponentes()[i].getNombreComponente();
            String pesoSistema = arregloSistemas.getArregloDeComponentes()[i].getPesoComponente();
            String precioSistema = String.valueOf(arregloSistemas.getArregloDeComponentes()[i].getPrecioComponente());

            String nombreFormateado = "";
            int contador = 0;

            while (contador < nombreSistema.length() && contador < 30) {
                nombreFormateado += nombreSistema.charAt(contador);
                contador++;
            }

            while (nombreFormateado.length() < 30) {
                nombreFormateado += " ";
            }

            while (pesoSistema.length() < 15) {
                pesoSistema += " ";
            }

            while (precioSistema.length() < 10) {
                precioSistema += " ";
            }

            String linea = (i + 1) + ". " + nombreFormateado + pesoSistema + precioSistema;

            imprimirLineaDeTexto(linea);
        }

        imprimirLineaDeTexto("6. Volver al menu de compras.");
        imprimirBordeDeMenu();
 }


    @Override
    public void ejecutarOpcion(int opcion) {
        
        SistemaDeApoyo sistemaComprado;
        
        switch(opcion){
            case 1:
                sistemaComprado = crearSistema.crearCampoDistorcion();
                compraValida = getTienda().validarCompraComponentes(sistemaComprado);
                limpiarPantalla();
                mostrarInfoCompra(sistemaComprado);
                mostrarInformacion();
                break;
            case 2:
                sistemaComprado = crearSistema.crearCamuflajeTactico();
                compraValida = getTienda().validarCompraComponentes(sistemaComprado);
                limpiarPantalla();
                mostrarInfoCompra(sistemaComprado);
                mostrarInformacion();
                break;
            case 3:
                sistemaComprado = crearSistema.crearDronDeReparacion();
                compraValida = getTienda().validarCompraComponentes(sistemaComprado);
                limpiarPantalla();
                mostrarInfoCompra(sistemaComprado);
                mostrarInformacion();
                break;
            case 4:
                sistemaComprado = crearSistema.crearGeneradorDeEscudo();
                compraValida = getTienda().validarCompraComponentes(sistemaComprado);
                limpiarPantalla();
                mostrarInfoCompra(sistemaComprado);
                mostrarInformacion();
                break;
            case 5:
                sistemaComprado = crearSistema.crearNucleoDeSobreCarga();
                compraValida = getTienda().validarCompraComponentes(sistemaComprado);
                limpiarPantalla();
                mostrarInfoCompra(sistemaComprado);
                mostrarInformacion();
                break;
            case 6: 
                limpiarPantalla();
                getMenuOpciones().mostrarInformacion();
                break;
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                mostrarInformacion();
                break;
        }
    }
    
    private void mostrarInfoCompra(SistemaDeApoyo sistema){
        
        imprimirBordeDeMenu();
         
        if(compraValida){
            String datosFinales  = "Felicidades has comprado el sistema " + 
                    sistema.getNombreComponente() + " por " + sistema.getPrecioComponente() + " CR";
            imprimirLineaDeTexto(datosFinales);
        } else {
            imprimirLineaDeTexto("CR insuficiente");
        }
       
       imprimirBordeDeMenu();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra;

import com.mycompany.ParteLogica.Arreglos.ArregloDeObjetos;
import com.mycompany.ParteLogica.Generadores.GeneradorDeObjetos.GeneradorDeObjetos;
import com.mycompany.ParteLogica.Objetos.ObjetoPrincipal;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;

/**
 *
 * @author Kenny
 */
public class MenuObjetos extends MenuCompraVenta{

    private final ArregloDeObjetos arregloObjetos;
    private final GeneradorDeObjetos crearObjetos;
    private boolean compraValida;
    
    public MenuObjetos(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.arregloObjetos = new ArregloDeObjetos();
        this.crearObjetos = new GeneradorDeObjetos();
        this.compraValida = false;
    }

    @Override
    public void mostrarOpcionesDeCompra() {

        int cantidadObjetos = arregloObjetos.getArregloDeObjetos().length;

        imprimirLineaDeTexto("Objeto                          Precio");

        for (int i = 0; i < cantidadObjetos; i++) {

            String nombreObjeto = arregloObjetos.getArregloDeObjetos()[i].getNombreDeObjeto();
            String precioObjeto = String.valueOf(arregloObjetos.getArregloDeObjetos()[i].getPrecioDeObjeto());

            String nombreFormateado = "";
            int contador = 0;

            while (contador < nombreObjeto.length() && contador < 30) {
                nombreFormateado += nombreObjeto.charAt(contador);
                contador++;
            }

            while (nombreFormateado.length() < 30) {
                nombreFormateado += " ";
            }

            while (precioObjeto.length() < 10) {
                precioObjeto += " ";
            }

            String linea = (i + 1) + ". " + nombreFormateado + precioObjeto;

            imprimirLineaDeTexto(linea);
        }

        imprimirLineaDeTexto("7. Volver al menu de compras");
        imprimirBordeDeMenu();
  }

    @Override
    public void mostrarInformacion() {
        
        String crJugador = "CR: " + getPartida().getJugador().getCreditosGalacticos();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda de objetos");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(crJugador);
        imprimirBordeDeMenu();
        mostrarOpcionesDeCompra();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        ObjetoPrincipal objetoComprado;
        
        switch(opcion){
            case 1:
                objetoComprado = crearObjetos.crearDeMejora();
                compraValida = getTienda().validarObjetos(objetoComprado);
                limpiarPantalla();
                mostrarDatosFinales(objetoComprado);
                break;
            case 2:
                objetoComprado = crearObjetos.crearEscape();
                compraValida = getTienda().validarObjetos(objetoComprado);
                limpiarPantalla();
                mostrarDatosFinales(objetoComprado);
                break;
            case 3:
                objetoComprado = crearObjetos.crearEscudo();
                compraValida = getTienda().validarObjetos(objetoComprado);
                limpiarPantalla();
                mostrarDatosFinales(objetoComprado);
                break;
            case 4:
                objetoComprado = crearObjetos.crearReparacion();
                compraValida = getTienda().validarObjetos(objetoComprado);
                limpiarPantalla();
                mostrarDatosFinales(objetoComprado);
                break;
            case 5:
                objetoComprado = crearObjetos.objetoDeSabotaje();
                compraValida = getTienda().validarObjetos(objetoComprado);
                limpiarPantalla();
                mostrarDatosFinales(objetoComprado);
                break;
            case 6:
                objetoComprado = crearObjetos.objetoDeVelocidad();
                compraValida = getTienda().validarObjetos(objetoComprado);
                limpiarPantalla();
                mostrarDatosFinales(objetoComprado);
                break;
            case 7:
                limpiarPantalla();
                getMenuOpciones().mostrarInformacion();
                break;
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                imprimirBordeDeMenu();
                break; 
                
        }
    }
    
    private void mostrarDatosFinales(ObjetoPrincipal objetoComprado){
        imprimirBordeDeMenu();
        if(compraValida){
            String compra = "Has comprado " + objetoComprado.getNombreDeObjeto() +
                    " por " +   objetoComprado.getPrecioDeObjeto() + " CR";
            imprimirLineaDeTexto(compra);
        } else {
            imprimirLineaDeTexto("CR insuficiente ");
        }
        
        imprimirBordeDeMenu();
        mostrarInformacion();
    }
    
}

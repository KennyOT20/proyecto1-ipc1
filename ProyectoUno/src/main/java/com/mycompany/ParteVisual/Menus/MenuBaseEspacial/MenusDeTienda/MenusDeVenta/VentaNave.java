/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class VentaNave extends MenuModelo{

    private final Inventarios inventario; 

    public VentaNave(MenuOpcionesCompra menuOpciones, Partida partida, Inventarios inventario) {
        super(menuOpciones, partida);
        this.inventario = inventario;
    }

    

    @Override
    public void mostrarOpciones() {
        String crJugador = "CR: " + String.valueOf(getPartida().getJugador().getCreditosGalacticos());
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de naves");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(crJugador);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Que nave deseas vender.");
        imprimirBordeDeMenu();
        mostrarInformacion();
        imprimirLineaDeTexto("0. Volver al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
        
    }

    @Override
    public void mostrarInformacion() {
        inventario.mostraInventarioNaves();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
       int tamañoInventario = getPartida().getJugador().getInventarioNaves().contarNaves();
        
        if(opcion == 0){
            limpiarPantalla();
            getMenuOpciones().mostrarInformacion();
            return;
        }
        if(opcion > 0 && opcion <= tamañoInventario){
            mostrarDatosDeVenta(opcion);
        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            mostrarOpciones();
        }
    }
    
    private void mostrarDatosDeVenta(int opcion){
         Nave naveVendida;
            limpiarPantalla();
            naveVendida = getVender().venderNaves(opcion);
            String nombreNave = naveVendida.getNombreDeNave();
            String precio = String.valueOf(naveVendida.getPrecioDeVenta());
            String linea = "Has vendido la nave " + nombreNave + " por " + precio + " CR";
            imprimirBordeDeMenu();
            imprimirLineaDeTexto( linea);
            imprimirBordeDeMenu();
            mostrarOpciones();
    }
    
}

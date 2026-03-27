/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaVenta;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteLogica.Pilotos.Piloto;
import com.mycompany.ParteVisual.Inventarios.Inventarios;

/**
 *
 * @author Kenny
 */
public class VentaPiloto extends MenuBaseVenta{

    public VentaPiloto(Inventarios inventario, Partida partida, TiendaVenta vender, MenuDeVentas menuVentas) {
        super(inventario, partida, vender, menuVentas);
    }

    @Override
    public void mostrarInformacion() {
        String crJugador = "CR: "  + String.valueOf(getPartida().getJugador().getCreditosGalacticos());
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de pilotos");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(crJugador);
        imprimirBordeDeMenu();
        getInventario().mostrarPilotos();
        imprimirLineaDeTexto("0. Volver al menu principal");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int tamañoInventario = getPartida().getJugador().getInventarioPilotos().contarPilotos();
        
        if(opcion == 0){
            limpiarPantalla();
            getMenuVentas().mostrarInformacion();
        } else if(opcion > 0 && opcion <= tamañoInventario){
            limpiarPantalla();
            mostrarDatosDeVenta(opcion);
        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            mostrarInformacion();
        }
    }
    
       @Override
    public void mostrarDatosDeVenta(int opcion) {
          Piloto piltoVendido;
            limpiarPantalla();
            piltoVendido = getVender().venderPilotos(opcion);
            String nombreNave = piltoVendido.getNombrePiloto();
            String precio = String.valueOf(piltoVendido.getPrecioDeVenta());
            String linea = "Has vendido la nave " + nombreNave + " por " + precio + " CR";
            imprimirBordeDeMenu();
            imprimirLineaDeTexto( linea);
            imprimirBordeDeMenu();
            mostrarInformacion();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeVenta;

import com.mycompany.ParteLogica.BaseEspacial.TiendaVenta;
import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;

/**
 *
 * @author Kenny
 */
public class VentaComponente extends MenuBaseVenta{

    public VentaComponente(Inventarios inventario, Partida partida, TiendaVenta vender, MenuDeVentas menuVentas) {
        super(inventario, partida, vender, menuVentas);
    }

    
    @Override
    public void mostrarInformacion() {
        String crJugador = "CR: " + getPartida().getJugador().getCreditosGalacticos();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Venta de componentes");
        imprimirLineaDeTexto("");
        imprimirLineaDeTexto(crJugador);
        imprimirBordeDeMenu();
        getInventario().mostrarComponentes();
        imprimirLineaDeTexto("0. Volver al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion:");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int tamañoInventario = getPartida().getJugador().getInventarioComponentes().contarComponentes();
        
        if(opcion == 0){
            limpiarPantalla();
            getMenuVentas().mostrarInformacion();
        } else if(opcion > 0 && opcion <= tamañoInventario){
            mostrarDatosDeVenta(opcion);
        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }

    @Override
    public void mostrarDatosDeVenta(int opcion) {
          ComponenteDeNave componenteVendido;
            limpiarPantalla();
            componenteVendido = getVender().venderComponentes(opcion);
            String nombreNave = componenteVendido.getNombreComponente();
            String precio = String.valueOf(componenteVendido.getPrecioDeVenta());
            String linea = "Has vendido la nave " + nombreNave + " por " + precio + " CR";
            imprimirBordeDeMenu();
            imprimirLineaDeTexto( linea);
            imprimirBordeDeMenu();
            mostrarInformacion();
    }


    
}

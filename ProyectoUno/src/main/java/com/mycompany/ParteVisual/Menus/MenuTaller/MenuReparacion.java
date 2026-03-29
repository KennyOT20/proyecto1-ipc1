/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.BaseEspacial.Taller;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuReparacion extends MenuBase {
    
    private final MenuTaller menuTaller;
    private final Partida partida;
    private final Inventarios inventario;
    private final Taller taller;
    
    public MenuReparacion(MenuTaller menuTaller, Partida partida, Inventarios inventario){
        this.menuTaller = menuTaller;
        this.partida = partida;
        this.inventario = inventario;
        this.taller = new Taller();
    }

    @Override
    public void mostrarInformacion() {
        String lineaDatos = "CR: " + String.valueOf(partida.getJugador().getCreditosGalacticos());
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Reparar nave dañada");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(lineaDatos);
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirLineaDeTexto("0. Regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int cantidadDeNaves = partida.getJugador().getInventarioNaves().getCantidadArreglo();
        
        if(opcion == 0){
            limpiarPantalla();
            menuTaller.mostrarInformacion();
        }
        
        if(opcion > 0 && opcion <= cantidadDeNaves){
           validarCompra(opcion, cantidadDeNaves);
        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }
    
    private void validarCompra(int opcion, int cantidadDeNaves){
        Nave obtenida = partida.getJugador().getInventarioNaves().eliminarNave(opcion);
            int precioReparacion = obtenida.calcularPrecioReparacion();
            boolean dineroExacto = false; 
            
            if(partida.getJugador().getCreditosGalacticos() >= precioReparacion){
                dineroExacto = true; 
            }
            
            boolean naveReparada = taller.repararNave(obtenida, partida.getJugador());
            partida.getJugador().getInventarioNaves().agregarNavesInventario(obtenida);
            limpiarPantalla();
           
            datosReparacion(obtenida, naveReparada, cantidadDeNaves, dineroExacto);
    }
    
    private void datosReparacion(Nave nave, boolean naveReparada, int cantidadRecibida, boolean dineroFaltante){
        imprimirBordeDeMenu();
        
        if(naveReparada ){
            String linea = "Has reparado la nave " + nave.getNombreDeNave() + " por " + cantidadRecibida;
            imprimirLineaDeTexto(linea);
        } else if (!dineroFaltante){
            
            imprimirLineaDeTexto("No tienes suficiente CR");
            
        }else {
            
        imprimirLineaDeTexto("La nave no necesita reparacion");
        
        }
        
        mostrarInformacion();
    }
    
}

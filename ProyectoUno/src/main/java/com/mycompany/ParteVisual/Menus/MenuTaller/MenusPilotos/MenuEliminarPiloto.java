/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller.MenusPilotos;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteLogica.Pilotos.Piloto;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Inventarios.MostrarNave;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;
import com.mycompany.ParteVisual.Menus.MenuTaller.MenuTaller;

/**
 *
 * @author Kenny
 */
public class MenuEliminarPiloto extends MenuBase {

    private final Inventarios inventario;
    private final Partida partida;
    private final MostrarNave mostrarPiloto;
    private final MenuTaller menuTaller;
    private Nave nave;
    
    public MenuEliminarPiloto(Partida partida, Inventarios inventario, MenuTaller menuTaller){
        this.partida = partida;
        this.inventario = inventario;
        this.menuTaller = menuTaller;
        this.nave = null;
        this.mostrarPiloto = new MostrarNave();
    }
    
    public void obtenerNave(Nave naveObtenida){
        nave = naveObtenida;
    }

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Eliminar piloto");
        imprimirBordeDeMenu();
        mostrarPiloto.mostrarPiloto(nave);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("1. Eliminar piloto");
        imprimirLineaDeTexto("2. Volver al menu");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {

        switch (opcion) {
            case 1:
                limpiarPantalla();
                Piloto pilotoEliminado = nave.eliminarPiloto();
                if(pilotoEliminado != null){
                    partida.getJugador().getInventarioPilotos().agregarPiloto(pilotoEliminado);
                    mostrarDatos(pilotoEliminado, true);
                } else {
                    mostrarDatos(null, false);
                }   break;
            case 2:
                limpiarPantalla();
                partida.getJugador().getInventarioNaves().agregarNavesInventario(nave);
                menuTaller.mostrarInformacion();
                break;
            default:
                limpiarPantalla();
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                imprimirBordeDeMenu();
                mostrarInformacion();
                break;
        }
    }
    
    private void mostrarDatos(Piloto pilotoEliminado, boolean eliminado){
        
        imprimirBordeDeMenu();
        
        if(eliminado){
            String linea = "Has eliminado al piloto " + pilotoEliminado.getNombrePiloto() + " de la nave " + nave.getNombreDeNave();
            imprimirLineaDeTexto(linea);
        } else {
            imprimirLineaDeTexto("La nave no posee piloto.");
        }
        

        
        imprimirBordeDeMenu();
        mostrarInformacion();
    }
}
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
public class MenuAgregarPiloto extends MenuBase {
    
    private final Inventarios inventario;
    private final Partida partida;
    private final MostrarNave mostrarPiloto;
    private final MenuTaller menuTaller;
    private Nave nave;
    
    
    public MenuAgregarPiloto(Partida partida, Inventarios inventario, MenuTaller menuTaller){
        this.partida = partida;
        this.inventario = inventario;
        this.nave = null;
        this.menuTaller = menuTaller;
        this.mostrarPiloto = new MostrarNave();
    }

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Agregar piloto");
        imprimirBordeDeMenu();
        inventario.mostrarPilotos();
        imprimirBordeDeMenu();
        mostrarPiloto.mostrarPiloto(nave);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Guardar y regresar al menu");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    public void ObtenerNave(Nave naveObtenida){
        nave = naveObtenida;
    }
    
    @Override
    public void ejecutarOpcion(int opcion) {
        int cantidadPilotos = partida.getJugador().getInventarioPilotos().getCantidadDePilotos();
        
        if(opcion == 0){
            limpiarPantalla();
            partida.getJugador().getInventarioNaves().agregarNavesInventario(nave);
            menuTaller.mostrarInformacion();
        } 
        
        if(opcion > 0 && opcion <= cantidadPilotos){
            limpiarPantalla();
            Piloto pilotoObtenido = partida.getJugador().getInventarioPilotos().eliminarObjeto(opcion);
            boolean pilotoColocado = nave.agregarPiloto(pilotoObtenido);
            mostrarDatos(pilotoObtenido, pilotoColocado);
        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }
    
    private void mostrarDatos(Piloto pilotoObtenido,  boolean pilotoColacado){
        
        imprimirBordeDeMenu();
        
        if(pilotoColacado){
            String linea = "Has equipado al piloto " + pilotoObtenido.getNombrePiloto() + " a tu nave " + nave.getNombreDeNave();
            imprimirLineaDeTexto(linea);
        } else {
            partida.getJugador().getInventarioPilotos().agregarPiloto(pilotoObtenido);
            imprimirLineaDeTexto("La nave ya posee un piloto.");
        }
        
        
        imprimirBordeDeMenu();
        mostrarInformacion();
    }
    
}

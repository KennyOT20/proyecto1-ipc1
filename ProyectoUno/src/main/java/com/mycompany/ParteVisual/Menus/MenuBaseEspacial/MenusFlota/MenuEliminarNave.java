/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusFlota;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.MostrarFlota;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuEliminarNave extends MenuBase {

    private final MostrarFlota verFLota;
    private final Partida partida;
    private Nave nave;
    private final MenuFlota menuFlota;
    
    public MenuEliminarNave(Partida partida, MenuFlota menuFlota){
        this.partida = partida;
        this.verFLota = new MostrarFlota(partida.getJugador().getFlota());
        this.menuFlota = menuFlota;
        this.nave = null;
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Eliminar nave de flota");
        imprimirBordeDeMenu();
        verFLota.mostrarFlota();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Guardar y regresar al menu anterior");
        imprimirBordeDeMenu();
        System.out.println("Ingrese una opcion: ");
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int cantidadDeNaves = partida.getJugador().getFlota().getCantidadDeNaves();
        
        if(opcion == 0){
            limpiarPantalla();
            partida.getJugador().getInventarioNaves().agregarNavesInventario(nave);
            menuFlota.mostrarInformacion();
        }
        
        if(opcion > 0 && opcion <= cantidadDeNaves){
            limpiarPantalla();
            nave = partida.getJugador().getFlota().eliminarNave(opcion);
            partida.getJugador().getInventarioNaves().agregarNavesInventario(nave);
            mostrarDatos();
            mostrarInformacion();
        }
    }
    
    private void mostrarDatos(){
        
        imprimirBordeDeMenu();
        
        if(nave == null){
            imprimirLineaDeTexto("La flota debe de tener al menos una nave");
        } else {
            String nombreNave = "Se ha quitado la " + nave.getNombreDeNave() + " y se envio al inventario";
            imprimirLineaDeTexto(nombreNave);
        }
        
        imprimirBordeDeMenu();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusFlota;

import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Inventarios.MostrarFlota;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuAgregarNave extends MenuBase {

    private final Inventarios inventario;
    private final Partida partida;
    private final MenuFlota menuFlota;
    private final MostrarFlota mostrarFlota;
    
    MenuAgregarNave(Partida partida, MenuFlota menuFlota, Inventarios inventario){
        this.partida = partida;
        this.menuFlota = menuFlota;
        this.inventario = inventario;
        this.mostrarFlota = new MostrarFlota(partida.getJugador().getFlota());
    }
    
    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Agregar nave en flota");
        imprimirBordeDeMenu();
        inventario.mostraInventarioNaves();
        imprimirBordeDeMenu();
        mostrarFlota.mostrarFlota();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Guardar y volver al menu anterior.");
        imprimirBordeDeMenu();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
    }

  @Override
    public void ejecutarOpcion(int opcion) {

        int cantidadNavesInventario = partida.getJugador().getInventarioNaves().getCantidadArreglo();

        if(opcion == 0){
            limpiarPantalla();
            menuFlota.mostrarInformacion();

        } else if(opcion > 0 && opcion <= cantidadNavesInventario){
            limpiarPantalla();

            Nave naveObtenida = partida.getJugador().getInventarioNaves().eliminarNave(opcion);

            boolean agregada = partida.getJugador().getFlota().agregarNave(naveObtenida);

            if(!agregada){
                partida.getJugador().getInventarioNaves().agregarNavesInventario(naveObtenida);
            }

            mostrarDatos(naveObtenida, agregada);

        } else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }
    
    private void mostrarDatos(Nave naveObtenida, boolean agregada){
    
        imprimirBordeDeMenu();

        if(agregada){
            String linea = "La nave " + naveObtenida.getNombreDeNave() + " fue agregada a la flota";
            imprimirLineaDeTexto(linea);
        } else {
            imprimirLineaDeTexto("La nave necesita piloto y al menos un componente");
        }

        imprimirBordeDeMenu();
        mostrarInformacion();
    }

}

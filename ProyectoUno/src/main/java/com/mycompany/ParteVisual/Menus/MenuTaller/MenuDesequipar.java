/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Inventarios.InventarioNave;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Inventarios.MostrarNave;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuDesequipar extends MenuBase {
    
    private final Partida partida;
    private Nave nave;
    private final Inventarios inventario;
    private final MostrarNave mostrarNave;
    private final MenuTaller menuTaller;
    
    public MenuDesequipar (Partida partida, Inventarios inventario, MenuTaller menuTaller){
        this.partida = partida;
        this.inventario = inventario;
        this.nave = null;
        this.mostrarNave = new MostrarNave();
        this.menuTaller = menuTaller;
    }
    
    public void obtenerNave(Nave naveRecibida){
        nave = naveRecibida;
    }

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Desequipar componentes");
        imprimirBordeDeMenu();
        mostrarNave.visualizarEspacionNave(nave);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0: Guardar cambios y volver al menu anterior");
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int cantidadComponentesAgregados = nave.getComponentesInventario();
        
        if(opcion == 0){
            limpiarPantalla();
            partida.getJugador().getInventarioNaves().agregarNavesInventario(nave);
            menuTaller.mostrarInformacion();
        }
        
        if(opcion > 0 && opcion <= cantidadComponentesAgregados){
            limpiarPantalla();
            guardarCambios(opcion);
            mostrarInformacion();
        } else{
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }
    
    private void guardarCambios(int opcion){
        ComponenteDeNave componenteEliminado = nave.eliminarComponente(opcion);
        String linea = "Se elimino " + componenteEliminado.getNombreComponente() + " y se envio al inventario";
        
        partida.getJugador().getInventarioComponentes().agregarComponente(componenteEliminado);
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(linea);
        imprimirBordeDeMenu();
        
    }
}

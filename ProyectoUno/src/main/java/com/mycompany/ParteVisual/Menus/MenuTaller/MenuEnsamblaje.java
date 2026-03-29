/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuTaller;

import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Controladores.ControladoresFlota.EnsambladorDeNaves;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Inventarios.Inventarios;
import com.mycompany.ParteVisual.Inventarios.MostrarNave;
import com.mycompany.ParteVisual.Menus.MenuModelo.MenuBase;

/**
 *
 * @author Kenny
 */
public class MenuEnsamblaje extends MenuBase{
    
    private final Partida partida;
    private final Inventarios inventario;
    private final MostrarNave verNave;
    private Nave nave;
    private final MenuTaller menuTaller;
    private final EnsambladorDeNaves ensamblarNaves;
    private boolean componenteValido;
    
    public MenuEnsamblaje (Partida partida, Inventarios inventario, MenuTaller menuTaller){
        this.partida = partida;
        this.inventario = inventario;
        this.verNave = new MostrarNave();
        this.nave = null;
        this.menuTaller = menuTaller;
        this.ensamblarNaves = new EnsambladorDeNaves();
        this.componenteValido = false;
    }
    
    

    @Override
    public void mostrarInformacion() {
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Menu de ensamblaje");
        imprimirBordeDeMenu();
        inventario.mostrarComponentes();
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("0. Guardar y regresar al menu");
        mostrarDatosNave();
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        int cantidadComponentes = partida.getJugador().getInventarioComponentes().getCantidadDeComponentes();
        
        if(opcion == 0){
            limpiarPantalla();
            partida.getJugador().getInventarioNaves().agregarNavesInventario(nave);
            menuTaller.mostrarInformacion();
        } else if(opcion > 0 && opcion <= cantidadComponentes){
            
            recorrerOpciones(opcion); 
        }      else {
            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
            imprimirBordeDeMenu();
            mostrarInformacion();
        }
    }
    
    private void recorrerOpciones(int opcion){
        
        try {

            ComponenteDeNave componente = partida.getJugador()
                .getInventarioComponentes()
                .eliminarComponente(opcion);

            for (int i = 0; i < nave.getComponentesDeNave().length; i++) {

                if(nave.getComponentesDeNave()[i] == null){

                    componenteValido = ensamblarNaves.agregarComponente(nave, componente);

                    limpiarPantalla();
                    mostrarDatosDeEnsamble(componente);
                    mostrarInformacion();

                }
            }
            limpiarPantalla();
            imprimirLineaDeTexto("No hay espacio en la nave");
            partida.getJugador().getInventarioComponentes().agregarComponente(componente);
            mostrarInformacion();
            

        } catch (IllegalArgumentException e) {

            limpiarPantalla();
            imprimirBordeDeMenu();
            imprimirLineaDeTexto(e.getMessage());
            imprimirBordeDeMenu();
            mostrarInformacion();

    }
    }
    
    public void obtenerNave(Nave naveObtenida){
        nave = naveObtenida;
    }
    
    
    public void mostrarDatosNave(){
        String linea =nave.getNombreDeNave() + " Tipo: " + nave.getTipoDeNave()  +
                " Hp: "+ String.valueOf(nave.getPuntosDeVida() + " Ep: " + String.valueOf(nave.getPuntosDeEnergia())) +
                " SHP: " + String.valueOf(nave.getPuntosDeEscudo());
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nave en taller: ");
        imprimirLineaDeTexto(linea);
        verNave.visualizarEspacionNave(nave);
        
        imprimirBordeDeMenu();
          System.out.print("Elija un componente a colocar: ");
        validarOpcion();
    }
    
    private void mostrarDatosDeEnsamble(ComponenteDeNave componente){
        
        imprimirBordeDeMenu();
        if(componenteValido){
            String linea = "Has agregado el componente " + componente.getNombreComponente() + " a tu nave.";
            imprimirLineaDeTexto(linea);
        } else {
            imprimirLineaDeTexto("El componente no es compatible");
            partida.getJugador().getInventarioComponentes().agregarComponente(componente);
        }
        
        imprimirBordeDeMenu();
        
    }
}

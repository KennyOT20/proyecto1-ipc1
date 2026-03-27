/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuCompraDeComponentes;

import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeArmas;
import com.mycompany.ParteLogica.Componentes.Armas.Arma;
import com.mycompany.ParteLogica.Generadores.GeneradorDeComponentesNave.GeneradorDeArmas;
import com.mycompany.ParteLogica.Partida.Partida;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenuCompraVenta.MenuCompraVenta;
import com.mycompany.ParteVisual.Menus.MenuBaseEspacial.MenusDeTienda.MenusDeCompra.MenuOpcionesCompra;

/**
 *
 * @author Kenny
 */
public class MenuArmas extends MenuCompraVenta{

    private final ArregloDeArmas arregloArmas;
    private final GeneradorDeArmas crearArmas;
    private boolean compraValida;

    public MenuArmas(MenuOpcionesCompra menuOpciones, Partida partida) {
        super(menuOpciones, partida);
        this.arregloArmas = new ArregloDeArmas();
        this.crearArmas = new GeneradorDeArmas();
        this.compraValida = false;
        
        arregloArmas.crearArreglo();
    }
    
    
    
    @Override
    public void mostrarInformacion() {
        String cr = "CR: " + getPartida().getJugador().getCreditosGalacticos();
        
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Tienda de armas");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto(cr);
        imprimirBordeDeMenu();
        mostrarOpciones();
        System.out.print("Ingrese una opcion: ");
        validarOpcion();
        
    }

    @Override
    public void ejecutarOpcion(int opcion) {
        
        Arma armaComprada;
        
        switch(opcion){
            case 1:
                armaComprada = crearArmas.crearCampoDeMinas();
                compraValida = getTienda().validarCompraComponentes(armaComprada);
                limpiarPantalla();
                mostrarDatosCompra(armaComprada);
               break;
            case 2 :
                armaComprada = crearArmas.crearCañonDeLones();
                compraValida = getTienda().validarCompraComponentes(armaComprada);
                limpiarPantalla();
                mostrarDatosCompra(armaComprada);
                break;
            case 3:
                armaComprada = crearArmas.crearLanzaTorpedos();
                compraValida = getTienda().validarCompraComponentes(armaComprada);
                limpiarPantalla();
                mostrarDatosCompra(armaComprada);
                break;
            case 4:
                armaComprada = crearArmas.crearLaserDePulsos();
                compraValida = getTienda().validarCompraComponentes(armaComprada);
                limpiarPantalla();
                mostrarDatosCompra(armaComprada);
                break;
            case 5:
                armaComprada = crearArmas.crearMisilTeledirigido();
                compraValida = getTienda().validarCompraComponentes(armaComprada);
                limpiarPantalla();
                mostrarDatosCompra(armaComprada);
                break;
            case 6: 
                armaComprada = crearArmas.crearRayoDeParticulas();
                compraValida = getTienda().validarCompraComponentes(armaComprada);
                limpiarPantalla();
                mostrarDatosCompra(armaComprada);
                break;
            case 7:
                limpiarPantalla();
                getMenuOpciones().mostrarInformacion();
                break;
            default: 
                imprimirBordeDeMenu();
                imprimirLineaDeTexto("Opcion no valida, intente de nuevo");
                mostrarInformacion();
                break;
                
        }
    }

    @Override
   public void mostrarOpciones() {
        
        int cantidadArmas = arregloArmas.getArregloDeComponentes().length;

        imprimirLineaDeTexto("Arma                   Peso            Precio        Daño max");

        for (int i = 0; i < cantidadArmas; i++) {

            Arma nuevoArma = (Arma) arregloArmas.getArregloDeComponentes()[i];

            String nombreArma = arregloArmas.getArregloDeComponentes()[i].getNombreComponente();
            String pesoArma = arregloArmas.getArregloDeComponentes()[i].getPesoComponente();
            String precioArma = String.valueOf(arregloArmas.getArregloDeComponentes()[i].getPrecioComponente());
            String daño = String.valueOf(nuevoArma.getDañoDeArma());

            while(nombreArma.length() < 20){
                nombreArma += " ";
            }

            while(pesoArma.length() < 15){
                pesoArma += " ";
            }

            while(precioArma.length() < 12){
                precioArma += " ";
            }

            while(daño.length() < 10){
                daño += " ";
            }

            String lineaCompleta =   (i+1) + ". " +  nombreArma +  pesoArma + precioArma + daño;

            imprimirLineaDeTexto(lineaCompleta);
        }
        
        imprimirLineaDeTexto("");
        imprimirLineaDeTexto("7. Volver al menu de compras");
        imprimirBordeDeMenu();
    }


    private void mostrarDatosCompra(Arma armaComprada){
        String nombreDeArma = armaComprada.getNombreComponente();
        String precioArma = String.valueOf(armaComprada.getPrecioComponente());
        String lineaDeTexto ="Felicidades has comprado el arma " + nombreDeArma + " por " + precioArma + " CR.";
        
        imprimirBordeDeMenu();
        
        if(compraValida){
            imprimirLineaDeTexto(lineaDeTexto);
        } else if (compraValida == false){
            imprimirLineaDeTexto("CR insuficiente.");
         }
        
        imprimirBordeDeMenu();
        mostrarInformacion();
    }
    
    
}

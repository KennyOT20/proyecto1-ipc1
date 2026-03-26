/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Inventarios;

import com.mycompany.ParteLogica.Inventarios.InventarioComponente;
import com.mycompany.ParteLogica.Inventarios.InventarioNave;
import com.mycompany.ParteLogica.Inventarios.InventarioObjetos;
import com.mycompany.ParteLogica.Inventarios.InventarioPilotos;
import com.mycompany.ParteVisual.Bordes.Bordes;

/**
 *
 * @author Kenny
 */
public class Inventarios extends Bordes {

    private final InventarioComponente inventarioComponente;
    private final InventarioNave inventarioNave;
    private final InventarioObjetos inventarioObjetos;
    private final InventarioPilotos inventarioPilotos;

    public Inventarios(InventarioComponente inventarioComponente, InventarioNave inventarioNave,
            InventarioObjetos inventarioObjetos, InventarioPilotos inventarioPilotos) {
        this.inventarioComponente = inventarioComponente;
        this.inventarioNave = inventarioNave;
        this.inventarioObjetos = inventarioObjetos;
        this.inventarioPilotos = inventarioPilotos;
    }

    public void mostraInventarioNaves() {

        int cantidadDeNaves = inventarioNave.getInventarioNave().length;
        boolean vacio = true;

        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Naves en inventario");
        imprimirBordeDeMenu();

        for (int i = 0; i < cantidadDeNaves; i++) {

            if (inventarioNave.getInventarioNave()[i] != null) {

                vacio = false;

                String nombreDeNave = inventarioNave.getInventarioNave()[i].getNombreDeNave();
                String hpNave = String.valueOf(inventarioNave.getInventarioNave()[i].getPuntosDeVida());

                String nombreFormateado = "";
                int c = 0;

                while (c < nombreDeNave.length() && c < 20) {
                    nombreFormateado += nombreDeNave.charAt(c);
                    c++;
                }

                while (nombreFormateado.length() < 20) {
                    nombreFormateado += " ";
                }

                String linea = (i + 1) + ". " + nombreFormateado + "Hp: " + hpNave;

                imprimirLineaDeTexto(linea);
            }
        }

        if (vacio) {
            imprimirLineaDeTexto("Inventario vacio.");
        }

        imprimirBordeDeMenu();
    }

    public void mostrarPilotos() {

        int cantidadPilotos = inventarioPilotos.getInventarioPiloto().length;
        boolean vacio = true;

        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Pilotos en inventario");
        imprimirBordeDeMenu();

        for (int i = 0; i < cantidadPilotos; i++) {

            if (inventarioPilotos.getInventarioPiloto()[i] != null) {

                vacio = false;

                String nombrePiloto = inventarioPilotos.getInventarioPiloto()[i].getNombrePiloto();

                imprimirLineaDeTexto((i + 1) + ". " + nombrePiloto);
            }
        }

        if (vacio) {
            imprimirLineaDeTexto("Inventario vacio");
        }

        imprimirBordeDeMenu();
    }

    public void mostrarComponentes() {

        int cantidadDeComponentes = inventarioComponente.getInventarioComponentes().length;
        boolean vacio = true;

        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Inventario de componentes");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nombre               Tipo               Peso               Consumo de EP");
        imprimirBordeDeMenu();

        for (int i = 0; i < cantidadDeComponentes; i++) {

            if (inventarioComponente.getInventarioComponentes()[i] != null) {

                vacio = false;

                String nombre = inventarioComponente.getInventarioComponentes()[i].getNombreComponente();
                String tipo = inventarioComponente.getInventarioComponentes()[i].getTipoDeComponente();
                String peso = inventarioComponente.getInventarioComponentes()[i].getPesoComponente();
                String consumo = String.valueOf(
                        inventarioComponente.getInventarioComponentes()[i].getConsumoDeEnergia()
                );

                String nombreComponente = "";
                int contador = 0;

                while (contador < nombre.length() && contador < 22) {
                    nombreComponente += nombre.charAt(contador);
                    contador++;
                }

                while (nombreComponente.length() < 22) {
                    nombreComponente += " ";
                }

                while (tipo.length() < 20) {
                    tipo += " ";
                }

                while (peso.length() < 18) {
                    peso += " ";
                }

                while (consumo.length() < 10) {
                    consumo += " ";
                }

                String linea = (i +1) + ". " + nombreComponente + tipo + peso + consumo;

                imprimirLineaDeTexto(linea);
            }
        }

        if (vacio) {
            imprimirLineaDeTexto("Inventario vacio");
        }

        imprimirBordeDeMenu();
    }

    public void mostrarObjetos() {

        int cantidadObjetos = inventarioObjetos.getInventarioDeObjetos().length;
        boolean vacio = true;

        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Inventario de objetos");
        imprimirBordeDeMenu();
        imprimirLineaDeTexto("Nombre               ");

        for (int i = 0; i < cantidadObjetos; i++) {

            if (inventarioObjetos.getInventarioDeObjetos()[i] != null) {

                vacio = false;

                String nombre = inventarioObjetos.getInventarioDeObjetos()[i].getNombreDeObjeto();

                String nombreObjeto = "";
                int contador = 0;

                while (contador < nombre.length() && contador < 22) {
                    nombreObjeto += nombre.charAt(contador);
                    contador++;
                }

                while (nombreObjeto.length() < 22) {
                    nombreObjeto += " ";
                }

                String linea = (i+1) + ". " + nombreObjeto;

                imprimirLineaDeTexto(linea);
            }
        }

        if (vacio) {
            imprimirLineaDeTexto("Inventario vacio");
        }

        imprimirBordeDeMenu();
    }
}

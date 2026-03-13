/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mapas.Mapas;

/**
 *
 * @author Kenny
 */
public class MapaDeEstrella extends MapaBase {

    public MapaDeEstrella(int cantidadFilas, int cantidadColumnas) {
        super(cantidadFilas, cantidadColumnas);
    }

    @Override
    public void colocarCasillasEnArreglo() {
        getSimbolo()[0] = getGeneradorCasillas().crearCasillaBase();
        getSimbolo()[1] = getGeneradorCasillas().crearCasillaCombate();
        getSimbolo()[2] = getGeneradorCasillas().crearCasillaEstacion();
        getSimbolo()[3] = getGeneradorCasillas().crearCasillaNormal();
        getSimbolo()[4] = getGeneradorCasillas().crearCasillaWarp();
    }

}

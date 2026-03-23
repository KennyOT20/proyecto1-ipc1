/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Bordes;

/**
 *
 * @author Kenny
 */
public class Bordes {
    
    private final int CANTIDAD_DE_ANCHO = 95;
    
    protected void imprimirBordeDeMenu(){
        for (int i = 0; i < CANTIDAD_DE_ANCHO; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    protected void imprimirLineaDeTexto(String textoIngresado){
        System.out.print("||");
        System.out.print(textoIngresado);
        
        int anchoConTexto = CANTIDAD_DE_ANCHO - 4 - textoIngresado.length();
        
        for (int i = 0; i < anchoConTexto; i++) {
            System.out.print(" ");
        }
        
        System.out.println("||");
    }
    
    
}

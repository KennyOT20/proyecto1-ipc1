/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Menus.MenuBase;

import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public abstract class MenuBase{
    
    private final Scanner scanner;
    private final int CANTIDAD_DE_ANCHO = 95;
    
    public MenuBase(){
        this.scanner = new Scanner(System.in);
    }
    
    public abstract void mostrarInformacion();
    public abstract void ejecutarOpcion(int opcion);
    
    
    
    public void validarOpcion(){
        
        boolean opcionCorrecta = false;
        
        
            while(opcionCorrecta == false){
        try{    
                int opcionUsuario = Integer.valueOf(scanner.nextLine());
                ejecutarOpcion(opcionUsuario);
                opcionCorrecta = true;
        } catch(NumberFormatException e){
            scanner.nextLine();
            limpiarPantalla();
            System.out.println("Opcion no valida, intente de nuevo");
            mostrarInformacion();
        }
            }
            
    }
    
    protected void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
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

    public Scanner getScanner() {
        return scanner;
    }
    
    
    
}

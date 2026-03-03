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
    
    private final Scanner scanner = new Scanner(System.in);
    
    public abstract void mostrarInformacion();
    public abstract void ejecutarOpcion(int opcion);
    
    
    public void validarOpcion(){
        
        boolean opcionCorrecta = false;
        
        try{
            while(opcionCorrecta == false){
                int opcionUsuario = Integer.valueOf(scanner.nextLine());
                ejecutarOpcion(opcionUsuario);
                opcionCorrecta = true;
                
            }
        } catch(NumberFormatException e){
            scanner.nextLine();
            limpiarPantalla();
            System.out.println("Opcion no valida, intente de nuevo");
            mostrarInformacion();
        }
       
    }
    
    public void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}

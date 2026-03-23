/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteVisual.Menus.MenuBase;

import com.mycompany.ParteVisual.Bordes.Bordes;
import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public abstract class MenuBase extends Bordes{
    
    private final Scanner scanner;
    
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
   

    public Scanner getScanner() {
        return scanner;
    }
    
    
    
}

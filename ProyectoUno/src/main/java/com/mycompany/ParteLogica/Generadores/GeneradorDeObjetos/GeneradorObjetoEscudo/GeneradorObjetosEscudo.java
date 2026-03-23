/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Generadores.GeneradorDeObjetos.GeneradorObjetoEscudo;

import com.mycompany.ParteLogica.Objetos.ObjetosDeEscudo.EscudoDeHierro;
import com.mycompany.ParteLogica.Objetos.ObjetosDeEscudo.SuperEscudo;
import com.mycompany.ParteLogica.Objetos.ObjetosDeEscudo.EscudoRegenerativo;
import com.mycompany.ParteLogica.Objetos.ObjetosDeEscudo.ObjetoDeEscudo;

/**
 *
 * @author Kenny
 */
public class GeneradorObjetosEscudo {
    
    /**
     * Metodos encargados de ir creando los objetos de escudo, reciben como parametro:
     * 
     * String nombreDeObjeto, int precioDeObjeto
     * @return 
     */
    public ObjetoDeEscudo crearEscudoDeHierro(){
        return new EscudoDeHierro("Cupula de hierro", 600);
    }
    
    public ObjetoDeEscudo crearEscudoRegenerativo(){
        return new EscudoRegenerativo("Escudo Regenerativo", 4000);
    }
    
    public ObjetoDeEscudo crearSuperEscudo(){
        return new SuperEscudo("SuperEscudo", 700);
    }
}

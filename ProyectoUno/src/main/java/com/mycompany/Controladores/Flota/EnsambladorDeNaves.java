/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controladores.Flota;

import com.mycompany.Arreglos.ArreglosDeComponentes.ArregloDeArmas;
import com.mycompany.Arreglos.ArreglosDeComponentes.ArregloDeComponentes;
import com.mycompany.Arreglos.ArreglosDeComponentes.ArregloDeEscudos;
import com.mycompany.Arreglos.ArreglosDeComponentes.ArregloDePropulsores;
import com.mycompany.Arreglos.ArreglosDeComponentes.ArregloDeSistemas;
import com.mycompany.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.Naves.Nave;



/**
 *
 * @author Kenny
 */
public class EnsambladorDeNaves {

    private final GeneradorDeNaves generarNave;
    private final ArregloDeArmas armas;
    private final ArregloDePropulsores propulsores;
    private final ArregloDeSistemas sistemas; 
    private final ArregloDeEscudos escudos; 
    private final ControladorRandom random;
    
    public EnsambladorDeNaves(){
        this.generarNave = new GeneradorDeNaves();
        this.armas = new ArregloDeArmas();
        this.propulsores = new ArregloDePropulsores();
        this.sistemas = new ArregloDeSistemas();
        this.escudos = new ArregloDeEscudos();
        this.random = new ControladorRandom();
    }
    
    /**
     * Metodo encargado de obtener una nave aleatoria.
     * @return mediante un random retorna una nave aleatoria.
     */
    public Nave obtenerNaveRandom(){
        
        int nave = random.calcularNumeroAleatorios(1, 5);
        
        switch(nave){
            case 1 :
                return generarNave.crearAcorazado();
            case 2:
                return generarNave.crearCaza();
            case 3: 
                return generarNave.crearFragata();
            case 4 : 
                return generarNave.crearNaveApoyo();
            default :
                return null;
        }
    }
      
    /**
     * Metodo encargado de agregar componentes random segun el tipo de la nave;
     * pesado, ligero o normal. 
     * @param naveElegida recibe la nave que se obtuvo en el metodo {@link #obtenerNaveRandom( ) }
     */
    public void agregarComponente(Nave naveElegida){
        for (int i = 0; i < naveElegida.getComponentesDeNave().length ; i++) {
           if(naveElegida.getTipoDeNave() ){
               
           }
        }
    }
    
    private ComponenteDeNave obtenerComponente(ArregloDeComponentes arreglo){
        int indiceDeArreglo = random.calcularNumeroAleatorios(0, arreglo.getArregloDeComponentes().length);
        return arreglo.getArregloDeComponentes()[indiceDeArreglo];
    }
    
    public Nave naveEnsmablada(){
        Nave naveObtenida = obtenerNaveRandom();
        agregarComponente(naveObtenida);
        return naveObtenida;
    }
    

}

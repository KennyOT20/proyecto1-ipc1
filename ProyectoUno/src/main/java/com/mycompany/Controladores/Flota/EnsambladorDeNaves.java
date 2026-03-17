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

    private final ComponenteDeNave[] arregloComponentes;
    private final GeneradorDeNaves generarNave;
    private final ArregloDeArmas armas;
    private final ArregloDePropulsores propulsores;
    private final ArregloDeSistemas sistemas; 
    private final ArregloDeEscudos escudos; 
    private final ControladorRandom random;
    
    public EnsambladorDeNaves(){
        this.arregloComponentes = new ComponenteDeNave[4];
        this.generarNave = new GeneradorDeNaves();
        this.armas = new ArregloDeArmas();
        this.propulsores = new ArregloDePropulsores();
        this.sistemas = new ArregloDeSistemas();
        this.escudos = new ArregloDeEscudos();
        this.random = new ControladorRandom();
        
        armas.crearArreglo();
        propulsores.crearArreglo();
        sistemas.crearArreglo();
        escudos.crearArreglo();
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
     * Metodo encargado de obtener un componente del arregloq ue se le envia como parametro
     * @param arreglo, es un parametro que recibe un tipo de arreglo de algun componente, como un arma,
     * escudo, sistema de apoyo o un propulsor
     * @return un componente del arreglo que se le envio como parametro
     */
    private ComponenteDeNave obtenerComponente(ArregloDeComponentes arreglo){
        int indiceDeArreglo = random.calcularNumeroAleatorios(0, arreglo.getArregloDeComponentes().length);
        return arreglo.getArregloDeComponentes()[indiceDeArreglo];
    }

    /**
     * Metodo encargado de obtener un componente aleatorio, ya puede ser un arma, propulsor, 
     * sistema de apoyo o escudo. Obtiene uno de todas las oportunidades posibles de todos los 
     * componentes
     * @return 
     */
    private ComponenteDeNave obtenerComponenteAleatorio(){
        llenarArregloComponentes();
        int indice = random.calcularNumeroAleatorios(0, arregloComponentes.length);
        return arregloComponentes[indice];
    }
    
    /**
     * Metodo encargado de llenar un arreglo de componentes por indice.
     * Cada indice recibe un componente aleatorio de un tipo arreglo de componentes diferentes 
     * para cada indice.
     */
    public void llenarArregloComponentes(){
        arregloComponentes[0] = obtenerComponente(armas);
        arregloComponentes[1] = obtenerComponente(escudos);
        arregloComponentes[2] = obtenerComponente(propulsores);
        arregloComponentes[3] = obtenerComponente(sistemas); 
    }
    
       /**
     * Metodo encargado de agregar componentes random segun el tipo de la nave;
     * pesado, ligero o normal. 
     * @param naveElegida recibe la nave que se obtuvo en el metodo {@link #obtenerNaveRandom( ) }
     */
    public void agregarComponente(Nave naveElegida){
        for (int i = 0; i < naveElegida.getComponentesDeNave().length ; i++) {
           ComponenteDeNave componente = obtenerComponenteAleatorio();
           
          switch(naveElegida.getNombreDeNave()){
              case "Caza":
                  colocarComponentesCaza(naveElegida,componente );
                  break;
              case "Nave de apoyo" :
                  colocarComponentesNaveApoyo(naveElegida, componente);
                  break;
              case "Fragata" :;
                  colocarComponentesFragata(naveElegida, componente);
                  break;
              case "Acorazado":
                  colocarComponentesAcorazado(naveElegida, componente);
                  break;
          }
        }
    }
    
    private void colocarComponentesCaza(Nave naveObtenida, ComponenteDeNave componente){
        if(componente.getPesoComponente().equalsIgnoreCase("Ligero")){
            naveObtenida.agregarComponente(componente);
        } else{
            naveObtenida.agregarComponente(null);
        }  
    }
    
    private void colocarComponentesFragata(Nave naveObtenida, ComponenteDeNave componente){
        if(componente.getPesoComponente().equalsIgnoreCase("Ligero") || componente.getPesoComponente().equalsIgnoreCase("Normal")){
            naveObtenida.agregarComponente(componente);
        } else{
            naveObtenida.agregarComponente(null);
        }
    }
    
    private void colocarComponentesNaveApoyo(Nave naveObtenida, ComponenteDeNave componente){
        if(componente.getTipoDeComponente().equalsIgnoreCase("Arma")){
            naveObtenida.agregarComponente(null);
        } else if(componente.getPesoComponente().equalsIgnoreCase("Ligero") || componente.getPesoComponente().equalsIgnoreCase("Normal")){
            naveObtenida.agregarComponente(componente);
        } else {
            naveObtenida.agregarComponente(null);
        }
    }
    
    private void colocarComponentesAcorazado(Nave naveObtenida, ComponenteDeNave componente){
        naveObtenida.agregarComponente(componente);
    }
    
    /**
     * Metodo encargado de retornar una nave ya completa y ensamblada con todos sus componentes aleatorios
     * y segun el tipo de nave y de componentes
     * @return la nave armada completa.
     */
    public Nave naveEnsamblada(){
        Nave naveObtenida = obtenerNaveRandom();
        agregarComponente(naveObtenida);
        return naveObtenida;
    }
    
}

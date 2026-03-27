/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Controladores.ControladoresFlota;

import com.mycompany.ParteLogica.Arreglos.ArregloDePilotos.ArregloDePilotos;
import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeArmas;
import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeComponentes;
import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeEscudos;
import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDePropulsores;
import com.mycompany.ParteLogica.Arreglos.ArreglosDeComponentes.ArregloDeSistemas;
import com.mycompany.ParteLogica.Componentes.ComponentesDeNaves.ComponenteDeNave;
import com.mycompany.ParteLogica.Controladores.ControladorRandom.ControladorRandom;
import com.mycompany.ParteLogica.Generadores.GeneradorDeNaves.GeneradorDeNaves;
import com.mycompany.ParteLogica.Naves.Nave;
import com.mycompany.ParteLogica.Pilotos.Piloto;



/**
 *
 * @author Kenny
 */
public class EnsambladorDeNaves {

    private final ComponenteDeNave[] arregloComponentes;
    private final GeneradorDeNaves generarNave;
    private final ArregloDePilotos pilotos;
    private final ArregloDeArmas armas;
    private final ArregloDePropulsores propulsores;
    private final ArregloDeSistemas sistemas; 
    private final ArregloDeEscudos escudos; 
    private final ControladorRandom random;
    
    public EnsambladorDeNaves(){
        this.arregloComponentes = new ComponenteDeNave[4];
        this.pilotos = new ArregloDePilotos();
        this.generarNave = new GeneradorDeNaves();
        this.armas = new ArregloDeArmas();
        this.propulsores = new ArregloDePropulsores();
        this.sistemas = new ArregloDeSistemas();
        this.escudos = new ArregloDeEscudos();
        this.random = new ControladorRandom();
        
        pilotos.generarArregloPiloto();
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
     * @param componenteIngresado
     */
    public boolean agregarComponente(Nave naveElegida, ComponenteDeNave componenteIngresado){
        boolean componenteValido;
        
          switch(naveElegida.getNombreDeNave()){
              case "Caza":
                  componenteValido = colocarComponentesCaza(naveElegida,componenteIngresado );
                  return componenteValido;
              case "Nave de apoyo" :
                  componenteValido = colocarComponentesCaza(naveElegida,componenteIngresado );
                  return componenteValido;
              case "Fragata" :;
                  componenteValido = colocarComponentesCaza(naveElegida,componenteIngresado );
                  return componenteValido;
              case "Acorazado":
                 componenteValido = colocarComponentesCaza(naveElegida,componenteIngresado );
                  return componenteValido;
          }
        
        return false;
    }
    
    private boolean colocarComponentesCaza(Nave naveObtenida, ComponenteDeNave componente){
        if(componente.getPesoComponente().equalsIgnoreCase("Ligero")){
            naveObtenida.agregarComponente(componente);
            return true;
        } else{
            naveObtenida.agregarComponente(null);
            return false;
        }  
    }
    
    private boolean colocarComponentesFragata(Nave naveObtenida, ComponenteDeNave componente){
        if(componente.getPesoComponente().equalsIgnoreCase("Ligero") || componente.getPesoComponente().equalsIgnoreCase("Normal")){
            naveObtenida.agregarComponente(componente);
            return true;
            
        } else{
            naveObtenida.agregarComponente(null);
        } return false;
    }
    
    private boolean colocarComponentesNaveApoyo(Nave naveObtenida, ComponenteDeNave componente){
        if(componente.getTipoDeComponente().equalsIgnoreCase("Arma")){
            naveObtenida.agregarComponente(null);
            return false;
        } else if(componente.getPesoComponente().equalsIgnoreCase("Ligero") || componente.getPesoComponente().equalsIgnoreCase("Normal")){
            naveObtenida.agregarComponente(componente);
            return true;
        } else {
            naveObtenida.agregarComponente(null);
            return false;
        }
    }
    
    private boolean colocarComponentesAcorazado(Nave naveObtenida, ComponenteDeNave componente){
        naveObtenida.agregarComponente(componente);
        return true;
    }
    
    public Piloto obtenerPilotoRandom(){
        int indicePiloto = random.calcularNumeroAleatorios(0, 3);
        return pilotos.getArregloDePilotos()[indicePiloto];
    }
    
    public void colocarPiloto(Nave nave, Piloto piloto){
        boolean pilotoColocado;
        nave.
    }
    
    /**
     * Metodo encargado de retornar una nave ya completa y ensamblada con todos sus componentes aleatorios
     * y segun el tipo de nave y de componentes
     * @return la nave armada completa.
     */
    public Nave naveEnsamblada(){
        Nave naveObtenida = obtenerNaveRandom();
        Piloto pilotoObtenido = obtenerPilotoRandom();
        ComponenteDeNave  componenteObtenido = obtenerComponenteAleatorio();
        naveObtenida.agregarPiloto(pilotoObtenido);
        agregarComponente(naveObtenida, componenteObtenido);
        return naveObtenida;
    }
    
    
}

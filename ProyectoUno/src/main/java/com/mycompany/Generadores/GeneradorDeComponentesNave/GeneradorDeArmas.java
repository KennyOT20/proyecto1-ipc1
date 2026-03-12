/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Generadores.GeneradorDeComponentesNave;

import com.mycompany.Componentes.Armas.Arma;
import com.mycompany.Componentes.Armas.CampoDeMinas;
import com.mycompany.Componentes.Armas.CañonDeLones;
import com.mycompany.Componentes.Armas.LanzaTorpedos;
import com.mycompany.Componentes.Armas.LaserDePulso;
import com.mycompany.Componentes.Armas.MisilTeledirigido;
import com.mycompany.Componentes.Armas.RayoDeParticulas;
import java.util.Random;

/**
 *
 * @author Kenny
 */
public class GeneradorDeArmas {
    
    private final Random random;
    
    public GeneradorDeArmas(){
        this.random = new Random();
    }
    
    /**
     * Metodos encargados para ir creando las armas y sus atributos, recibe como parametros lo siguiente:
     * int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma
     * @return objetos creados con los parametros dados
     */
    
    public Arma crearCampoDeMinas(){
        int dañoDeMinas = calcularDaño(50, 80);
        return new CampoDeMinas(40, " Normal", " Campo de Minas", dañoDeMinas );
    }
    
    public Arma crearCañonDeLones(){
        int dañoDeLones = calcularDaño(40, 70);
        return new CañonDeLones(25, "Normal", "Cañon de Lones", dañoDeLones);
    }
    
    public Arma crearLaserDePulsos(){
        int dañoLaser = calcularDaño(80, 120 );
        return new LaserDePulso(20, "Ligero", "Laser de pulso", dañoLaser);
    }
    
    public Arma crearLanzaTorpedos(){
        int dañoTorpedo = calcularDaño(250, 350);
        return new LanzaTorpedos(50, "Pesado", "Lanzatorpedos pesados", dañoTorpedo);
    }
    
    public Arma crearMisilTeledirigido(){
        int dañoMisil = calcularDaño(60, 100);
        return new MisilTeledirigido(30, "Normal", "Misil teledirigido", dañoMisil);
    }
    
    public Arma crearRayoDeParticulas(){
        int dañoDeRayo = calcularDaño(100, 180);
        return new RayoDeParticulas(35, "Pesado", "Rayo de particulas", dañoDeRayo);
    }
    
    private int calcularDaño(int valorMin, int valorMax){
        int dañoCalculado;
        return dañoCalculado = random.nextInt(valorMin, valorMax);
    }
    
}

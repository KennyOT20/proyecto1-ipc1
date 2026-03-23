/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ParteLogica.Generadores.GeneradorDeComponentesNave;

import com.mycompany.ParteLogica.Componentes.Armas.Arma;
import com.mycompany.ParteLogica.Componentes.Armas.CampoDeMinas;
import com.mycompany.ParteLogica.Componentes.Armas.CañonDeLones;
import com.mycompany.ParteLogica.Componentes.Armas.LanzaTorpedos;
import com.mycompany.ParteLogica.Componentes.Armas.LaserDePulso;
import com.mycompany.ParteLogica.Componentes.Armas.MisilTeledirigido;
import com.mycompany.ParteLogica.Componentes.Armas.RayoDeParticulas;
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
        return new CampoDeMinas(40, " Normal", " Campo de Minas", dañoDeMinas,0 );
    }
    
    public Arma crearCañonDeLones(){
        int dañoDeLones = calcularDaño(40, 70);
        return new CañonDeLones(25, "Normal", "Cañon de Lones", dañoDeLones,0);
    }
    
    public Arma crearLaserDePulsos(){
        int dañoLaser = calcularDaño(80, 120 );
        return new LaserDePulso(20, "Ligero", "Laser de pulso", dañoLaser, 0);
    }
    
    public Arma crearLanzaTorpedos(){
        int dañoTorpedo = calcularDaño(250, 350);
        return new LanzaTorpedos(50, "Pesado", "Lanzatorpedos pesados", dañoTorpedo, 0);
    }
    
    public Arma crearMisilTeledirigido(){
        int dañoMisil = calcularDaño(60, 100);
        return new MisilTeledirigido(30, "Normal", "Misil teledirigido", dañoMisil, 0);
    }
    
    public Arma crearRayoDeParticulas(){
        int dañoDeRayo = calcularDaño(100, 180);
        return new RayoDeParticulas(35, "Pesado", "Rayo de particulas", dañoDeRayo, 0);
    }
    
    private int calcularDaño(int valorMin, int valorMax){
        return random.nextInt(valorMin, valorMax);
    }
    
}

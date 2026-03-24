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


/**
 *
 * @author Kenny
 */
public class GeneradorDeArmas {
    
    /**
     * Metodos encargados para ir creando las armas y sus atributos, recibe como parametros lo siguiente:
     * int consumoDeEnergia, String pesoComponente, String nombreComponente, int dañoDeArma
     * @return objetos creados con los parametros dados
     */
    
    public Arma crearCampoDeMinas(){
        return new CampoDeMinas(40, "Normal", "Campo de Minas", 80, 800);
    }
    
    public Arma crearCañonDeLones(){
        return new CañonDeLones(25, "Normal", "Cañon de Lones", 70, 700);
    }
    
    public Arma crearLaserDePulsos(){
        return new LaserDePulso(20, "Ligero", "Laser de pulso", 120, 1200);
    }
    
    public Arma crearLanzaTorpedos(){
        return new LanzaTorpedos(50, "Pesado", "Lanzatorpedos", 350, 2000);
    }
    
    public Arma crearMisilTeledirigido(){
        return new MisilTeledirigido(30, "Normal", "Misil teledirigido", 100, 500);
    }
    
    public Arma crearRayoDeParticulas(){
        return new RayoDeParticulas(35, "Pesado", "Rayo de particulas", 180, 800);
    }
    
}

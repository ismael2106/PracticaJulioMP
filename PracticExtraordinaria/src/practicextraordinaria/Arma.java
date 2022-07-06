/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicextraordinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Arma {
    
    public String nombre;
    private int manos;
    private int modDefensa; 
    private int modAtaque; 
    
    private enum categoria{
        legendario, comun, raro, epico;
    };
    private categoria cat;
    
    private ArrayList<String> listaMateriales;
    
    public Arma(String nombre, int manos, String categ, ArrayList<String> listaMateriales, int modDefensa, int modAtaque) {
        this.nombre = nombre;
        this.manos = manos;
        this.modDefensa = modDefensa;
        this.modAtaque = modAtaque;
        
         if ("legendario".equals(categ)){
            cat = categoria.legendario;
        }
         if ("comun".equals(categ)){
            cat = categoria.comun;
        }
         if ("raro".equals(categ)){
            cat = categoria.raro;
        }
         if ("epico".equals(categ)){
            cat = categoria.epico;
        }
    }

    public categoria getCat() {
        return cat;
    }

    public int getModDefensa() {
        return modDefensa;
    }

    public int getModAtaque() {
        return modAtaque;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

}

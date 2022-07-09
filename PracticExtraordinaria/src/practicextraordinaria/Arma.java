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
public class Arma implements java.io.Serializable{
    
    public String nombre;
    private String manos;
    private String modDefensa; 
    private String modAtaque; 
    
    public enum categoria{
        legendario, comun, raro, epico;
    };
    public categoria cat;
    
    private String listaMateriales;
    
    public Arma(String nombre, String manos, String categ, String listaMateriales, String modAtaque, String modDefensa) {
        this.listaMateriales = listaMateriales;
        this.nombre = nombre;
        this.manos = manos;
        this.modDefensa = modDefensa;
        this.modAtaque = modAtaque;
        
        if ("legendario".equals(categ)){
            cat = categoria.legendario;
        }
        else if ("comun".equals(categ)){
            cat = categoria.comun;
        }
        else if ("raro".equals(categ)){
            cat = categoria.raro;
        }
        else if ("epico".equals(categ)){
            cat = categoria.epico;
        }
    }

    public categoria getCat() {
        return cat;
    }

    public String getModDefensa() {
        return modDefensa;
    }

    public String getModAtaque() {
        return modAtaque;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

}

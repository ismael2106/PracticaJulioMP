package practicextraordinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Armadura implements java.io.Serializable{
    public String nombre;
    private String listaMateriales;
    private String modDefensa;
    private String modAtaque; 
    
    public enum categoria{
        legendario, comun, raro, epico;
    };
    public categoria cat;
    
    public Armadura(String nombre, String categ, String listaMateriales, String modAtaque, String modDefensa) {
        this.nombre = nombre;
        this.listaMateriales = listaMateriales;
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


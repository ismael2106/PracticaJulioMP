package practicextraordinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Armadura {
    public String nombre;
    private ArrayList<String> listaMateriales;
    private int modDefensa;
    private int modAtaque; 
    
    private enum categoria{
        legendario, comun, raro, epico;
    };
    private categoria cat;
    
    public Armadura(String nombre, String categ, ArrayList<String> listaMateriales, int modAtaque, int modDefensa) {
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


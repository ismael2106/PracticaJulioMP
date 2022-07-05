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
    private String categoria;
    private ArrayList<String> listaMateriales;
    
    
    public Armadura(String nombre, String categ, ArrayList<String> listaMateriales) {
        this.nombre = nombre;
        this.categoria = categ;
        this.listaMateriales = listaMateriales;
    }

    public String getNombre() {
        return nombre;
    }
    
  }


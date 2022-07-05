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
    private String categoria;
    private ArrayList<String> listaMateriales;
    
    public Arma(String nombre, int manos, String categ, ArrayList<String> listaMateriales) {
        this.nombre = nombre;
        this.manos = manos;
        this.categoria = categ;
        this.listaMateriales = listaMateriales;
    }
    
    public String getNombre() {
        return nombre;
    }

}

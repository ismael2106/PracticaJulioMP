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
    
    private String nombre;
    private int manos;
    private String categoria;
    
    public Arma(String nombre, int manos, String categ) {
        this.nombre = nombre;
        this.manos = manos;
        categoria = categ;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getManos() {
        return manos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setManos(int manos) {
        this.manos = manos;
    }
    
    
    
}

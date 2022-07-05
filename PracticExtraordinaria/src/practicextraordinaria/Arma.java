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
    ArrayList conjuntoArmas2 = new ArrayList();
    
    public Arma(String nombre, int manos) {
        this.nombre = nombre;
        this.manos = manos;
    }
    
    
    public void insertarArmas() throws FileNotFoundException{
    
    File fichero = new File("FicherosMP/ficheroArmas.txt");
    Scanner sc = new Scanner(fichero);
    int cont = 0;
    
    System.out.println("ARMAS DISPONIBLES:");
    
    while (sc.hasNextLine()){
        String valor = sc.next();
        conjuntoArmas2.add(valor);
        cont++;
    }
    mostrarArmas();
    System.out.println("");
    }
    
    public void mostrarArmas(){
        for (int i = 0; i < conjuntoArmas2.size(); i++){
            System.out.println(i+"."+conjuntoArmas2.get(i));
        }
             
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

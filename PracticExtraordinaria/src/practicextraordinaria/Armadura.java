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
public class Armadura {
    ArrayList conjuntoArmaduras = new ArrayList();
    
public void insertarArmaduras() throws FileNotFoundException{
    
    File fichero = new File("FicherosMP/ficheroArmaduras.txt");
    Scanner sc = new Scanner(fichero);
    int cont = 0;
    
    System.out.println("ARMADURAS DISPONIBLES:");
    
    while (sc.hasNextLine()){
        String valor = sc.next();
        conjuntoArmaduras.add(valor);
        cont++;
        
    
    }
    mostrarArmaduras(); 
    System.out.println("");
    }
    
    public void mostrarArmaduras(){
        for (int i = 0; i < conjuntoArmaduras.size(); i++){
            System.out.println(i+"."+conjuntoArmaduras.get(i));
        }
             
    }
  }


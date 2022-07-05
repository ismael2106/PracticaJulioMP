/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicextraordinaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emmar
 */
class Equipo extends Operation {
    Scanner lectura = new Scanner(System.in);
    
    Armadura armadura = new Armadura();
    
    ArrayList listaArmas = new ArrayList<Arma>(4);
    ArrayList listaArmaduras = new ArrayList<Armadura>();
    
    
    
    
    public Equipo(Usuario usuario) {
        
        super(usuario);
        
    }

    public void setListaArmas(ArrayList listaArmas) {
        this.listaArmas = listaArmas;
    }

    public void setListaArmaduras(ArrayList listaArmaduras) {
        this.listaArmaduras = listaArmaduras;
    }
    
     public ArrayList getListaArmas() {
        return listaArmas;
    }

    public ArrayList getListaArmaduras() {
        return listaArmaduras;
    }
    
    public void verEquipo() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        
      
      listaArmas.get(1).
      arma.insertarArmas();
  
      Armadura armadura = new Armadura();
      armadura.insertarArmaduras();
      menuOferta();
    }
    
    public void insertarArmas() throws FileNotFoundException{
    
        File fichero = new File("FicherosMP/ficheroArmas.txt");
        Scanner sc = new Scanner(fichero);
        int cont = 0;


        while (sc.hasNextLine()){
            String nombre = sc.next();
            int manos = sc.nextInt();
            String categoria = sc.next();
            Arma arma = new Arma(nombre,manos,categoria);
            listaArmas.add(arma);
            cont++;
        }
        mostrarArmas();
        System.out.println("");
    }
    
     public void mostrarArmas(){
        for (int i = 0; i < listaArmas.size(); i++){
            System.out.println(listaArmas.get(i).getNombre());
             
        }
     }
    
    public void menuOferta() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        System.out.println("1) Ofertar arma");
        System.out.println("2) Ofertar armadura");
        System.out.println("3) Volver");
        
        String c = lectura.next();

        if ("1".equals(c)){
            ofertarArma();
        }
        else if ("2".equals(c)){
            ofertarArmadura();
        }
        else if ("3".equals(c)){
            usuario.mostrarMenu();
        }   
   
    }
    
    public void ofertarArma() throws IOException{
        System.out.println("¿Que arma desea ofertar?");
        String i = lectura.next();
        
        FileWriter fw = new FileWriter(usuario.getFicheroOfertas()); //se procede a comprobar si existe el usuario
        BufferedWriter bw = new BufferedWriter(fw);
        
        int j = Integer.valueOf(i);
        bw.write(usuario.getNick() + " --> " + getListaArmas().get(j));
        bw.close();
        System.out.println("Personaje guardado");

            
            
    }
    
    public void ofertarArmadura() throws IOException{
        System.out.println("¿Que armadura desea ofertar?");
        String i = lectura.next();
        
        FileWriter fw = new FileWriter(usuario.getFicheroOfertas()); //se procede a comprobar si existe el usuario
        BufferedWriter bw = new BufferedWriter(fw);
        //bw.write(nick + " --> " + nombre);
        bw.newLine();
        bw.close();        
    }
    
    public void volver(){
        
    }
  
 
  /*  public void inicializarEquipo(){
        Scanner lectura = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5; i++){
            switch(i){
                case 0:{
                        Arma arma1 = new Arma();
                        listaArmas.add(arma1);
                        listaArmas.get(i).setNombre("arma1");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(1);
                        listaArmas.get(i).setActivo(false);
                        
                        Armadura armadura1 = new Armadura();
                        listaArmaduras.add(armadura1);
                        listaArmaduras.get(i).setNombre("armadura1");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                       
                        break;
                }
                        
                case 1: {
                        Arma arma2 = new Arma();
                        listaArmas.add(arma2);
                        listaArmas.get(i).setNombre("arma2");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(1);
                        listaArmas.get(i).setActivo(false); 
                        
                        Armadura armadura2 = new Armadura();
                        listaArmaduras.add(armadura2);
                        listaArmaduras.get(i).setNombre("armadura2");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);
                        break;
                }
                case 2: {
                        Arma arma3 = new Arma();
                        listaArmas.add(arma3);
                        listaArmas.get(i).setNombre("arma3");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(2);
                        listaArmas.get(i).setActivo(false);
                        
                        
                        Armadura armadura1 = new Armadura();
                        listaArmaduras.add(armadura1);
                        listaArmaduras.get(i).setNombre("armadura1");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                       
                        break;
                }
                case 3:{
                        Arma arma4 = new Arma();
                        listaArmas.add(arma4);
                        listaArmas.get(i).setNombre("arma4");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(2);
                        listaArmas.get(i).setActivo(false);
                        
                        
                        Armadura armadura4 = new Armadura();
                        listaArmaduras.add(armadura4);
                        listaArmaduras.get(i).setNombre("armadura4");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                      
                        break;
                    
                }
                case 4:{
                        Arma arma5 = new Arma();
                        listaArmas.add(arma5);
                        listaArmas.get(i).setNombre("arma5");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(2);
                        listaArmas.get(i).setActivo(false);
                        
                        
                        Armadura armadura1 = new Armadura();
                        listaArmaduras.add(armadura1);
                        listaArmaduras.get(i).setNombre("armadura1");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                       
                        break;
                }
            }
            
                  
        }*/

   
    

    
    
}

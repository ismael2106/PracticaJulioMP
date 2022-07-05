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
    
    ArrayList<Arma> listaArmas = new ArrayList<Arma>();
    ArrayList<Armadura> listaArmaduras = new ArrayList<Armadura>();
    
    
    
    public Equipo(Usuario usuario) throws FileNotFoundException {
        super(usuario);
        insertarArmasArmaduras();
    }
    
    public void insertarArmasArmaduras() throws FileNotFoundException{
        File ficheroArmas = new File("FicherosMP/ficheroArmas.txt");
        Scanner sc = new Scanner(ficheroArmas);
        int cont = 0;
        ArrayList<String> lista = new ArrayList();

        while (sc.hasNextLine()){
            String nombre = sc.next();
            int manos = sc.nextInt();
            String categoria = sc.next();
            while (sc.hasNext()){
                String material = sc.next();
                lista.add(material);
            }
            Arma arma = new Arma(nombre,manos,categoria, lista);
            listaArmas.add(arma);
            cont++;
        }
        
        File ficheroArmaduras = new File("FicherosMP/ficheroArmaduras.txt");
        Scanner sc2 = new Scanner(ficheroArmaduras);
        int contador = 0;

        while (sc2.hasNextLine()){
            String nombre = sc2.next();
            String categoria = sc2.next();
            
            sc2.useDelimiter("/n");
            while (sc2.hasNext()){
                String material = sc2.next();
                lista.add(material);
            }
            Armadura armadura = new Armadura(nombre,categoria,lista);
            listaArmaduras.add(armadura);
            contador++;
        }
    }
    
    public void verEquipo() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        for (int i = 0; i < listaArmas.size(); i++){
            System.out.println(listaArmas.get(i).getNombre());
        }
        for (int i = 0; i < listaArmaduras.size(); i++){
            System.out.println(listaArmaduras.get(i).getNombre()); 
        }
    menuOferta();
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
        bw.write(usuario.getNick() + " --> " + listaArmas.get(j));
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
    
}

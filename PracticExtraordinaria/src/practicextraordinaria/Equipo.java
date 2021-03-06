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
class Equipo extends Operation implements java.io.Serializable{
    
    
    ArrayList<Arma> listaArmas = new ArrayList<Arma>();
    ArrayList<Armadura> listaArmaduras = new ArrayList<Armadura>();
    ArrayList<Esbirro> listaEsbirros = new ArrayList<Esbirro>();
    ArrayList<String> listaMateriales = new ArrayList<>();
    
    
    
    public Equipo(Usuario usuario) throws FileNotFoundException {
        super(usuario);
        //insertarArmasArmaduras();
        //insertarEsbirros();
    }
    /*
    public void insertarArmasArmaduras() throws FileNotFoundException{
        File ficheroArmas = new File("FicherosMP/ficheroArmas.txt");
        Scanner sc = new Scanner(ficheroArmas);
        int cont = 0;
        ArrayList<String> lista = new ArrayList();

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner sc3 = new Scanner(line);
            String nombre = sc3.next();
            int manos = sc3.nextInt();
            String categoria = sc3.next();
            int modDefensa = sc3.nextInt();
            int modAtaque = sc3.nextInt();
            while (sc3.hasNext()){
                String material = sc3.next();
                lista.add(material);
            }
            Arma arma = new Arma(nombre,manos,categoria,lista, modDefensa, modAtaque);
            listaArmas.add(arma);
            cont++;
        }
        
        File ficheroArmaduras = new File("FicherosMP/ficheroArmaduras.txt");
        Scanner sc2 = new Scanner(ficheroArmaduras);
        int contador = 0;

        while (sc2.hasNextLine()){
            String line = sc2.nextLine();
            Scanner sc3 = new Scanner(line);
            String nombre = sc3.next();
            String categoria = sc3.next();
            int modDefensa = sc3.nextInt();
            int modAtaque = sc3.nextInt();
            
            while (sc3.hasNext()){
                String material = sc3.next();
                lista.add(material);
            }
            Armadura armadura = new Armadura(nombre,categoria,lista, modAtaque, modDefensa);
            listaArmaduras.add(armadura);
            contador++;
        }
    }
    
    public void insertarEsbirros() throws FileNotFoundException{
        File ficheroEsbirros = new File("FicherosMP/ficheroEsbirros.txt");
        Scanner sc = new Scanner(ficheroEsbirros);
        int cont = 0;
        ArrayList<String> lista = new ArrayList();

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner sc3 = new Scanner(line);
            String nombre = sc3.next();
            String tipo = sc3.next();
            String cosa = sc3.next();
            Esbirro esbirro = new Esbirro(nombre, tipo, cosa);
            listaEsbirros.add(esbirro);
            cont++;
        }
    }
    */
    public void consultarEquipo() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        System.out.println("-------------------------------------");
        System.out.println("ARMAS DISPONIBLES:");
        for (int i = 0; i < listaArmas.size(); i++){
            System.out.println(i+1 + "." + listaArmas.get(i).getNombre());
        }
        System.out.println("");
        
        System.out.println("ARMADURAS DISPONIBLES:");
        for (int i = 0; i < listaArmaduras.size(); i++){
            System.out.println(i+1 + "." + listaArmaduras.get(i).getNombre()); 
        }
        System.out.println("-------------------------------------");
    }
    
    public void consultarEsbirros() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        System.out.println("ESBIRROS DISPONIBLES:");
        for (int i = 0; i < listaEsbirros.size(); i++){
            System.out.println(i+1 + "." + listaEsbirros.get(i).getNombre()); 
        }
        System.out.println("-------------------------------------");
        
    }
    public void menuEquipo() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        Scanner lectura = new Scanner(System.in);
        System.out.println("1) A??adir equipo");
        System.out.println("2) Borrar equipo");
        
        System.out.println("3) Volver");
        
        String c = lectura.next();

        if ("1".equals(c)){
            a??adirEquipo();
        }
        else if ("2".equals(c)){
            borrarEquipo();
        }
        else if ("3".equals(c)){
        }   
   
    }
    
    public void menuEsbirros () throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        Scanner lectura = new Scanner(System.in);
        System.out.println("1) A??adir esbirro");
        System.out.println("2) Borrar esbirro");
        
        System.out.println("3) Volver");
        
        String c = lectura.next();
        
        if ("1".equals(c)){
            a??adirEsbirro();
        }
        else if ("2".equals(c)){
            borrarEsbirro();
        }
        else if ("3".equals(c)){
        }   
    }
    
    
    public void a??adirEquipo(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("??Qu?? quieres a??adir?");
        System.out.println("1) Arma");
        System.out.println("2) Armadura");
        
        String opcion = lectura.next();
        
        if ("1".equals(opcion)){
            System.out.println("Escribe el nombre del arma");
            String nombre = lectura.next();
            System.out.println("Escribe el n??mero de manos del arma");
            String manos = lectura.next();
            System.out.println("Escribe la categor??a del arma (comun, raro, epico, legendario)");
            String categoria = lectura.next();
            System.out.println("Escribe el valor del modificador de ataque");
            String modAtaque = lectura.next();
            System.out.println("Escribe el valor del modificador de defensa");
            String modDefensa = lectura.next();
            lectura.nextLine();
            System.out.println("Escribe los materiales del arma");
            String materiales = lectura.nextLine();
            
            
            Arma new_arma = new Arma(nombre, manos, categoria, materiales, modAtaque, modDefensa);
            listaArmas.add(new_arma);
        }
        if ("2".equals(opcion)){
            System.out.println("Escribe el nombre de la armadura");
            String nombre = lectura.next();
            System.out.println("Escribe la categor??a de la armadura(comun, raro, epico, legendario)");
            String categoria = lectura.next();
            System.out.println("Escribe el valor del modificador de ataque");
            String modAtaque = lectura.next();
            System.out.println("Escribe el valor del modificador de defensa");
            String modDefensa = lectura.next();
            lectura.nextLine();
            System.out.println("Escribe los materiales la armadura");
            String materiales = lectura.nextLine();
           
            
            
            Armadura new_armadura = new Armadura(nombre, categoria, materiales, modAtaque, modDefensa);
            listaArmaduras.add(new_armadura);
        }
    }
    
    public void borrarEquipo(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("??Qu?? quieres borrar?");
        System.out.println("1) Arma");
        System.out.println("2) Armadura");
        
        String opcion = lectura.next();
        
        if ("1".equals(opcion)){
            System.out.println("Escribe el n??mero del arma que desea eliminar");
            int num = lectura.nextInt();
            listaArmas.remove(num-1);
        }
        if ("2".equals(opcion)){
            System.out.println("Escribe el n??mero de la armadura que desea eliminar");
            int num = lectura.nextInt();
            listaArmaduras.remove(num-1);
        }
    }
    
    public void a??adirEsbirro(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe el nombre del nuevo esbirro");
        String nombre = lectura.next();
        System.out.println("Escribe el tipo del esbirro (humano, demonio, ghoul)");
        String tipo = lectura.next();
        
        if("humano".equals(tipo)){
            System.out.println("Escribe la lealtad del humano (alta, media, baja)");
            String lealtad = lectura.next();
            Esbirro esbirro = new Esbirro(nombre, tipo, lealtad);
            listaEsbirros.add(esbirro);
        }
        else if("ghoul".equals(tipo)){
            System.out.println("Escribe la dependencia del ghoul (1-5)");
            String dependencia = lectura.next();
            Esbirro esbirro = new Esbirro(nombre, tipo, dependencia);
            listaEsbirros.add(esbirro);
        }
        else if("demonio".equals(tipo)){
            boolean salir = false;
            System.out.println("Escribe el pacto entre el demonio y su amo");
            String pacto = lectura.next();
            Esbirro esbirro = new Esbirro(nombre, tipo, pacto);
            
            
            while (salir == false){
                System.out.println("Quieres a??adir esbirros a " + nombre + "? (1-si o 2-no)");
                String a = lectura.next();
                if ("1".equals(a)){
                    System.out.println("Escribe el nombre del nuevo esbirro");
                    String nombre2 = lectura.next();
                    System.out.println("Escribe el tipo del esbirro");
                    String tipo2 = lectura.next();
                    Esbirro esb = new Esbirro(nombre2, tipo2, pacto);
                    esbirro.getDemonio().getConjuntoEsbirros().add(esb);
                   
                }
                else if("2".equals(a)){
                    salir = true;
                }
            }
            listaEsbirros.add(esbirro); 
        }
    }
    
    public void borrarEsbirro(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("??Qu?? esbirro desea borrar?");        
        int opcion = lectura.nextInt();
        
        listaEsbirros.remove(opcion-1);
    }
}
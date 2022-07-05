package practicextraordinaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author emmar
 */

public class Personaje extends Operation{
    private String nick;
    private Usuario usuario;
    private String nombre;
    private Equipo equipo;
    private ArrayList<Esbirro> esbirros;
    private float oro;
    private int salud;
    private int edad;
    private Modificador modificador = new Modificador();
    private File ficheroPersonajes= new File("FicherosMP/ficheroPersonajes.txt");
    private File ficheroOfertas= new File("FicherosMP/ficheroOfertas.txt");
    private String tipo;
    
    Scanner lectura = new Scanner(System.in);
    /*private Cazador cazador;
    private Licantropo licantropo;
    private Vampiro vampiro;
    */

    public Personaje(Usuario usuario) throws FileNotFoundException{
        super(usuario);
        this.equipo = new Equipo(usuario);
        int edad = (int)(Math. random()*10+1);  //edad aleatoria solo para vampiro
        this.nick = usuario.getNick();
        this.oro = oro;
        int numEsbirros = (int)(Math. random()*2+1); //pone un numero aleatorio de esbirros
    }
    
    public void registrarPersonaje() throws IOException, InterruptedException {
        getTipo();
        System.out.print("Escriba el nombre que desea para su personaje: ");
        setNombre(lectura.next());
        
        FileWriter fw = new FileWriter(getFicheroPersonajes(),true);        
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nick + " --> " + nombre);
        bw.newLine();
        bw.close();
        System.out.println("Personaje guardado");
        System.out.println("-----------------------------------");
    }
    
    
    public File getFicheroPersonajes() {
        return ficheroPersonajes;
    }

    public void setFicheroPersonajes(File ficheroPersonajes) {
        this.ficheroPersonajes = ficheroPersonajes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getTipo(){
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Escoger personaje: ");
        System.out.println("1)Cazador");
        System.out.println("2)Licantropo");
        System.out.println("3)Vampiro");
        
        String opcion = lectura.next();
        
        if ("1".equals(opcion)){
            setTipo("Cazador"); 
            Cazador cazador = new Cazador(3);
            
        }
        else if ("2".equals(opcion)){
            setTipo("Licantropo");
            Licantropo licantropo = new Licantropo(0);
            
        }
        else if ("3".equals(opcion)){
            setTipo("Vampiro");
            Vampiro vampiro = new Vampiro(0, edad);
            
        }
        return tipo;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void setEquipo() {
        System.out.println("he llegado");
        //equipo.inicializarEquipo();
        //equipo.equipar();
     }
     
    
    /*
    public void inicializarEsbirros(int j){
        ArrayList<Esbirro> listaEsbirros = new ArrayList<Esbirro>();
        for (int i=0 ; i < j; i++){
            switch(i){
                case 0:{
                        Esbirro esbirro1 = new Esbirro();
                        listaEsbirros.add(esbirro1);
                        listaEsbirros.get(i).setNombre("esbirro1");
                        listaEsbirros.get(i).setSalud((int) (Math. random()*3+1));
                   
                        break;
                }
                        
                case 1: {
                       Esbirro esbirro2 = new Esbirro();
                        listaEsbirros.add(esbirro2);
                        listaEsbirros.get(i).setNombre("esbirro2");
                        listaEsbirros.get(i).setSalud((int) (Math. random()*3+1));
                   
                        break;
                }
                case 2: {
                        Esbirro esbirro3 = new Esbirro();
                        listaEsbirros.add(esbirro3);
                        listaEsbirros.get(i).setNombre("esbirro3");
                        listaEsbirros.get(i).setSalud((int) (Math. random()*3+1));
                   
                        break;
                }
                case 3:{
                        Esbirro esbirro4 = new Esbirro();
                        listaEsbirros.add(esbirro4);
                        listaEsbirros.get(i).setNombre("esbirro4");
                        listaEsbirros.get(i).setSalud((int) (Math. random()*3+1));
                   
                        break;
                    
                }
                case 4:{
                        Esbirro esbirro5 = new Esbirro();
                        listaEsbirros.add(esbirro5);
                        listaEsbirros.get(i).setNombre("esbirro5");
                        listaEsbirros.get(i).setSalud((int) (Math. random()*3+1));
                   
                        break;
                }
            }
            
                  
        }
        
    }
   

    public String getNick() {
        return nick;
    }
   
    public ArrayList<Esbirro> getEsbirros() {
        return esbirros;
    }

    public void setEsbirros(ArrayList<Esbirro> esbirros) {
        this.esbirros = esbirros;
    }

    public float getOro() {
        return oro;
    }

    public void setOro(float oro) {
        this.oro = oro;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public Cazador getCazador() {
        return cazador;
    }

    public Licantropo getLicantropo() {
        return licantropo;
    }

    public Vampiro getVampiro() {
        return vampiro;
    }

    public Modificador getModificador() {
        return modificador;
    }*/

    

    float getOro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
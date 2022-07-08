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

public class Personaje extends Operation implements java.io.Serializable{
    private String nick;
    private Usuario usuario;
    private String nombre;
    private Equipo equipo;
    private ArrayList<Esbirro> esbirros;
    private float oro;
    private int salud;
    private int edad;
    private File ficheroPersonajes= new File("FicherosMP/ficheroPersonajes.txt");
    private File ficheroOfertas= new File("FicherosMP/ficheroOfertas.txt");
    private String tipo;
    
    Scanner lectura = new Scanner(System.in);
    
    

    public Personaje(Usuario usuario) throws FileNotFoundException{
        super(usuario);
        this.equipo = new Equipo(usuario);
        int edad = (int)(Math. random()*10+1);  //edad aleatoria solo para vampiro
        this.nick = usuario.getNick();
        this.oro = (float)(Math. random()*10+1);
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
    
    public void consultarOro(){
        System.out.println("Tu oro actual es: "+getOro());
        System.out.println("---------------------------");
        System.out.println("1)Añadir oro");
        System.out.println("2)Reducir oro");
        System.out.println("3)Volver");
        String op = lectura.next();
        if ("1".equals(op)){
            System.out.println("Inserte la cantidad de oro que desea añadir");
            float oro = lectura.nextFloat();
            setOro(getOro()+oro);
            if (getOro()<0){
                System.out.println("No puede restar esa cantidad");
            }
            else{
                System.out.println("Tu oro actual pasa a ser: "+getOro());
            }
        System.out.println("---------------------------");
        }
        if ("2".equals(op)){
            System.out.println("Inserte la cantidad de oro que desea reducir");
            float oro = lectura.nextFloat();
            float resta = getOro()-oro;
            if (resta<0){
                System.out.println("No puede restar esa cantidad");
            }
            else{
                System.out.println("Tu oro actual pasa a ser: "+getOro());
            }
        System.out.println("---------------------------");
        }
    }

    public float getOro() {
        return oro;
    }
    
    public void setOro(float oro) {
        this.oro = oro;
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

    public String getNick() {
        return nick;
    }

     

}
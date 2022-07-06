package practicextraordinaria;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
*
* @author paula
*/
public class Usuario {

Scanner lectura = new Scanner(System.in);

private String nick;
private String nombre;
private String contraseña;
private String numReg;
public File ficheroUsuario;
public File ficheroOfertas;
public String fichOfertas;
private Usuario usuario;
private Oferta oferta;
private ArrayList<Oferta> listaOfertas;
public Personaje personaje;

//private String tipo;



    Usuario(String nick, String contraseña) throws FileNotFoundException, IOException, InterruptedException {
        this.nick = nick;
        this.contraseña = contraseña;
        personaje = new Personaje(this);
        personaje.registrarPersonaje();
    }

    public void mostrarMenu() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        boolean salida = false;
        while (salida == false){
            System.out.println("1) DAR DE BAJA PERSONAJE");
            System.out.println("2) CONSULTAR EQUIPO");
            System.out.println("3) CONSULTAR ORO");
            System.out.println("4) CONSULTAR ESBIRROS");
            System.out.println("5) SUBSCRIBIRSE A OFERTA");
            System.out.println("6) CREAR OFERTA");
            System.out.println("7) CONSULTAR OFERTAS PUBLICADAS");
            System.out.println("8) SALIR");

            String c = lectura.next();

            if ("1".equals(c)){
                darDeBajaPersonaje();
            }
            else if ("2".equals(c)){
                personaje.getEquipo().consultarEquipo();  
                personaje.getEquipo().menuEquipo();
            }
            else if ("3".equals(c)){
                personaje.consultarOro();
            }
            else if ("4".equals(c)){
                personaje.getEquipo().consultarEsbirros();
                personaje.getEquipo().menuEsbirros();
            }
            else if ("5".equals(c)){
                //subscribirseOferta();
            }
            else if ("6".equals(c)){
                oferta = new Oferta();
                ficheroOfertas = new File (fichOfertas);
                if (isFileEmpty(ficheroOfertas)){
                    listaOfertas = new ArrayList<Oferta>();
                }
                else {
                    deserializar(ficheroOfertas);
                }
                boolean sal = false;
                while(sal == false){
                System.out.println("¿Qué desea ofertar?");
                System.out.println("1) Equipo");
                System.out.println("2) Esbirros");
                System.out.println("3) Terminar oferta");
                               
                int opt = lectura.nextInt();
                if ("1".equals(opt)){
                    personaje.getEquipo().consultarEquipo();
                    System.out.println("¿Qué va a ofertar?");
                    System.out.println("1) Arma");
                    System.out.println("2) Armadura");
                    int option = lectura.nextInt();
                    if ("1".equals(option)){
                        personaje.getEquipo().ofertarArma(oferta);
                    }
                    else if ("2".equals(option)){
                        personaje.getEquipo().ofertarArmadura(oferta);
                    }
                if ("2".equals(opt)){
                    //personaje.getEquipo().consultarEsbirros(oferta);                    
                }
                if ("3".equals(opt)){
                    salir(); 
                    
                    System.out.println("Inserte el precio de su oferta");
                    float precio = lectura.nextFloat();
                    oferta.setPrecio(precio);
                    oferta.setTipoUsuario(nick);
                    
                    
                    listaOfertas.add(oferta);
                    sal = true;
                }
                }
                }
            }
            else if ("7".equals(c)){
                //consultarOfertas();
            }
            else if ("8".equals(c)){
                salir();
                salida = true;
            }
        }
    }
        
    public boolean isFileEmpty(File file) {
    return file.length() == 0;
    }
    
    public void deserializar(File fichero) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileInputStream fileStream = new FileInputStream("PracticaMP/ficheroOfertas.bin");
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            this.listaOfertas = (ArrayList<Oferta>) objectStream.readObject();      
    }

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }
        
    
    public Personaje getPersonaje() {
        return personaje;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNumReg(String numReg) {
        this.numReg = numReg;
    }


    public void setFicheroUsuario(File ficheroUsuario) {
        this.ficheroUsuario = ficheroUsuario;
    }

    public File getFicheroOfertas() {
        return ficheroOfertas;
    }   
    
    public String getNick() {
        return nick;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNumReg() {
        return numReg;
    }

    public File getFicheroUsuario() {
        return ficheroUsuario;
    }

    public void darDeBajaPersonaje(){
    
    }

    public void elegirEquipo(){
        personaje.setEquipo();
    }


    public void salir(){
    System.out.println("Hasta pronto!");
    }
}    
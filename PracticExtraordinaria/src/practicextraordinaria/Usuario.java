package practicextraordinaria;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public String ficheroOfertas;
private Usuario usuario;

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

            String c = lectura.next();

            if ("1".equals(c)){
                darDeBajaPersonaje();
            }
            else if ("2".equals(c)){
                personaje.getEquipo().verEquipo();   
            }
            else if ("3".equals(c)){
                consultarOro();
            }
            else if ("4".equals(c)){
                //consultarEsbirros();
            }
            else if ("5".equals(c)){
                //subscribirseOferta();
            }
            else if ("6".equals(c)){
                //crearOferta();
            }
            else if ("7".equals(c)){
                //consultarOfertas();
            }
        }
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

    public String getFicheroOfertas() {
        ficheroOfertas = "FicherosMP/ficheroOfertas.bin";
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
        String ruta;
        Boolean encontrado;
        encontrado = false;
        ruta = "C:\\Users\\Usuario\\OneDrive - Universidad Rey Juan Carlos\\Documentos\\NetBeansProjects\\PracticaMP\\PracticaMP\\OneDrive - Universidad Rey Juan Carlos\\Documentos\\NetBeansProjects\\PracticaMP\\"+nick+".txt";
    }

    public void elegirEquipo(){
        personaje.setEquipo();

    }

    public float consultarOro(){
        return personaje.getOro();

    }


    public void verRanking(){

    }

    public void salir(){
    System.out.println("Hasta pronto!");
    }
}    
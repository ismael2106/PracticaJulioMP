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
public class Usuario implements Serializable{

Scanner lectura = new Scanner(System.in);

private String nick;
private String nombre;
private String contraseña;
private String numReg;
public File ficheroUsuario;
public File ficheroOfertas;
private Usuario usuario;
private Oferta oferta;
private ArrayList<Oferta> listaOfertas= new ArrayList();
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
            System.out.println("6) PUBLICAR OFERTA");
            System.out.println("7) CONSULTAR OFERTAS PUBLICADAS");
            System.out.println("8) SALIR");

            String c = lectura.next();

            if ("1".equals(c)){
                //darDeBajaPersonaje();
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
                ficheroOfertas = new File ("FicherosMP/ficheroOfertas.bin");
                if (isFileEmpty(ficheroOfertas)){
                    listaOfertas = new ArrayList<Oferta>(); //DA ERROR SI NO SE CREA GLOBAL Y ENTRA AL ELSE
                }
                else {
                    //deserializar(ficheroOfertas); //COMENTADO PQ DA ERROR
                }
                boolean sal = false;
                int cont = 0;
                while(sal == false){
                System.out.println("¿Qué desea ofertar?");
                System.out.println("1) Equipo");
                System.out.println("2) Esbirros");
                System.out.println("3) Terminar oferta");
                String opt = lectura.next();
                if (!"3".equals(opt)){
                    cont++;
                }
                
                if ("1".equals(opt)){
                    personaje.getEquipo().consultarEquipo();
                    System.out.println("¿Qué va a ofertar?");
                    System.out.println("1) Arma");
                    System.out.println("2) Armadura");
                    String option = lectura.next();
                    if ("1".equals(option)){
                        personaje.getEquipo().ofertarArma(oferta);
                    }
                    if ("2".equals(option)){
                        personaje.getEquipo().ofertarArmadura(oferta);
                    }
                    }
                else if ("2".equals(opt)){
                    personaje.getEquipo().consultarEsbirros();                    
                    personaje.getEquipo().ofertarEsbirro(oferta);                    
                }
                else if ("3".equals(opt)){  
                    if (cont>=1){
                    /*
                    System.out.println("Quiere ofertar:");
                    cont=listaOfertas.size()-cont;
                    for (int i = cont; i < listaOfertas.size(); i++){
                        System.out.println(listaOfertas.get(i).getNombre());
                    }
                    */
                    System.out.println("¿Es correcto?");
                    System.out.println("1)Sí");
                    System.out.println("2)Cancelar oferta");
                    
                    String e = lectura.next();
                    if ("1".equals(e)){
                        System.out.println("Inserte el precio de su oferta");
                        float precio = lectura.nextFloat();
                        oferta.setPrecio(precio);
                        oferta.setTipoUsuario(nick);

                        listaOfertas.add(oferta);
                        ListaDeOfertas listaOf = new ListaDeOfertas(listaOfertas);
                        serializarOfertas("FicherosMP/ficheroOfertas.bin",listaOf);

                        System.out.println("Oferta publicada con éxito");
                        System.out.println("--------------------------");

                        sal = true;
                    }
                    if ("2".equals(e)){
                        sal = true;
                    }
                    }
                }
                }//end while ofertar
            } //end op 6
        
            else if ("7".equals(c)){
                //consultarOfertas();
            }
            else if ("8".equals(c)){
                salida = true;
                
            }
        }//end while menu
    } //end mostrarMenu()
        
    public boolean isFileEmpty(File file) {
    return file.length() == 0;
    }
    
    public void deserializar(File fichero) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileInputStream fileStream = new FileInputStream(ficheroOfertas);
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            
            ListaDeOfertas lista = (ListaDeOfertas) objectStream.readObject();
            listaOfertas = lista.getListaOfertas();
            
            //this.listaOfertas = (ArrayList<Oferta>) objectStream.readObject();      
    }
    
    public void serializarOfertas(String file,ListaDeOfertas lista) throws FileNotFoundException, IOException{
        File fich = new File(file);
        FileOutputStream f = new FileOutputStream(fich);
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.writeObject(lista);
        
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
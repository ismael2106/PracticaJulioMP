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



private String nick;
private String nombre;
private String contraseña;
private String numReg;
public File ficheroUsuario;
public File ficheroOfertas = new File ("FicherosMP/ficheroOfertas.bin");
private Usuario usuario;
private Oferta oferta;
private ArrayList<Oferta> listaOfertas= new ArrayList();
public Personaje personaje;
public ArrayList<Personaje> listaPersonajes = new ArrayList();
public ListaDePersonajes clasePersonajes;

//private String tipo;



    Usuario(String nick, String contraseña) throws FileNotFoundException, IOException, InterruptedException {
        this.nick = nick;
        this.contraseña = contraseña;
        personaje = new Personaje(this);
    }
    
    public boolean comprobarPersonajes() throws IOException, ClassNotFoundException{
        String fPersonajes = "FicherosMP/ficheroPersonajesBin.bin";
        File f = new File(fPersonajes);
        if(isFileEmpty(f)){
            return false;
        }
        FileInputStream fileStream = new FileInputStream(f);
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);            
        clasePersonajes = (ListaDePersonajes) objectStream.readObject();
        objectStream.close();
        
        
        listaPersonajes = clasePersonajes.getListaPersonajes();
        
        for(int i = 0; i<listaPersonajes.size();i++){
            if(listaPersonajes.get(i).getNick().equals(nick)){
                personaje = listaPersonajes.get(i); //suponemos que ambos apuntan al mismo sitio y se actualiza automaticamente
                return true;
            }
        }
        return false;      
    }
    
    public void serializarPersonajes() throws FileNotFoundException, IOException{
        
        clasePersonajes = new ListaDePersonajes(listaPersonajes);
        
        String fPersonajes = "FicherosMP/ficheroPersonajesBin.bin";
        File f = new File(fPersonajes);
        
        FileOutputStream fileStream = new FileOutputStream(f);
        try (ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)) {
            objectStream.writeObject(clasePersonajes);
            objectStream.close();
    }
        
        
        
        
    }
    
    public void mostrarMenu() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException{
        Scanner lectura = new Scanner(System.in);
        if(!comprobarPersonajes()){
            personaje.registrarPersonaje();
            listaPersonajes.add(personaje);
            serializarPersonajes();
            System.out.println("Personaje creado con éxito, vuelva a iniciar sesión");
        }
        else{
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
                    darDeBajaPersonaje();
                }
                else if ("2".equals(c)){
                    personaje.getEquipo().consultarEquipo();  
                    personaje.getEquipo().menuEquipo();
                    System.out.println("hola");
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
                    
                    if (isFileEmpty(ficheroOfertas)){
                        listaOfertas = new ArrayList<Oferta>(); 
                    }
                    else {
                        deserializar(ficheroOfertas); //COMENTADO PQ DA ERROR
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
                            oferta = personaje.getEquipo().ofertarArma(oferta);
                        }
                        if ("2".equals(option)){
                            oferta = personaje.getEquipo().ofertarArmadura(oferta);
                        }
                        }
                    else if ("2".equals(opt)){
                        personaje.getEquipo().consultarEsbirros();                    
                        personaje.getEquipo().ofertarEsbirro(oferta);                    
                    }
                    else if ("3".equals(opt)){

                        if (cont>=1){
                        /*
                        listaOfertas.add(oferta);
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
                    consultarOfertas();
                }
                else if ("8".equals(c)){
                    serializarPersonajes();
                    salida = true;

                }
            }//end while menu
        } //end comprobarPersonajes
    }//end mostrarMenu()   
    
    
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
        obj.close();
        /*
        
        try {
            ArrayList <Oferta> list = new ArrayList<>();
            list = (ArrayList<Oferta>) listaOfertas;
            
            FileOutputStream fileSerialize = new FileOutputStream("FicherosMP/ficheroOfertas.bin");
            ObjectOutputStream salida = new ObjectOutputStream(fileSerialize);
            salida.writeObject(list);
            salida.close();
            
        }catch (IOException e) {
            System.out.println(e);
        }
        */
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
        for(int i = 0; i<listaPersonajes.size();i++){
            if(listaPersonajes.get(i).getNick().equals(nick)){
                listaPersonajes.remove(i);
            }
        }
        System.out.println("Personaje eliminado con éxito, vuelva pronto!");
        
    
    }
    
    public void consultarOfertas() throws IOException, FileNotFoundException, ClassNotFoundException{
        deserializar(ficheroOfertas);
        for(int i = 0; i<listaOfertas.size();i++){
            if(listaOfertas.get(i).isValidada()){
                System.out.println("Oferta de "+listaOfertas.get(i).getTipoUsuario());
                for(int j = 0; j<listaOfertas.get(j).getListaNombres().size();j++){
                    System.out.println("-------------");
                    System.out.println("Nombre: "+listaOfertas.get(j).getListaNombres().get(j));
                    //System.out.println("Categoría: "+listaOfertas.get(j).getCateg().get(j));
                    System.out.println("Lealtad: "+listaOfertas.get(j).getLeal().get(j));
                    System.out.println("Valor ataque: "+listaOfertas.get(j).getValorAtaque().get(j));
                    System.out.println("Valor defensa: "+listaOfertas.get(j).getValorDefensa().get(j));
                    System.out.println("Precio: "+listaOfertas.get(j).getPrecio());
                    
                    
                }
                
            }
        }
        
    }

    public void elegirEquipo(){
        personaje.setEquipo();
    }


    public void salir(){
    System.out.println("Hasta pronto!");
    }
}    
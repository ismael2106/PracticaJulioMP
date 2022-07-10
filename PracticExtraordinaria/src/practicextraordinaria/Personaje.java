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
    
    public boolean tipoEsbirro;
    public boolean tipoEquipo;
    public boolean categoriaLegendario;
    public boolean categoriaRaro;
    public boolean categoriaEpico;
    public boolean categoriaComun;
    public boolean lealtadAlta;
    public boolean lealtadMedia;
    public boolean lealtadBaja;
    public String tipoModAtaque;
    public String tipoModDefensa;
    public String tipoNombreUsuario;
    public float precioMin;
    public float precioMax;
    
    
    
    

    public Personaje(Usuario usuario) throws FileNotFoundException{
        super(usuario);
        this.equipo = new Equipo(usuario);
        int edad = (int)(Math. random()*10+1);  //edad aleatoria solo para vampiro
        this.nick = usuario.getNick();
        this.oro = (float)(Math. random()*10+1);
        int numEsbirros = (int)(Math. random()*2+1); //pone un numero aleatorio de esbirros
    }
    
    
    public void suscribirse(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("1-Esbirros");
        System.out.println("2-Equipo");
        System.out.println("3-Categoría legendaria");
        System.out.println("4-Categoría epica");
        System.out.println("5-Categoría rara");
        System.out.println("6-Categoría común");
        System.out.println("7-Lealtad alta");
        System.out.println("8-Lealtad media");
        System.out.println("9-Lealtad baja");
        System.out.println("10-Valor ataque");
        System.out.println("11-Valor defensa");
        System.out.println("12-Nombre usuario");
        System.out.println("13-Precio");
        String op = lectura.next();
        if("1".equals(op)){
            tipoEsbirro = true;
            
        }
        else if("2".equals(op)){
            tipoEquipo = true;
            System.out.println("Te has suscrito a ofertas de tipo esbirro");
        }
        else if("3".equals(op)){
            categoriaLegendario = true;
            System.out.println("Te has suscrito a ofertas de equipo legendario");
        }
        else if("4".equals(op)){
            categoriaEpico = true;
            System.out.println("Te has suscrito a ofertas de equipo epico");
        }
        else if("5".equals(op)){
            categoriaRaro = true;
            System.out.println("Te has suscrito a ofertas de equipo raro");
        }
        else if("6".equals(op)){
            categoriaComun = true;
            System.out.println("Te has suscrito a ofertas de categoria comun");
        }
        else if("7".equals(op)){
            lealtadAlta = true;
            System.out.println("Te has suscrito a ofertas de esbirros con lealtad alta");
        }
        else if("8".equals(op)){
            lealtadMedia = true;
            System.out.println("Te has suscrito a ofertas de esbirros con lealtad media");
            
        }
        else if("9".equals(op)){
            lealtadBaja = true;
            System.out.println("Te has suscrito a ofertas de esbirros con lealtad baja esbirro");
        }
        else if("10".equals(op)){
            System.out.println("Inserte el valor de ataque para el que desea suscribirse");
            String ataque = lectura.next();
            
            tipoModAtaque = ataque;
            System.out.println("Te has suscrito a ofertas con un equipo con valor de ataque "+tipoModAtaque);
        }
        else if("11".equals(op)){
            System.out.println("Inserte el valor de defensa para el que desea suscribirse");
            String defensa = lectura.next();
            
            tipoModDefensa = defensa;
            System.out.println("Te has suscrito a ofertas con un equipo con valor de defensa "+tipoModDefensa);
        }
        else if("12".equals(op)){
            System.out.println("Inserte el nombre de usuario para el que desea suscribirse");
            String nombreUsuario = lectura.next();
            
            tipoNombreUsuario = nombreUsuario;
            System.out.println("Te has suscrito a ofertas publicadas por "+tipoNombreUsuario);
            
        }
        else if("13".equals(op)){
            System.out.println("Inserte el precio minimo para el que desea suscribirse: ");
            String precio = lectura.next();
            precioMin = Float.valueOf(precio);
             System.out.println("Inserte el precio maximo para el que desea suscribirse: ");
            String precio2 = lectura.next();
            precioMax = Float.valueOf(precio2);
            System.out.println("Te has suscrito a ofertas que su coste este entre "+precioMin+" y "+precioMax);
            
        }
        
    }
    
    
    
    public void registrarPersonaje() throws IOException, InterruptedException {
        setTipoEsbirro(false);
        setTipoEquipo(false);
        setCategoriaLegendario(false);
        setCategoriaRaro(false);
        setCategoriaEpico(false);
        setCategoriaComun(false);
        setLealtadAlta(false);
        setLealtadMedia(false);
        setLealtadBaja(false);
        setTipoModAtaque("");
        setTipoModDefensa("");
        setTipoNombreUsuario("");
        setPrecioMin(1);
        setPrecioMax(0);
        Scanner lectura = new Scanner(System.in);
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
        Scanner lectura = new Scanner(System.in);
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

    public boolean isTipoEsbirro() {
        return tipoEsbirro;
    }

    public boolean isTipoEquipo() {
        return tipoEquipo;
    }

    public boolean isCategoriaLegendario() {
        return categoriaLegendario;
    }

    public boolean isCategoriaEpico() {
        return categoriaEpico;
    }

    public boolean isCategoriaComun() {
        return categoriaComun;
    }

    public boolean isLealtadAlta() {
        return lealtadAlta;
    }

    public boolean isLealtadMedia() {
        return lealtadMedia;
    }

    public boolean isLealtadBaja() {
        return lealtadBaja;
    }

    public String getTipoModAtaque() {
        return tipoModAtaque;
    }

    public String getTipoModDefensa() {
        return tipoModDefensa;
    }

    public String getTipoNombreUsuario() {
        return tipoNombreUsuario;
    }

    public float getPrecioMin() {
        return precioMin;
    }

    public float getPrecioMax() {
        return precioMax;
    }

    public void setTipoEsbirro(boolean tipoEsbirro) {
        this.tipoEsbirro = tipoEsbirro;
    }

    public void setTipoEquipo(boolean tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public void setCategoriaLegendario(boolean categoriaLegendario) {
        this.categoriaLegendario = categoriaLegendario;
    }

    public void setCategoriaRaro(boolean categoriaRaro) {
        this.categoriaRaro = categoriaRaro;
    }

    public void setCategoriaEpico(boolean categoriaEpico) {
        this.categoriaEpico = categoriaEpico;
    }

    public void setCategoriaComun(boolean categoriaComun) {
        this.categoriaComun = categoriaComun;
    }

    public void setLealtadAlta(boolean lealtadAlta) {
        this.lealtadAlta = lealtadAlta;
    }

    public void setLealtadMedia(boolean lealtadMedia) {
        this.lealtadMedia = lealtadMedia;
    }

    public void setLealtadBaja(boolean lealtadBaja) {
        this.lealtadBaja = lealtadBaja;
    }

    public void setTipoModAtaque(String tipoModAtaque) {
        this.tipoModAtaque = tipoModAtaque;
    }

    public void setTipoModDefensa(String tipoModDefensa) {
        this.tipoModDefensa = tipoModDefensa;
    }

    public void setTipoNombreUsuario(String tipoNombreUsuario) {
        this.tipoNombreUsuario = tipoNombreUsuario;
    }

    public void setPrecioMin(float precioMin) {
        this.precioMin = precioMin;
    }

    public void setPrecioMax(float precioMax) {
        this.precioMax = precioMax;
    }

     

}
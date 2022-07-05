package practicextraordinaria;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
*
* @author paula
*/
public class Aplicacion {

private String ficheroEscogido;
private Usuario usuario;
private Operador operador;


Scanner lectura = new Scanner(System.in);

    Aplicacion() throws IOException, FileNotFoundException, ClassNotFoundException {

    }
    
    
    public void mostrarMenu() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {

        System.out.println("1) REGISTRARSE");
        System.out.println("2) INICIAR SESION");
        System.out.println("3) DARSE DE BAJA");
        System.out.println("4) SALIR");

        String c = lectura.next();

        if ("1".equals(c)){
            registrarse();
        }
        else if ("2".equals(c)){
            login();
        }
        else if ("3".equals(c)){
            darseBaja();
        }
        else if ("4".equals(c)){
            salir();
        }
        else{
        System.out.println("Opción no válida");
        this.mostrarMenu();
        }
    }
    
    
    public void registrarse () throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException {
        
        System.out.println("1)Registrarse como usuario");
        System.out.println("2)Registrarse como operador");
        String opcion = lectura.next();

        if ("1".equals(opcion)){
            ficheroEscogido = "FicherosMP/ficheroUsuarios.txt";
        }
        else if ("2".equals(opcion)){
            ficheroEscogido = "FicherosMP/ficheroOperadores.txt";
        }
        boolean encontrado = false;
        System.out.print("Inserte su nick: ");
        String nick = lectura.next();
        
        System.out.print("Inserte su contraseña: ");
        String contraseña = lectura.next();
          
        FileReader f = new FileReader(ficheroEscogido);
        Scanner sc = new Scanner(f); //se procede a comprobar si existe el usuario
        while ((sc.hasNext()) && (encontrado == false)){
            String nombre = sc.next();
            if (!(nick.equals(nombre))){
                sc.nextLine();
            }
            else{
                System.out.println("Nick no disponible");
                encontrado = true;
                registrarse();
            }
        }
        if (encontrado == false){
            FileWriter fw = new FileWriter(ficheroEscogido,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nick+" "+contraseña);
            bw.newLine();
            bw.close();
            if ("1".equals(opcion)){
            usuario = new Usuario(nick, contraseña);
            usuario.mostrarMenu();
            }
            if ("2".equals(opcion)){
            operador = new Operador(nick, contraseña);
            operador.mostrarMenu();
            }
        }
    }
    
    
    public void login() throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException{
        System.out.println("1)Iniciar sesión como usuario");
        System.out.println("2)Iniciar sesión como operador");
        String opcion = lectura.next();

        if ("1".equals(opcion)){
        ficheroEscogido = "FicherosMP/ficheroUsuarios.txt";
        }
        else if ("2".equals(opcion)){
        ficheroEscogido = "FicherosMP/ficheroOperadores.txt";
        }
        boolean encontrado = false;
        BufferedWriter bw;

        System.out.print("Inserte su nick: ");
        String nick = lectura.next();

        System.out.print("Inserte su contraseña: ");
        String contraseña = lectura.next();

        FileReader f = new FileReader(ficheroEscogido);

        Scanner sc = new Scanner(f); //se procede a comprobar si existe el usuario
        while ((sc.hasNext()) && (encontrado == false)){
            String credenciales = sc.nextLine();
            if ((nick+" "+contraseña).equals(credenciales)){
                System.out.println("Sesion iniciada");
                encontrado = true;        
            }
        }
        if (encontrado == false){
        System.out.println("Usuario no encontrado");
        System.out.println("-----------------------------------");
        login();
        }
        System.out.println("-----------------------------------");
        if (encontrado == true){
            if ("1".equals(opcion)){
            usuario = new Usuario(nick,contraseña);
            usuario.mostrarMenu();
            }
            
            else if ("2".equals(opcion)){
            operador = new Operador(nick, contraseña);
            operador.mostrarMenu();
            login();
            }
        }

    }

    

    public void darseBaja() throws FileNotFoundException, IOException{
        boolean encontrado = false;
        BufferedWriter bw;

        System.out.print("Inserte su nick: ");
        String nick = lectura.next();

        System.out.println("Inserte su contraseña: ");
        String contraseña = lectura.next();

        FileReader f = new FileReader("FicherosMP/ficheroUsuarios.txt");

        Scanner sc = new Scanner(f);

        FileWriter fw = new FileWriter("FicherosMP/ficheroUsuarios.txt");
        bw = new BufferedWriter(fw);

        while (sc.hasNext()){ //se procede a comprobar si existe el usuario
            String linea = sc.nextLine();
            if ((nick+" "+contraseña).equals(linea)){
                encontrado = true;
            }
            if (encontrado == true){
                bw.write(sc.nextLine());
            }
        }
        bw.close();
    }


    private void salir() {
    System.out.println("Hasta pronto!");
    }

}






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
public class Aplicacion implements java.io.Serializable{

private String ficheroEscogido;
private Usuario usuario;
private Operador operador;




    Aplicacion() throws IOException, FileNotFoundException, ClassNotFoundException {

    }
    
    
    public void mostrarMenu() throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
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
        boolean salida = false;
        Scanner lectura = new Scanner(System.in);
        System.out.println("1)Registrarse como usuario");
        System.out.println("2)Registrarse como operador");
        System.out.println("3)Salir");
        String opcion = lectura.next();

        if ("1".equals(opcion)){
            ficheroEscogido = "FicherosMP/ficheroUsuarios.txt";
        }
        else if ("2".equals(opcion)){
            ficheroEscogido = "FicherosMP/ficheroOperadores.txt";
        }
        else if ("3".equals(opcion)){
            salida = true;
        }
        if (salida == false){
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
    }
    
    
    public void login() throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException{
       Scanner lectura = new Scanner(System.in);
        boolean salida = false;
        while(salida ==false){
            System.out.println("1)Iniciar sesión como usuario");
            System.out.println("2)Iniciar sesión como operador");
            System.out.println("3)Salir");
            String opcion = lectura.next();

            if ("1".equals(opcion)){
            ficheroEscogido = "FicherosMP/ficheroUsuarios.txt";
            }
            else if ("2".equals(opcion)){
            ficheroEscogido = "FicherosMP/ficheroOperadores.txt";
            }
            else if ("3".equals(opcion)){
                salida = true;
            }
            if (salida == false){
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
                    //recorrer fichero binario de personajes
                    usuario.mostrarMenu();
                    salida = true;
                    }

                    else if ("2".equals(opcion)){
                    operador = new Operador(nick, contraseña);
                    operador.mostrarMenu();
                    salida = true;


                    }
                }
            }
        }

    }

    
    public void darseBaja() throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException{
        Scanner lectura = new Scanner(System.in);
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
            }
            if (encontrado == true){
                bw.write(sc.nextLine());
                System.out.println("Proceso realizado correctamente");
            }
            else if (encontrado == false){
                System.out.println("El usuario introducido no se encuentra registrado");
                mostrarMenu();
            }
        bw.close();
        
    }


    private void salir() {
    System.out.println("Hasta pronto!");
    }

}





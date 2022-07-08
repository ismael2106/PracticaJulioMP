package practicextraordinaria;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emmar
 */
public class Operador {
    String nick;
    String contraseña;
    ArrayList<String> listaUsuarios = new ArrayList();
    ArrayList<String> listaBaneados = new ArrayList();
    
    Scanner lectura = new Scanner(System.in);

    public Operador(String nick, String contraseña) {
        this.nick = nick;
        this.contraseña = contraseña;
    }
    public void mostrarMenu() throws IOException{
        boolean salida = false;
        while (salida == false){
            System.out.println("1) VALIDAR OFERTA");
            System.out.println("2) BANEAR USUARIO");
            System.out.println("3) DESBANEAR USUARIO");
            System.out.println("4) CONSULTAR VENTAS");
            System.out.println("5) VOLVER");

            String c = lectura.next();

            if ("1".equals(c)){
                //validarOferta();
            }
            if ("2".equals(c)){
               volcarFichero("FicherosMP/ficheroUsuarios.txt",listaUsuarios);
               banear();
            }
            if ("3".equals(c)){
                volcarFichero("FicherosMP/ficheroBaneados.txt",listaBaneados);
                desbanear();
            }
            if ("4".equals(c)){
                //consultarVentas();
            }
            if ("5".equals(c)){
                salida = true;
            }
        }
    }
    
    public void volcarFichero(String ficheroEscogido, ArrayList lista) throws FileNotFoundException{
        
        FileReader f = new FileReader(ficheroEscogido);
        Scanner sc = new Scanner(f);
        while (sc.hasNext()){
            String nombre = sc.nextLine();
            lista.add(nombre);
        }
        
        
        
        
    }
    
    public void banear() throws FileNotFoundException, IOException{
        String ficheroEscogido = "FicherosMP/ficheroBaneados.txt";
        System.out.println("Escriba el nick del usuario que desea banear:");
       
        String nick = lectura.next();
        
        FileWriter f = new FileWriter(ficheroEscogido,true);
        BufferedWriter bw = new BufferedWriter(f);

        for (int i = 0; i<listaUsuarios.size();i++){
            if (listaUsuarios.get(i).contains(nick)){
                bw.write(listaUsuarios.get(i));
                bw.newLine();
           }           
        }
        bw.close();
        
        
        String ficheroEscogido2 = "FicherosMP/ficheroUsuarios.txt";
        FileWriter f2 = new FileWriter(ficheroEscogido2);
        BufferedWriter bw2 = new BufferedWriter(f2);
        for (int i = 0; i<listaUsuarios.size(); i++){
            if (listaUsuarios.get(i).contains(nick)){
            }else{
                bw2.write(listaUsuarios.get(i));
                bw2.newLine();
            } 
        }
        
        bw2.close();

        
    }



    public void desbanear() throws IOException{
        
        String ficheroEscogido = "FicherosMP/ficheroUsuarios.txt";
        System.out.println("Escriba el nick del usuario que desea desbanear:");
       
        String nick = lectura.next();
        
        FileWriter f = new FileWriter(ficheroEscogido,true);
        BufferedWriter bw = new BufferedWriter(f);

        for (int i = 0; i<listaBaneados.size();i++){
            if (listaBaneados.get(i).contains(nick)){
                bw.write(listaBaneados.get(i));
                bw.newLine();
           }           
        }
        bw.close();
        
        
        String ficheroEscogido2 = "FicherosMP/ficheroBaneados.txt";
        FileWriter f2 = new FileWriter(ficheroEscogido2);
        BufferedWriter bw2 = new BufferedWriter(f2);
        for (int i = 0; i<listaBaneados.size(); i++){
            if (listaBaneados.get(i).contains(nick)){
            }else{
                bw2.write(listaBaneados.get(i));
            } 
        }
        bw2.newLine();
        bw2.close();
        
        
    }

}
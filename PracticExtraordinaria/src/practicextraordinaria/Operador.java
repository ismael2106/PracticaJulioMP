package practicextraordinaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emmar
 */
public class Operador implements java.io.Serializable{
    String nick;
    String contraseña;
    ArrayList<String> listaUsuarios = new ArrayList();
    ArrayList<String> listaBaneados = new ArrayList();
    ArrayList<Oferta> listaOfertas;
    
   

    public Operador(String nick, String contraseña) {
        this.nick = nick;
        this.contraseña = contraseña;
    }
    public void mostrarMenu() throws IOException, FileNotFoundException, ClassNotFoundException{
         Scanner lectura = new Scanner(System.in);
        boolean salida = false;
        while (salida == false){
            System.out.println("1) VALIDAR OFERTA");
            System.out.println("2) BANEAR USUARIO");
            System.out.println("3) DESBANEAR USUARIO");
            System.out.println("4) CONSULTAR VENTAS");
            System.out.println("5) VOLVER");

            String c = lectura.next();

            if ("1".equals(c)){
                validarOferta();
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
    
    
    public void validarOferta() throws IOException, FileNotFoundException, ClassNotFoundException{
         Scanner lectura = new Scanner(System.in);
        String ficheroOfertas = "FicherosMP/ficheroOfertas.bin";
        File f = new File(ficheroOfertas);
        deserializar(f);
        for (int i = 0; i<listaOfertas.size();i++){
            if (!listaOfertas.get(i).isValidada()){
                System.out.println("Oferta "+i);
            }
        }
        System.out.print("Escriba el numero de la oferta que desea validar: ");
        int sc = lectura.nextInt();
        
        listaOfertas.get(sc).setValidada(true);
        ListaDeOfertas lista = new ListaDeOfertas(listaOfertas);
        serializarOfertas(ficheroOfertas,lista);
        
    }
    
    
    public void deserializar(File fichero) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileInputStream fileStream = new FileInputStream(fichero);
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            
            ListaDeOfertas lista = (ListaDeOfertas) objectStream.readObject();
            listaOfertas = lista.getListaOfertas();
            
            //this.listaOfertas = (ArrayList<Oferta>) objectStream.readObject();      
    }
    
    public void serializarOfertas(String file,ListaDeOfertas lista) throws FileNotFoundException, IOException{
        File fich = new File(file);
        FileOutputStream f = new FileOutputStream(fich);
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.flush();
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
    
    
    public void volcarFichero(String ficheroEscogido, ArrayList lista) throws FileNotFoundException{
        
        FileReader f = new FileReader(ficheroEscogido);
        Scanner sc = new Scanner(f);
        while (sc.hasNext()){
            String nombre = sc.nextLine();
            lista.add(nombre);
        }
        
        
        
        
    }
    
    public void banear() throws FileNotFoundException, IOException{
         Scanner lectura = new Scanner(System.in);
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
         Scanner lectura = new Scanner(System.in);
        
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
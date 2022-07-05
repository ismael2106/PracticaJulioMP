package practicextraordinaria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author emmar
 */
public class Operador {
    String nick;
    String contraseña;
    
    Scanner lectura = new Scanner(System.in);

    public Operador(String nick, String contraseña) {
        this.nick = nick;
        this.contraseña = contraseña;
    }
    public void mostrarMenu(){
        boolean salida = false;
        while (salida == false){
            System.out.println("1) VALIDAR OFERTA");
            System.out.println("2) BANEAR USUARIO");
            System.out.println("3) CONSULTAR VENTAS");
            System.out.println("4) DESBANEAR USUARIO");
            System.out.println("5) VOLVER");

            String c = lectura.next();

            if ("1".equals(c)){
                validarOferta();
            }
            if ("2".equals(c)){
                banear();
            }
            if ("3".equals(c)){
                consultarVentas();
            }
            if ("4".equals(c)){
                desbanear();
            }
            if ("5".equals(c)){
                salida = true;
            }
        }
    }
}
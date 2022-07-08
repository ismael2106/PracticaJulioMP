/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicextraordinaria;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaDePersonajes implements Serializable{
    ArrayList<Personaje> listaPersonajes = new ArrayList<>();
    
    ListaDePersonajes(ArrayList lista){
        listaPersonajes = lista;
    }

    public ArrayList<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }
    
    
    
}

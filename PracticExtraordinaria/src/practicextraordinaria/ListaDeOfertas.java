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
public class ListaDeOfertas implements Serializable{
    public ArrayList<Oferta> listaOfertas = new ArrayList<>();
    
    ListaDeOfertas(ArrayList lista){
        listaOfertas = lista;
        
    }

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicextraordinaria;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author emmar
 */
public class Demonio implements java.io.Serializable{
    HashSet<Esbirro> conjuntoEsbirros = new HashSet();  
    String pacto;
    ArrayList <Esbirro> esbirros_demonio = new ArrayList<>();
    
    public Demonio (String pacto){
        this.pacto = pacto;
    }
    
    public HashSet<Esbirro> getConjuntoEsbirros() {
        return conjuntoEsbirros;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicextraordinaria;

/**
 *
 * @author emmar
 */
public class Ghoul implements java.io.Serializable{
    int dependencia;
    
    public Ghoul(String dependencia){
        this.dependencia = Integer.parseInt(dependencia);
    }
}

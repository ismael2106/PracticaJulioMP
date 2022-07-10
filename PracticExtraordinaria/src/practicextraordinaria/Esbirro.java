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
public class Esbirro implements java.io.Serializable{
    public String nombre;
    public int salud;
    enum tipo{
        humano,ghoul,demonio;
    }
    public tipo tipoEsbirro;
    
    public Humano humano;
    public Ghoul ghoul;
    public Demonio demonio;
    
    
    public Esbirro(String nombre, String t, String cosa) {
        
        this.salud = (int)(Math.random()*3+1);
        this.nombre = nombre;
        
        if ("humano".equals(t)){
            tipoEsbirro = tipo.humano;
            humano = new Humano(cosa);
        }
        if ("ghoul".equals(t)){
            tipoEsbirro = tipo.ghoul;
            Ghoul ghoul = new Ghoul(cosa);
        }
        if ("denomio".equals(t)){
            tipoEsbirro = tipo.demonio;
            Demonio demonio = new Demonio(cosa);
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public tipo getTipoEsbirro() {
        return tipoEsbirro;
    }

    public Humano getHumano() {
        return humano;
    }

    public Ghoul getGhoul() {
        return ghoul;
    }

    public Demonio getDemonio() {
        return demonio;
    }
    
    
    
}
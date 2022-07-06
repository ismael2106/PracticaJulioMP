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
public class Esbirro {
    public String nombre;
    public int salud;
    enum tipo{
        humano,ghoul,demonio;
    }
    
    
    public Esbirro(String nombre, String t, String cosa) {
        
        this.salud = (int)(Math.random()*3+1);
        this.nombre = nombre;
        
        if ("humano".equals(t)){
            tipo type = tipo.humano;
            Humano humano = new Humano(cosa);
        }
        if ("ghoul".equals(t)){
            tipo type = tipo.ghoul;
            Ghoul ghoul = new Ghoul(cosa);
        }
        if ("denomio".equals(t)){
            tipo type = tipo.demonio;
            Demonio demonio = new Demonio(cosa);
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }
    }

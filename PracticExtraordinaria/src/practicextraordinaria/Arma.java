/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicextraordinaria;

/**
 *
 * @author paula
 */
public class Arma {
    
    private String nombre;
    private int manos;

    public Arma(String nombre, int manos) {
        this.nombre = nombre;
        this.manos = manos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getManos() {
        return manos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setManos(int manos) {
        this.manos = manos;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicextraordinaria;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Oferta {
    private boolean validada;
    private String nombre;
    private boolean tipoEsbirro= false;
    private boolean tipoEquipo= false;
    private enum categoria{
        legendario, comun, raro, epico;
    };
    private enum lealtad{
        alta, media, baja;
    };
    private ArrayList<String> categ = new ArrayList<>();
    private ArrayList<String> leal= new ArrayList<>();
    private ArrayList<Integer> valorAtaque = new ArrayList<>();
    private ArrayList<Integer> valorDefensa = new ArrayList<>();
    private String tipoUsuario;
    private float precio;
    
    public Oferta() {
        this.validada = false;
    }
    
    public void crearOfertaArma(Arma arma){
        this.nombre = arma.getNombre();
        this.tipoEquipo= true;  
        if ("legendario".equals(arma.getCat())){
            categ.add("legendario");
            }
        if ("comun".equals(arma.getCat())){
            categ.add("comun");
            }
        if ("raro".equals(arma.getCat())){
            categ.add("raro");
            }
        if ("epico".equals(arma.getCat())){
            categ.add("epico");
            }
        valorAtaque.add(arma.getModAtaque());
        valorDefensa.add(arma.getModDefensa());
    }
    
    public void crearOfertaArmadura(Armadura armadura){
         this.tipoEquipo= true;  
        if ("legendario".equals(armadura.getCat())){
            categ.add("legendario");
            }
        if ("comun".equals(armadura.getCat())){
            categ.add("comun");
            }
        if ("raro".equals(armadura.getCat())){
            categ.add("raro");
            }
        if ("epico".equals(armadura.getCat())){
            categ.add("epico");
            }
        
        valorAtaque.add(armadura.getModAtaque());
        valorDefensa.add(armadura.getModDefensa());  
    }
    public void crearOfertaEsbirro(Esbirro esbirro){
        this.tipoEsbirro= true;    
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }   
}

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
public class Oferta implements java.io.Serializable{
    private boolean validada;
    private ArrayList<String> listaNombres = new ArrayList<>();
    private boolean tipoEsbirro= false;
    private boolean tipoEquipo= false;
    private enum categoria{
        legendario, comun, raro, epico, nulo;
    };
    private enum lealtad{
        alta, media, baja, nulo;
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
    
    public Oferta crearOfertaArma(Arma arma){
        listaNombres.add(arma.getNombre());
        this.tipoEquipo= true;  
        if ("legendario".equals(arma.getCat())){
            categ.add("legendario");
            }
        else if ("comun".equals(arma.getCat())){
            categ.add("comun");
            }
        else if ("raro".equals(arma.getCat())){
            categ.add("raro");
            }
        else if ("epico".equals(arma.getCat())){
            categ.add("epico");
            }
        valorAtaque.add(arma.getModAtaque());
        valorDefensa.add(arma.getModDefensa());
        leal.add("nulo");
        
        return this;
        
    }
    
    public Oferta crearOfertaArmadura(Armadura armadura){
        listaNombres.add(armadura.getNombre());
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
        leal.add("nulo");
        return this;
    }
    public void crearOfertaEsbirro(Esbirro esbirro){
        listaNombres.add(esbirro.getNombre());
        this.tipoEsbirro= true;  
        categ.add("nulo");
        valorAtaque.add(0);
        valorDefensa.add(0);
        if("humano".equals(esbirro.getTipoEsbirro())){
            if("ALTA".equals(esbirro.getHumano().loyalty)){
                leal.add("ALTA");
            }
            if("NORMAL".equals(esbirro.getHumano().loyalty)){
                leal.add("NORMAL");
            }
            if("BAJA".equals(esbirro.getHumano().loyalty)){
                leal.add("BAJA");
            }
            
        }
        
        
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public ArrayList getListaNombres() {
        return listaNombres;
    }

    public boolean isValidada() {
        return validada;
    }

    public void setValidada(boolean validada) {
        this.validada = validada;
    }

    public ArrayList<String> getCateg() {
        return categ;
    }

    public ArrayList<String> getLeal() {
        return leal;
    }

    public ArrayList<Integer> getValorAtaque() {
        return valorAtaque;
    }

    public ArrayList<Integer> getValorDefensa() {
        return valorDefensa;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public float getPrecio() {
        return precio;
    }
    
    
}

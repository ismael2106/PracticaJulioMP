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
    private ArrayList<String> valorAtaque = new ArrayList<>();
    private ArrayList<String> valorDefensa = new ArrayList<>();
    private ArrayList<String> listaElementos = new ArrayList<>();
    
    private String tipoUsuario;
    private float precio;
    
    public Oferta() {
        this.validada = false;
    }
    
    public Oferta crearOfertaArma(Arma arma){
        listaElementos.add("arma");
        listaNombres.add(arma.getNombre());
        this.tipoEquipo= true;  
        if ("legendario".equals(arma.getCat().name())){
            categ.add("legendario");
            }
        else if ("comun".equals(arma.getCat().name())){
            categ.add("comun");
            }
        else if ("raro".equals(arma.getCat().name())){
            categ.add("raro");
            }
        else if ("epico".equals(arma.getCat().name())){
            categ.add("epico");
            }
        valorAtaque.add(arma.getModAtaque());
        valorDefensa.add(arma.getModDefensa());
        leal.add("nulo");
        
        return this;
        
    }
    
    public Oferta crearOfertaArmadura(Armadura armadura){
        listaElementos.add("armadura");
        listaNombres.add(armadura.getNombre());
        this.tipoEquipo= true;  
        if ("legendario".equals(armadura.getCat().name())){
            categ.add("legendario");
            }
        if ("comun".equals(armadura.getCat().name())){
            categ.add("comun");
            }
        if ("raro".equals(armadura.getCat().name())){
            categ.add("raro");
            }
        if ("epico".equals(armadura.getCat().name())){
            categ.add("epico");
            }
        
        valorAtaque.add(armadura.getModAtaque());
        valorDefensa.add(armadura.getModDefensa());
        leal.add("nulo");
        return this;
    }
    public void crearOfertaEsbirro(Esbirro esbirro){
        listaElementos.add("esbirro");
        listaNombres.add(esbirro.getNombre());
        this.tipoEsbirro= true;  
        categ.add("nulo");
        valorAtaque.add("No tiene ya que es un esbirro");
        valorDefensa.add("No tiene ya que es un esbirro");
        if("humano".equals(esbirro.getTipoEsbirro().name())){
            if("alta".equals(esbirro.getHumano().loyalty.name())){
                leal.add("alta");
            }
            if("media".equals(esbirro.getHumano().loyalty.name())){
                leal.add("media");
            }
            if("baja".equals(esbirro.getHumano().loyalty.name())){
                leal.add("baja");
            }
            
        }else{
            leal.add("nulo");
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

    public ArrayList<String> getValorAtaque() {
        return valorAtaque;
    }

    public ArrayList<String> getValorDefensa() {
        return valorDefensa;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public float getPrecio() {
        return precio;
    }

    public ArrayList<String> getListaElementos() {
        return listaElementos;
    }
    
    
}

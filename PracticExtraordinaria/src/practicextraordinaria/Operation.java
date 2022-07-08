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
public abstract class Operation implements java.io.Serializable{
    public Usuario usuario;
    public Operador operador;
    

    public Operation(Usuario usuario) {
       this.usuario = usuario;
    }
}

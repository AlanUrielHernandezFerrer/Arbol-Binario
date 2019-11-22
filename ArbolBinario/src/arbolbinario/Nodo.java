/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Alan
 */
public class Nodo {
    protected int dato;
    protected  Nodo izo;
    protected  Nodo dcho;
    
    public Nodo(int dato){
    this.dato=dato;
    izo = dcho = null;
    }
    public Nodo(int dato, Nodo izquierdo , Nodo derecho){
    this.dato= dato;
    this.izo= izquierdo;
    this.dcho= derecho;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzo() {
        return izo;
    }

    public void setIzo(Nodo izo) {
        this.izo = izo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    
}

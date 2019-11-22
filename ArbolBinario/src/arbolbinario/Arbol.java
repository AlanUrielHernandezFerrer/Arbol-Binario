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
public class Arbol {
    private Nodo raiz;

    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }
     public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    void  agregar(Nodo nodo,Nodo raiz){
        if (raiz==null) {
            this.setRaiz(nodo);
            
        } else {
            if (nodo.getDato()<= raiz.getDato()) {
                if (raiz.getIzo()== null) {
                    raiz.setIzo(nodo);
                    
                } else {
                    agregar(nodo, raiz.getIzo());
                }
            }
            else{
                if (raiz.getDcho()==null) {
                    raiz.setDcho(nodo);
                    
                }else{
                    agregar(nodo, raiz.getDcho());
                }
            }
        }
        
    }
    public void agregarNodo(Nodo nodo){
        this.agregar(nodo, this.raiz);
        }
    public void recorrerPreOrden(Nodo nodo){
        if (nodo == null) {
            return;
            
        }else{
            System.out.println("Datos:"+nodo.getDato());
            recorrerPreOrden(nodo.getIzo());
            recorrerPreOrden(nodo.getDcho());
        }
    }
    public void recorrerPosOrden(Nodo nodo){
        if (nodo == null) {
            return;
            
        } else {
            
            recorrerPosOrden(nodo.getIzo());
            recorrerPosOrden(nodo.getDcho());  
            System.out.println("DatosPosorden"+nodo.getDato());
        }
    
    }
    public void recorrerInorden(Nodo nodo){
        if (nodo==null) {
            return;
            
        } else {
            recorrerInorden(nodo.getIzo());
            System.out.println("DatosInorden"+nodo.getDato());
            recorrerInorden(nodo.getDcho());
        }
    
    }
    
}

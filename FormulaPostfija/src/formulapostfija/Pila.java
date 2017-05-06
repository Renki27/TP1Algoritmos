/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

/**
 *
 * @author Emilio RH
 */
public class Pila {

    private Nodo ultimo = null;

    public Nodo getUltimo() {
        return ultimo;
    }
    
    public void insertar(String string) {
        Nodo nodo = new Nodo(string);
        nodo.setSiguiente(ultimo);
        ultimo = nodo;
    }

    public String retirar() {
        String string = "";
        if (!isEmpty()) {
            string = ultimo.getDato();
            this.ultimo = ultimo.getSiguiente();
        }

        return string;
    }

    public boolean isEmpty() {
        if (ultimo == null) {
//            System.out.println("\nLa pila está vacía");
            return true;
        }
        return false;
    }

 
    public int contar() {
        int contador = 0;
        Nodo temporal = this.ultimo;
        while (temporal != null) {
            contador++;
            temporal = temporal.getSiguiente();
        }
        return contador;
    }


    @Override
    public String toString() {
        String hilera = " ";
        Nodo nodo = this.ultimo;
        while (nodo != null) {
            hilera += nodo.toString();
            nodo = nodo.getSiguiente();

        }
        return hilera;
    }
}

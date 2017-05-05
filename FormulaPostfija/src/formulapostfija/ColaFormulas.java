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
public class ColaFormulas {

    private Nodo rear;
    private Nodo front;

    public void enqueue(char character) {
        Nodo nodo = new Nodo(character);
        nodo.setSiguiente(null);
        if (isEmpty()) {
            front = nodo;
            rear = nodo;
        } else {
            rear.setSiguiente(nodo);
            rear = rear.getSiguiente();
        }
    }

    public char dequeue() {
        char character = '0';
        if (!isEmpty()) {
            character = front.getDato();
            front = front.getSiguiente();
        }
        return character;
    }

    public boolean isEmpty() {
        boolean vacia = false;
        if ((front == null) && (rear == null)) {
            vacia = true;
        }
        return vacia;
    }

    public String printQueue() {
        String hilera = " ";
        Nodo temporal = this.front;
        while (temporal != null) {
            hilera += temporal.toString();
            temporal = temporal.getSiguiente();

        }
        return hilera;
    }
}

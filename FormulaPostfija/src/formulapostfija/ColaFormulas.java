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
    private int size = 0;

    public void enqueue(String string) {
        Nodo nodo = new Nodo(string);
        nodo.setSiguiente(null);
        if (isEmpty()) {
            front = nodo;
            rear = nodo;
            size++;
        } else {
            rear.setSiguiente(nodo);
            rear = rear.getSiguiente();
            size++;
        }
    }

    public String dequeue() {
        String string = "";
        if (!isEmpty()) {
            string = front.getDato();
            front = front.getSiguiente();
            size--;
        }
        return string;
    }
    
    public int getSize(){
        return this.size;
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

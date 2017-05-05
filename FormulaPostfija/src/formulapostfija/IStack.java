/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

/**
 * Interfaz para clase ArrayStack, hecha como parte del ejercicio.
 * @author Orlando Marín
 * @version 0.01
 */
public interface IStack {
    
    /**
     * Retorna el tamaño actual de la pila, desde su primer elemento hasta la cabeza.
     * @return tamaño actual del stack.
     */
    public int size();
    
    /**
     * Checa si la pila está vacía.
     * @return true si está vacío, false si no está vacío.
     */
    public boolean isEmpty();
    
    /**
     * Devuelve el valor en la cima sin removerlo.
     * @return valor en la cima.
     * @exception EmptyStackException si la pila está vacía.
     */
    public int top() throws EmptyStackException;
    
    /**
     * Añade un valor al tope de la pila.
     * @param dato valor entero a agregar a la pila.
     * @return entero del dato añadido a la pila
     * @exception IndexOutOfBoundsException si la pila estaba llena antes de intentar agregar un nuevo elemento.
     */
    public int push(int dato) throws IndexOutOfBoundsException;
    
    /**
     * Retorna y remueve el valor en la cima de la pila.
     * @return entero del dato añadido a la pila.
     * @exception EmptyStackException si la pila está vacía.
     */
    public int pop() throws EmptyStackException;
    
    /**
     * Construye una hilera a partir de todos los elementos significativos presentes en la pila.
     * @return Una cadena de texto con los elementos separados por un espacio.
     */
    public String print();
    
    /**
     * Excepción para peticiones de elementos a pilas vacías.
     */
    public static class EmptyStackException extends Exception {

        public EmptyStackException() {
        }
    }
}

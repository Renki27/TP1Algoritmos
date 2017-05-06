/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

import java.util.ArrayList;

/**
 *
 *
 * Implementación de una Clase Stack para arreglos de tamaño indefinido.
 *
 * @author Orlando Marín
 * @version 0.01
 */
public class AListStack implements IStack {

    private ArrayList<Integer> stack;

    /**
     * Constructor para una pila de un tamaño máximo por defecto 10.
     */
    public AListStack() {
        this.stack = new ArrayList<Integer>();
    }

    @Override
    public int size() {
        return this.stack.size();
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public int top() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack.get(this.size() - 1);
    }

    @Override
    public int push(int dato) throws IndexOutOfBoundsException {
        this.stack.add(dato);
        return dato;
    }

    @Override
    public int pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    @Override
    public String print() {
        String str = "";
        for (int i = 0; i < this.size(); i++) {
            str += this.stack.get(i) + " ";
        }
        return str;
    }
}

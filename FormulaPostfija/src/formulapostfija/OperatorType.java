/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

/**
 *
 * @author EJRH2
 */
public class OperatorType {
    
    private char operator;
    private int priority;

    public OperatorType() {
    }

    public OperatorType(char operator, int priority) {
        this.operator = operator;
        this.priority = priority;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return  "operator:  " + operator;
    }
    
    
    
}

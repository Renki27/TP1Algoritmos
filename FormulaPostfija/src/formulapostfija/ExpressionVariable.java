/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

/**
 *
 * @author Orlando
 */
public class ExpressionVariable {
    private char letter;
    private double value;
    private boolean set;
    
    public ExpressionVariable(char letter) {
        this.letter = letter;
        this.set = true;
    }
    public ExpressionVariable(char letter, double value) {
        this.letter = letter;
        this.value = value;
        this.set = true;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        this.set = true;
    }

    public boolean isSet() {
        return set;
    }
    
}

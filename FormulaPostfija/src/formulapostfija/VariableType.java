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
public class VariableType {
    
    private char variableLetter;
    private float value;

    public VariableType() {
    }

    public VariableType(char variableLetter, float value) {
        this.variableLetter = variableLetter;
        this.value = value;
    }

    public char getVariableLetter() {
        return variableLetter;
    }

    public void setVariableLetter(char variableLetter) {
        this.variableLetter = variableLetter;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Variable Letter:  " + variableLetter + "Value:  " + value;
    }
    
    
    
    
}

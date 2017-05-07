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
public class Operations {

    public double sqrt(double element) {
        double value = Math.sqrt(element);
        return value;
    }

    public double facto(double element) {
        double value = element;
        if (element == 0) {
            return 1;
        }
        for (double i = element - 1; i > 0; i--) {
            value *= i;
        }
        return value;
    }

    public double cos(double element) {
        return Math.cos(element);
    }

    public double sin(double element) {
        return Math.sin(element);
    }

    public double tan(double element) {
        return Math.tan(element);
    }

    public double divide(double x, double y) {
        return y / x;
    }

    public double multiply(double x, double y) {
        return y * x;
    }

    public double plus(double x, double y) {
        return y + x;
    }

    public double rest(double x, double y) {
        return y - x;
    }
    
    public double potencia(double a,double b){
        return Math.pow(a, b);
    }

}


    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

/**
 *
 * @author Erik (a+b)-10*2+(10+15)+2^2
 */
public class Expresion {
    
    Operations o = new Operations();
    Pila pila = new Pila();
    double total = 0.0;
    
    public double expresion(ColaFormulas cola){
       
        for (int i = 0; i < cola.getSize(); i++) {
      
            String dequeuse = cola.dequeue();

            if (numberValidation(dequeuse) == true) {

                pila.insertar(dequeuse);

            }
            
            if (dequeuse.compareTo("+") == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                double b = Double.parseDouble(""+pila.retirar());
                String result = ""+o.plus(a, b);
                pila.insertar(result);
            }
             if (dequeuse.compareTo("-") == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                double b = Double.parseDouble(""+pila.retirar());
                String result = ""+o.rest(a, b);
                pila.insertar(result);
            }
              if (dequeuse.compareTo("*") == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                double b = Double.parseDouble(""+pila.retirar());
                String result = ""+o.multiply(a, b);
                pila.insertar(result);
            }
               if (dequeuse.compareTo("/") == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                double b = Double.parseDouble(""+pila.retirar());
                String result = ""+o.divide(a, b);
                pila.insertar(result);
            }
                if (dequeuse.compareTo(ExpressionChecker.COS_STR) == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                String result = ""+o.cos(a);
                pila.insertar(result);
            }
                if (dequeuse.compareTo(ExpressionChecker.SIN_STR) == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                String result = ""+o.sin(a);
                pila.insertar(result);
            }
                if (dequeuse.compareTo(ExpressionChecker.TAN_STR) == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                String result = ""+o.tan(a);
                pila.insertar(result);
            }
                if (dequeuse.compareTo(ExpressionChecker.FACTO_STR) == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                String result = ""+o.facto(a);
                pila.insertar(result);
            }
                if (dequeuse.compareTo(ExpressionChecker.SQRT_STR) == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                String result = ""+o.sqrt(a);
                pila.insertar(result);
            }
                
                if (dequeuse.compareTo(ExpressionChecker.POTENCIA_STR) == 0) {
                double a = Double.parseDouble(""+pila.retirar());
                double b = Double.parseDouble(""+pila.retirar());
                String result = ""+o.potencia(a,b);
                pila.insertar(result);
            }
                
          }
        
        return Double.parseDouble(pila.retirar());
    

    }
    
    public boolean numberValidation(String cadena){
    
    try{
        
        Integer.parseInt(cadena);
        return true;
    
    }catch(NumberFormatException ex){
    
        return false;
    
    }
    
    }
    
    
}

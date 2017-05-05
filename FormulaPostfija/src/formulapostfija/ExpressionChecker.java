/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que se encarga de checar una hilera que representa una fórmula matemática, checando si está balanceada en términos de signos de apertura y cierre (paréntesis, llaves, etc).
 * @author Orlando Marín
 * @version 0.01
 */
public class ExpressionChecker {

    final static char SQRT_SIGN = '√';
    final static char FACTO_SIGN = '!';
    final static char SIN_SIGN = '´';
    final static char COS_SIGN = '`';
    final static char TAN_SIGN = '¨';
    
    private ExpressionChecker(){}
    
    public static String replaceParenthesis(String formula) {
        String result = new String(formula);
        result = result.replaceAll("\\[", "(");
        result = result.replaceAll("\\]", ")");
        result = result.replaceAll("\\{", "(");
        result = result.replaceAll("\\}", ")");
        return result;
    }
    
    public static String replaceBySigns(String formula) {
        String result = new String(formula);
        result = result.replaceAll("(?i)SQRT", ""+SQRT_SIGN);
        result = result.replaceAll("(?i)FACTO", ""+FACTO_SIGN);
        result = result.replaceAll("(?i)SIN", ""+SIN_SIGN);
        result = result.replaceAll("(?i)COS", ""+COS_SIGN);
        result = result.replaceAll("(?i)TAN", ""+TAN_SIGN);
        return result;
    }
    
    public static String replaceMinusByZeroMinusCase(String formula) {
        String result = new String(formula);
        result = result.replaceAll("\\(\\-","(0-");
        return result;
    }
    
    /**
     * Retorna si la expresión dada como parámetro tiene el número correspondiente de signos de apertura (paréntesis, etc) al número de signos de cierre, y en el orden adecuado.
     * @param formula El string con la fórmula o expresión a checar.
     * @return true si la expresión está balanceada. false en caso cotrario.
     */
    public static boolean checkParenthesis(String formula) {
        AListStack list = new AListStack();
        char[] charAry = formula.toCharArray();
        for(int i = 0; i < charAry.length; i++) {
            if (list.size() > 0) {
                try {
                    if (charAry[i] == ')' && list.top() == 1) {
                        list.pop();
                        continue;
                    }
                } catch (IStack.EmptyStackException ex) {
                    Logger.getLogger(ExpressionChecker.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (charAry[i] == ')') return false;
            }
            if( charAry[i] == '(' ) {
                list.push(1);
            } 
        }
        return list.isEmpty();
    }
    
    public static boolean checkLetters(String formula) throws InvalidExpressionException {
        if(formula.length() < 2) {
            return Character.isAlphabetic(formula.charAt(0));
        }
        for(int i = 1; i < formula.length()-1; i++) {
            char thisChar = formula.charAt(i);
            char nextChar = formula.charAt(i+1);
            boolean thisIsAlpha = Character.isLetter(thisChar) || Character.isDigit(thisChar);
            boolean nextIsAlpha = Character.isLetter(nextChar) || Character.isDigit(nextChar);
            
            if(thisIsAlpha == nextIsAlpha) {
                if(thisIsAlpha==true) {
                    if(Character.isLetter(thisChar) || Character.isLetter(nextChar)) throw new InvalidExpressionException("ERROR: Dos variables seguidas.");
                }else if(thisIsAlpha==false) {
                    //boolean doubleParenthesisCase = (thisChar == nextChar && (thisChar=='(' || thisChar==')'));
                    //if(! doubleParenthesisCase ) {
                        if(thisChar !=')' && nextChar !='(') {
                            if(nextChar=='-') { // si el segundo signo es un -
                                throw new InvalidExpressionException("ERROR: El operando '-' debe estar dentro de paréntesis.");
                            } else {
                                throw new InvalidExpressionException("ERROR: Expresión inválida, contiene errores de sintaxis.");
                            }
                        }
                    //} 
                } else throw new InvalidExpressionException("ERROR: Expresión inválida, contiene errores de sintaxis.");
            } else if(thisChar==')' || nextChar=='(') {
                throw new InvalidExpressionException("ERROR: Variable junto a paréntesis, necesita operando.");
            }
        }
        return true;
    }

    public static boolean checkSigns(String formula) {
        return true;
    }
}
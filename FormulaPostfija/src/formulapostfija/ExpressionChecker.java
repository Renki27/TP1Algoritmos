/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

import com.sun.xml.internal.ws.util.StringUtils;
import static java.lang.Character.isLetter;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase que se encarga de checar una hilera que representa una fórmula
 * matemática, checando si está balanceada en términos de signos de apertura y
 * cierre (paréntesis, llaves, etc).
 *
 * @author Orlando Marín
 * @version 0.01
 */
public class ExpressionChecker {

    final static char SQRT_SIGN = '√';
    final static char FACTO_SIGN = '!';
    final static char SIN_SIGN = '´';
    final static char COS_SIGN = '`';
    final static char TAN_SIGN = '¨';
    private ArrayList<String> variables = new ArrayList<>();

    public ExpressionChecker() {
    }

    public String replaceParenthesis(String formula) {
        String result = formula;
        result = result.replaceAll("[\\[\\{]+", "(");
        result = result.replaceAll("[\\]\\}]+", ")");

        return result;
    }

    public String replaceBySigns(String formula) {
        String result = formula;
        result = result.replaceAll("(?i)SQRT", "" + SQRT_SIGN);
        result = result.replaceAll("(?i)FACTO", "" + FACTO_SIGN);
        result = result.replaceAll("(?i)SIN", "" + SIN_SIGN);
        result = result.replaceAll("(?i)COS", "" + COS_SIGN);
        result = result.replaceAll("(?i)TAN", "" + TAN_SIGN);
        return result;
    }

    public String replaceMinusByZeroMinusCase(String formula) {
        String result = formula;
        result = result.replaceAll("\\(-", "(0-");
        result = result.replaceAll("^-","0-");
        return result;
    }

    /**
     * Retorna si la expresión dada como parámetro tiene el número
     * correspondiente de signos de apertura (paréntesis, etc) al número de
     * signos de cierre, y en el orden adecuado.
     *
     * @param formula El string con la fórmula o expresión a checar.
     * @return true si la expresión está balanceada. false en caso cotrario.
     */
    public boolean checkParenthesis(String formula) {
        AListStack list = new AListStack();
        char[] charAry = formula.toCharArray();
        for (int i = 0; i < charAry.length; i++) {
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
                if (charAry[i] == ')') {
                    return false;
                }
            }
            if (charAry[i] == '(') {
                list.push(1);
            }
        }
        return list.isEmpty();
    }

    public boolean checkLetters(String formula) throws InvalidExpressionException {
        if (formula.length() < 2) {
            char thisChar = formula.charAt(0);
            if(!Character.isLetter(thisChar) && !Character.isDigit(thisChar)) throw new InvalidExpressionException("ERROR: Signo inválido al inicio de expresión.");
        }
        char firstChar = formula.charAt(0);
        if(!Character.isLetter(firstChar) && !Character.isDigit(firstChar)) {
            if(firstChar != SQRT_SIGN || firstChar != SIN_SIGN || firstChar != COS_SIGN || firstChar != TAN_SIGN) {
                throw new InvalidExpressionException("ERROR: Signo inválido al inicio de expresión.");
            }
        }
        for (int i = 1; i < formula.length() - 1; i++) {
            char thisChar = formula.charAt(i);
            char nextChar = formula.charAt(i + 1);
            boolean thisIsAlpha = Character.isLetter(thisChar) || Character.isDigit(thisChar);
            boolean nextIsAlpha = Character.isLetter(nextChar) || Character.isDigit(nextChar);

            if (thisIsAlpha == nextIsAlpha) {
                if (thisIsAlpha == true) {
                    if (Character.isLetter(thisChar) || Character.isLetter(nextChar)) {
                        JOptionPane.showMessageDialog(null, "Dos variables seguidas.", "Error", JOptionPane.ERROR_MESSAGE);
                        throw new InvalidExpressionException("ERROR: Dos variables seguidas.");
                    }
                } else if (thisIsAlpha == false) {
                    //boolean doubleParenthesisCase = (thisChar == nextChar && (thisChar=='(' || thisChar==')'));
                    //if(! doubleParenthesisCase ) {
                    if (thisChar != ')' && nextChar != '(') {
                        if (nextChar == '-') { // si el segundo signo es un -
                            JOptionPane.showMessageDialog(null, "El operando '-' debe estar dentro de paréntesis.", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new InvalidExpressionException("ERROR: El operando '-' debe estar dentro de paréntesis.");
                        } else if(nextChar != SQRT_SIGN && nextChar != SIN_SIGN && nextChar != COS_SIGN && nextChar != TAN_SIGN) {
                            JOptionPane.showMessageDialog(null, "Expresión inválida, contiene errores de sintaxis", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new InvalidExpressionException("ERROR: Expresión inválida, contiene errores de sintaxis.");
                        }
                    }
                    //} 
                } else {
                    JOptionPane.showMessageDialog(null, "Expresión inválida, contiene errores de sintaxis", "Error", JOptionPane.ERROR_MESSAGE);
                    throw new InvalidExpressionException("ERROR: Expresión inválida, contiene errores de sintaxis.");

                }
            } else if (thisChar == ')' || nextChar == '(') {
                JOptionPane.showMessageDialog(null, "Variable junto a paréntesis, necesita operando.", "Error", JOptionPane.ERROR_MESSAGE);
                throw new InvalidExpressionException("ERROR: Variable junto a paréntesis, necesita operando.");
            }
        }
        return true;
    }

    public static boolean checkSigns(String formula) {
        return true;
    }

    public String operationFixer(String formula) {
        formula = formula.toUpperCase();
        formula = formula.replace("√", " √ ");
        formula = formula.replace("!", " ! ");
        formula = formula.replace("´", " ´ ");
        formula = formula.replace("`", " ` ");
        formula = formula.replace("¨", " ¨ ");
        formula = formula.replace("¨", " ¨ ");
        formula = formula.replace("¨", " ¨ ");
        formula = formula.replace("(", " ( ");
        formula = formula.replace(")", " ) ");
        formula = formula.replace("+", " + ");
        formula = formula.replace("-", " - ");
        formula = formula.replace("*", " * ");
        formula = formula.replace("/", " / ");
        formula = formula.replace("^", " ^ ");
        formula = formula.replaceAll("[A-Z](?=.)", "$0 ");
        formula = formula.replaceAll("\\s{2,}", " ").trim();

        return formula;
    }

    public ColaFormulas queueLoader(String formula) {
        String[] array = formula.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            char temp = str.charAt(0);
            if (Character.isLetter(temp)) {
                String value = JOptionPane.showInputDialog("Digite el valor de la variable " + temp);
                array[i] = value;
            }
        }
        ColaFormulas originalFormulaQueue = new ColaFormulas();
        for (String string : array) {
            originalFormulaQueue.enqueue(string);
        }
        return originalFormulaQueue;
    }

 
    public void colaFormulaPostfijaProcessor(ColaFormulas originalFormulaQueue) {
        ColaFormulas postfijaFormulaQueue = new ColaFormulas();
        Pila operatorsStack = new Pila();
        for (int i = 0; i < originalFormulaQueue.getSize(); i++) {
            String str = originalFormulaQueue.dequeue();
            char temp = str.charAt(0);
            if (Character.isDigit(temp)) {
                postfijaFormulaQueue.enqueue(str);
            }
            else {
                operatorsStack.insertar(str);
            }
        }

    }

}

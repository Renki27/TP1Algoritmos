/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

import javax.swing.JOptionPane;

/**
 *
 * @author Orlando
 */
public class FormulaParser {

    ColaFormulas originalFormulaQueue = new ColaFormulas();
    ExpressionChecker expressionChecker = new ExpressionChecker();

    public void parse(String formula) throws InvalidExpressionException {
        // Reemplaza las operaciones por sus signos.
        formula = expressionChecker.replaceParenthesis(formula);
        formula = expressionChecker.replaceBySigns(formula);
        formula = expressionChecker.replaceMinusByZeroMinusCase(formula);

        // Checa si la fórmula está balanceada (correcta disposición de paréntesis).
        if (expressionChecker.checkParenthesis(formula)
                && // Checa si hay paréntesis y letras juntas.
                expressionChecker.checkLetters(formula)) {
            formula = expressionChecker.operationFixer(formula);
            originalFormulaQueue = expressionChecker.queueLoader(formula);
            expressionChecker.colaFormulaPostfijaProcessor(originalFormulaQueue);

        } else {
            JOptionPane.showMessageDialog(null, "Expresión inválida, contiene errores de sintaxis", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    

}

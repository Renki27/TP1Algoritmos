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
public class FormulaParser {
    
    
    
    public void parse(String formula) throws InvalidExpressionException {
        // Reemplaza las operaciones por sus signos.
        formula = ExpressionChecker.replaceParenthesis(formula);
        formula = ExpressionChecker.replaceBySigns(formula);
        formula = ExpressionChecker.replaceMinusByZeroMinusCase(formula);
        // Checa si la fórmula está balanceada (correcta disposición de paréntesis).
        if( ExpressionChecker.checkParenthesis(formula) &&
                // Checa si hay paréntesis y letras juntas.
                ExpressionChecker.checkLetters(formula) &&
                // Checa si hay un - junto a otro signo.
                ExpressionChecker.checkSigns(formula) ) {
        }
        // Conseguir variables existentes
        System.out.println(formula); // TESTING
    }
    
}

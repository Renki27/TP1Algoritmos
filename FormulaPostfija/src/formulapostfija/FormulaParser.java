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
    ColaFormulas postfijaFormulaQueue;
    Expresion exp = new Expresion();
    ExpressionChecker expressionChecker = new ExpressionChecker();

    public String parse(String formula) throws InvalidExpressionException {
        // Reemplaza las operaciones por sus signos.
        formula = expressionChecker.replaceParenthesis(formula);
        formula = expressionChecker.replaceBySigns(formula);
        formula = expressionChecker.replaceMinusByZeroMinusCase(formula);
        // Checa si la fórmula está balanceada (correcta disposición de paréntesis).
        expressionChecker.checkParenthesis(formula);
        expressionChecker.checkLetters(formula);
        // Arreglo último de ciertas operaciones.
        formula = expressionChecker.operationFixer(formula);
        // Cola de fórmula original
        originalFormulaQueue = expressionChecker.queueLoader(formula);
        //Cola postfija
        postfijaFormulaQueue = expressionChecker.colaFormulaPostfijaProcessor(originalFormulaQueue);
        // Imprime fórmula postfija
        String result= "Formula Post Fija: \n";
        result += postfijaFormulaQueue.printQueue() + "\n";
        // Resultado de fórmula postfija.
        double resultVal = exp.expresion(postfijaFormulaQueue);
        result += "Resultado: " + resultVal;
        return result;
    }

}

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
<<<<<<< HEAD
=======
    Expresion exp = new Expresion();
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
    ExpressionChecker expressionChecker = new ExpressionChecker();

    public String parse(String formula) throws InvalidExpressionException {
        // Reemplaza las operaciones por sus signos.
        formula = expressionChecker.replaceParenthesis(formula);
        formula = expressionChecker.replaceBySigns(formula);
        formula = expressionChecker.replaceMinusByZeroMinusCase(formula);
        // Checa si la fórmula está balanceada (correcta disposición de paréntesis).
<<<<<<< HEAD
        if (expressionChecker.checkParenthesis(formula)) {
//                && // Checa si hay paréntesis y letras juntas.
//                expressionChecker.checkLetters(formula)) {
            formula = expressionChecker.operationFixer(formula);
            originalFormulaQueue = expressionChecker.queueLoader(formula);

            
            //Cola postfija
            postfijaFormulaQueue = expressionChecker.colaFormulaPostfijaProcessor(originalFormulaQueue);

            System.out.println(postfijaFormulaQueue.printQueue());

        } else {
            JOptionPane.showMessageDialog(null, "Expresión inválida, contiene errores de sintaxis", "Error", JOptionPane.ERROR_MESSAGE);
        }
=======
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
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
    }

}

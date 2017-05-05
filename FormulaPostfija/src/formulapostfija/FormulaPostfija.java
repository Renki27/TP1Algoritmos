/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Orlando
 */
public class FormulaPostfija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormulaParser parser = new FormulaParser();
         
        try {
            parser.parse("[SQRTa+(-55)] *bc-d(FACTOH) +SQRTR");
        } catch (InvalidExpressionException ex) {
            Logger.getLogger(FormulaPostfija.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
}

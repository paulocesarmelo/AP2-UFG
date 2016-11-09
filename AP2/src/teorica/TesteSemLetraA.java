/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class TesteSemLetraA {
    
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        
        try {
            ExemploExcecao.imprima(frase);
        } catch (SemLetraAException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}

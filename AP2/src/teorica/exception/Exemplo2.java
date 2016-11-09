/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.exception;

import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class Exemplo2 {
    
    public static void main(String[] args) {
        
        double n=0;
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n2: "));
        try{
            n = n1/n2;
            JOptionPane.showMessageDialog(null, n);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista10;

import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class Principal {
    public static void main(String[] args) {
       
        double temp = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura: "));
        
        JOptionPane.showMessageDialog(null,DicaFacade.obterDica(temp));
        
    }
}

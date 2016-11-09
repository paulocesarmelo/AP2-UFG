/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.exception;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class Exemplo1 {
    
    public static void main(String[] args) {
        
        String entrada;
        int idade;
       boolean flag=true;
        
       while(flag){
        
            entrada = JOptionPane.showInputDialog("Digite sua idade: ");
            try{
                idade = Integer.parseInt(entrada);
                idade = idade *2;
                System.out.println(idade);
                flag = false;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Isso não é um número");
            }
        
       }
        
        
        
    }
    
}

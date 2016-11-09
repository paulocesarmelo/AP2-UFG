/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista6;

/**
 *
 * @author PauloCésar
 */
public class TesteDivisao {
    public static void main(String[] args) {
        
        Divisao d = new Divisao();
        
        try{
            System.out.println(d.calcular(4, 0));
        }catch(ArithmeticException ex){
            System.out.println("Impossivel dividir por zero!");
        }
        
        System.out.println("Continuando o programa...");
        
    }
}

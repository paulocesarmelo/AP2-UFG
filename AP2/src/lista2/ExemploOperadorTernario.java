/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista2;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class ExemploOperadorTernario {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
        
        System.out.println((idade>=18)?"Maior":"Menor");
        
                
        int x = (idade>=18) ? idade*2 : idade*3;
    }
    
    //n = quantidade de termos da sequencia
    public String fibonacci(int n){
        String x="";
        if(n==0){
            return x;
        }else{ 
            fibonacci(n--);
        }
        
        System.out.println(n==0?x:fibonacci(n--));
        return null;
    }
}

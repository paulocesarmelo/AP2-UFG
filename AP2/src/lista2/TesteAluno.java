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
public class TesteAluno {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        Aluno a1 = new Aluno(123);
        
        a1.setNome("João");
        
        a1.imprimirPessoa();
        
        
    }

}

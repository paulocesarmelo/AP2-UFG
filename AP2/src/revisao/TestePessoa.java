/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

import java.util.Scanner;
import lista2.Pessoa;

/**
 *
 * @author PauloCésar
 */
public class TestePessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int x = input.nextInt();
        pessoa.setIdade(x);
        
        System.out.println(pessoa.verifClasseEleitoral());
        
        
    }
}

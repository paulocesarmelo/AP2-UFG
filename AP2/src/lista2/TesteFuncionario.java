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
public class TesteFuncionario {
    
    public static void main(String[] args){
        
        Funcionario f = new Funcionario();
        //Pessoa p = new Pessoa();
        
        f.setNome("Paulo");
        Scanner input = new Scanner(System.in);
        
//        System.out.println("Digite o nome: ");
//        f.nome = input.nextLine();
//        
//        System.out.println("Digite o rg: ");
//        f.rg = input.nextInt();
//        
//        System.out.println("Digite o salario: ");
//        f.sal = input.nextDouble();
//        
//        System.out.println("Digite o dpto: ");
//        f.depto = input.next();
//        
//        System.out.println("Digite o data: ");
//        f.data = input.next();        
        
        f.setNome("Paulo");
        f.setRg("1231DGPC");
        
        
        f.imprimirFuncionaio();
        
        
        System.out.println("\nCom aumento: \n");
        
        f.recebeAumento(5);
        
        f.imprimirFuncionaio();
        
        System.out.println("Ganho anual: \n"+f.calculaGanhoAnual());
        
    }
    
}

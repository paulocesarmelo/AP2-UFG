/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class TesteEmpregado {
    
    public static void main(String[] args) {
        Assalariado emp1 = new Assalariado();
        Comissionado emp2 = new Comissionado();
        Horista emp3 = new Horista();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = input.next();
        System.out.println("Sobrenome: ");
        String sobrenome = input.next();
        System.out.println("CPF: ");
        String cpf = input.next();
        
        System.out.println("O empregado é:");
        System.out.println("1- Assalariado");
        System.out.println("2- Comissionado");
        System.out.println("3- Horista");
        int opcao = input.nextInt();
        
        switch(opcao){
            case 1:
               emp1.setNome(nome);
               emp1.setSobrenome(sobrenome);
               emp1.setCpf(cpf);
                
               System.out.println("Informe o salario: ");
               emp1.setSalario(input.nextDouble());
               
                System.out.println(emp1.toString());
               
               break;
            case 2:
                emp2.setNome(nome);
                emp2.setSobrenome(sobrenome);
                emp2.setCpf(cpf);
                
                System.out.println("Total vendas: ");
                emp2.setTotalVendas(input.nextDouble());
                System.out.println("Taxa comissão: ");
                emp2.setTaxaComissao(input.nextDouble());
                
                System.out.println("Salario: "+emp2.vencimento());
                System.out.println(emp2.toString());
                break;
            default:
                System.out.println("Valor invalido");
        }
        
    }
    
}

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
public class TesteAgenda {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a capacidade agenda: ");
        int capacidade = input.nextInt(); //declarei uma variavel e inicializei
        
        Agenda agenda = new Agenda(capacidade);
        
        // 1º Criar um objeto pessoa
        // 2º preencher os atributos de pessoa
        // 3º Inserir essa pessoa na agenda
        Pessoa p1 = new Pessoa();
        p1.setNome("Fulano");
        p1.setCpf("038378383");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Beltrano");
        p2.setCpf("0334357343");
        
        agenda.armazenarPessoa(p1);
        agenda.armazenarPessoa(p2);
        
        System.out.println();
        agenda.imprimirAgenda();
        System.out.println();
        
        agenda.imprimirPessoa("0334357343");
    }
    
}

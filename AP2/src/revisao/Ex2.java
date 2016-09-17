/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class Ex2 {
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        
        String[] nomes = new String[10];
        String nomeBusca;
        
        for(int i=0; i<10; i++){
            System.out.println("Nome "+(i+1));
            nomes[i] = input.next();
        }
        
        System.out.println("Informe o nome para busca: ");
        nomeBusca = input.next();
        
        int controle = 0;
        boolean achei = false;
        
        for(int i=0; i<10; i++){            
            // if(nomes[i] == nomesBusca)
            if(nomes[i].equals(nomeBusca)){
                System.out.println("Nome encontrado!");
                controle = 1;
                achei = true;
                break;
            }            
        }
        
        if(!achei){
            System.out.println("Nome NÃO encontrado!");
        }
        
        if(controle == 0){
            System.out.println("Nome NÃO encontrado!");
        }
        
    }
}

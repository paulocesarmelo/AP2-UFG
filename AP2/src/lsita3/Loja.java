/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lsita3;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class Loja {
    public static void main(String[] args){
        
        CD[] cds = new CD[5];
        Livro[] livros = new Livro[5];
        DVD[] dvds = new DVD[5];
        int i=0, j=0, k=0;
        
        Produto[] produtos= new Produto[5];
        
        Scanner input = new Scanner(System.in);
        
        int opcao;
        
        opcao = input.nextInt();
        
        switch(opcao){
            case 1: 
                CD cd1 = new CD();
                cd1.setNome(input.next());
                cd1.setPreco(input.nextDouble());
                cd1.setNFaixa(input.nextInt());
                produtos[i++] = cd1;
                break;
            case 2:
                DVD dvd1 = new DVD();
                //...
                produtos[i++] = dvd1;
                break;
            case 3:
                break;
            default:                  
                
        }
        
        for(int l=0; l<i; l++){
            cds[l].imprimir();            
        }      
        
        
    }
}

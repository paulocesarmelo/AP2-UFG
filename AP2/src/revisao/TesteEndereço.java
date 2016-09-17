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
public class TesteEndereço {
    
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    String cep = input.next();
    Endereço endereço = new Endereço(cep);
     
    endereço.setRua(input.next());
    endereço.setCidade(input.next());
    
    endereço.imprimirEndereço();
    }
    
}

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
public class TesteVenda {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Empresa empresa = new Empresa();
        Cliente cliente = new Cliente();
        Empregado empregado = new Empregado();
        
        System.out.println("Informe o cnpj da empresa: ");
        empresa.setCnpj(input.next());
        
        
        
        
    }
    
}

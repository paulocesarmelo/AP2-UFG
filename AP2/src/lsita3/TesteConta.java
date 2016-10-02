/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lsita3;

/**
 *
 * @author PauloCésar
 */
public class TesteConta {
    public static void main(String[] args) {
        
        ContaEspecial ce = new ContaEspecial();
        ContaPoupanca cp = new ContaPoupanca();
        
        ce.setSaldo(2000);
        cp.setSaldo(1000);
        
        ce.setLimite(500);
        
        ce.sacar(3500);
        cp.sacar(1500);
        
        System.out.println("Conta poupança: ");
        cp.imprimirConta();
        
        System.out.println("Conta especial: ");
        ce.imprimirConta();
        
        ce.transferir(cp, 10);
    }
}

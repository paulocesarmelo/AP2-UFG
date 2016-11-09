/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista2;

/**
 *
 * @author PauloCésar
 */
public class TesteConta {
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        
        c1.setSaldo(100);
        
        try{
            c1.sacar(200);
            System.out.println(c1.getSaldo());
            System.out.println("Saque realizado!");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
}

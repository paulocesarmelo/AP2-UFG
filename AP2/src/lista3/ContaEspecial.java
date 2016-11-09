/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista3;

import lista2.Conta;

/**
 *
 * @author PauloCésar
 */
public class ContaEspecial extends Conta {
    
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(int valor){
        
        double saldoAtual = getSaldo();
        
        if( valor > saldoAtual +limite){
            System.out.println("Saldo insuficiente!");
        }else {
            saldoAtual = saldoAtual - valor;
            
            setSaldo(saldoAtual);
            
            if(saldoAtual < 0)
                limite = limite + saldoAtual;
        }
        
    }
    
}

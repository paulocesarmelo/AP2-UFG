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
public class Produto {
    
    private String nome;
    private double preco;

    public Produto(){}
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
        
    
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    public void imprimir(){
        System.out.println("Produto{" + "nome=" + nome + ", preco=" + preco + '}');
    }
    
}

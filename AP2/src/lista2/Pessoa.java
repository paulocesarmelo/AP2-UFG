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
public class Pessoa {
    
    private String nome, cpf, genero, rg;

    public Pessoa(String nome, String cpf, String genero, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.rg = rg;
    }

    public Pessoa(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
    }
    
    
}

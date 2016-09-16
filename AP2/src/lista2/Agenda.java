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
public class Agenda {
    
    //private String[] nomes;
    //private String[] cpfs;
    
    private Pessoa[] pessoas; //???????????
    private int i=0;
    private int totalPessoas;
    
    //construtor padrão
    public Agenda(){
        totalPessoas=250;
        pessoas = new Pessoa[totalPessoas]; //definiçao do tamanho de um vetor
    }
    
    //construtor personalizado
    public Agenda(int qtd){
        totalPessoas = qtd;
        pessoas = new Pessoa[totalPessoas];
    }
    
    public void armazenarPessoa(Pessoa pessoa){
        if(i < totalPessoas){
            pessoas[i] = pessoa;
            i++;
        }else{
            System.out.println("Espaço insuficiente!");
        }
    }
    
    // Apresentar solução mais correta
    public void removerPessoa(Pessoa pessoa){
        
        int posicaoRemovida = buscarPessoa(pessoa);
        
        if(posicaoRemovida != -1){
            pessoas[posicaoRemovida] = new Pessoa("", "", "", "");
            //... reorganizar o vetor
        }else{
            System.out.println("Pessoa não encontrada!");
        }
        
    }
    
    public int buscarPessoa(Pessoa pessoa){
        String cpfArmazenado;
        
        for(int j=0; j<i; j++){
            cpfArmazenado = pessoas[j].getCpf();
            
            if( cpfArmazenado.equals(pessoa.getCpf()) ){ // == equivale .equals()
                return j; //pessoas[j] representa um obj pessoa
            }
        }
        
        return -1;
    }
    
    public Pessoa buscarPessoa(String cpf){
        String cpfArmazenado;
        
        for(int j=0; j<i; j++){
            cpfArmazenado = pessoas[j].getCpf();
            
            if( cpfArmazenado.equals(cpf) ){ // == equivale .equals()
                return pessoas[j]; //pessoas[j] representa um obj pessoa
            }
        }
        
        return null;
        
    }
    
    //Imprimir somente uma pessoa
    public void imprimirPessoa(String cpf){        
        Pessoa p = buscarPessoa(cpf);
        p.imprimirPessoa();        
    }
    
    public void imprimirAgenda(){
        
        for(int j=0; j<i; j++){
            if( !pessoas[j].getNome().equals("") )
                pessoas[j].imprimirPessoa();
        }
        
    }
}


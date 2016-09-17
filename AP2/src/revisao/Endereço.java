/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

/**
 *
 * @author PauloCésar
 */
public class Endereço {
    
    private String rua, cep, cidade, bairro;
    private int quadra, numero;
    
    public Endereço(){}
    public Endereço(String cep){
    this.cep = cep;}

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getQuadra() {
        return quadra;
    }

    public void setQuadra(int quadra) {
        this.quadra = quadra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void imprimirEndereço(){
        System.out.println("Rua: "+rua);
        //System.out.println("Quadra: "+quadra);
        System.out.println("Cep: "+cep);
        System.out.println("Cidade: "+cidade);
        
    }
}

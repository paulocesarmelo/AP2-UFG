/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista3;

/**
 *
 * @author PauloCésar
 */
public class CD extends Produto {
        
    private int nFaixa;
    
    public CD(){
        nFaixa = 15;
    }
    
    public CD(String nome, double preco, int nFaixa){
        super(nome, preco); // new Produto(nome, preco)
        this.nFaixa = nFaixa;
    }
    
    public int getNFaixa(){
        return nFaixa;
    }
    
    public void setNFaixa(int nFaixa){
        this.nFaixa = nFaixa;
    }

    @Override
    public String toString() {
        return super.toString() + "CD{" + "nFaixa=" + nFaixa + '}';
    }
        
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("nFaixa = "+nFaixa);
    }
}

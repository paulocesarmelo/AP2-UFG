/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica;

/**
 *
 * @author PauloCésar
 */
public class Comissionado extends Empregado{

    private double totalVendas, taxaComissao;

    public Comissionado(){}
    
    public Comissionado(double totalVendas, double taxaComissao, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }    
    
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public double vencimento() {
        return 880 + totalVendas*taxaComissao;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTotal Vendas: "+this.totalVendas + "\nTaxa de Comissao: "+this.taxaComissao;
    }
}

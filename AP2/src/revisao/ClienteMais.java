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
public class ClienteMais extends Cliente{
    
    private double taxaDesc;
    private String tipo;

    public double getTaxaDesc() {
        return taxaDesc;
    }

    public void setTaxaDesc(double taxaDesc) {
        this.taxaDesc = taxaDesc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}

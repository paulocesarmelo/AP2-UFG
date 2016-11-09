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
public class Empresa {
    private String cnpj;
    private Data abertura;
    private Cliente[] clientes;
    private Empregado[] empregados;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Data getAbertura() {
        return abertura;
    }

    public void setAbertura(Data abertura) {
        this.abertura = abertura;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Empregado[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Empregado[] empregados) {
        this.empregados = empregados;
    }
    
    
    
}

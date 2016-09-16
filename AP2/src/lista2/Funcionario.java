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
public class Funcionario extends Pessoa{
    
    private String depto, data;
    private double sal;

    public Funcionario(String nome){
        super.setNome(nome);
    }
    
    public Funcionario(String nome, String cpf, String genero, String rg){
        super(nome, cpf, genero, rg);
    }
    
    
    public Funcionario(){}
    
    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }    
    void recebeAumento(int porcentagem){
        sal = sal + (sal * porcentagem/100);
    }
    
    double calculaGanhoAnual(){
        return sal * 12;
    }
    
    void imprimirFuncionaio(){                
        
        super.imprimirPessoa();        
        System.out.println("Depto: "+depto);
        System.out.println("Salario: "+sal);
        System.out.println("Entrada: "+data);
        
        
    }
    
    
    
}


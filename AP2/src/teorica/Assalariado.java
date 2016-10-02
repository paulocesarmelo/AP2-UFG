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
public class Assalariado extends Empregado{

    private double salario;
    
    public Assalariado(){}
    
    public Assalariado(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }
    
    @Override
    public double vencimento() {        
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nSalario: "+this.salario;
    }
    
}

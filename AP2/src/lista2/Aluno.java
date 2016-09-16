package lista2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PauloCésar
 */
public class Aluno extends Pessoa{
   
    private int matricula=0;
    
    public Aluno(){
        matricula++;
    }
    
    public Aluno(int matricula){
        this.matricula = matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void imprimirAluno(){
        super.imprimirPessoa();
        System.out.println("Matricula: "+this.matricula);        
    }
}

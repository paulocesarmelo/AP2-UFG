/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

import lista2.Pessoa;

/**
 *
 * @author PauloCésar
 */
public class Academico extends Pessoa{
    
   private String matricula;
   private double[] notas = new double [3];
   private double media = 0;

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setMedia(double media) {
        this.media = media;
    }


   
public Academico(String matricula){
this.matricula = matricula;}

 public Academico(String nome, String cpf, String genero, String rg, String matricula){
 super(nome, cpf, genero, rg);
 this.matricula = matricula;
 }

 public Academico(){
 }
int i = 0;
 public void addNota (double nota){
 if (i < 3){
 notas[i] = nota;
 i++;
 } else{
     System.out.println("Vetor completo!");}
 }
 
 public void calcularMedia (){
 for (int j= 0; j < 3; j++){
     media = media + notas[j];
 }
 media = media/i;
 }
 
 public boolean aprovado(){
 if (media >= 60 ){
     return true;
 } else {
 return false;
 }
 }
 public void imprimirAcademico(){
     System.out.println("Nome: "+getNome());
     System.out.println("matricula: "+matricula);
     for (int i = 0; i < 3; i++){
     System.out.println("Nota[i]: "+notas[i]);
     }
 }
 
}

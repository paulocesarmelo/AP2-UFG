/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class TesteAcademico {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Academico aluno = new Academico("Fulano","0000000","masc","123","321");
    
        for (int i = 0; i < 3; i++){
            System.out.println("Nota"+i+": ");
    aluno.addNota(input.nextDouble());
        }
    
        aluno.calcularMedia();
        
        if (aluno.aprovado()){
            System.out.println("Aprovado! Media: "+aluno.getMedia());
        }else {
            System.out.println("Reprovado! Media: "+aluno.getMedia());
        }
    aluno.imprimirAcademico();
    }
    
}

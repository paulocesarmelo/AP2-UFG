/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.manipulacaoArquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author PauloCésar
 */
public class TesteEntrada2 {
    public static void main(String[] args) {
        try{
            
            InputStream is = new FileInputStream("ap2.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            String[] dados = new String[4];
            
            String b = br.readLine();
            
            dados = b.split(";");
            
            while(b != null){
                System.out.println("Disciplina: "+dados[0]);
                System.out.println("Prof: "+dados[1]);
                System.out.println("Alunos: "+dados[2]);
                b = br.readLine();
                dados = b.split(";");
            }
            
            System.out.println(b);
            
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.manipulacaoArquivos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author PauloCésar
 */
public class TesteSaida2 {
    public static void main(String[] args) {
        try{
        
            OutputStream os = new FileOutputStream("ap2-saida.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.write("Teste saida!");
            bw.newLine();
            bw.write("Alguma coisa!\n");
            bw.close();
            
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

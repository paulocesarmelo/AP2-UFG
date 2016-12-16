/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.manipulacaoArquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PauloCésar
 */
public class TesteEntrada {
   
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("teste.txt");            
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            String b = br.readLine();
            
            while(b != null){
                String[] temp = new String[3];
                //System.out.println(b);                
                temp = b.split(";");
                
                //System.out.println(Arrays.toString(temp));
                System.out.println(temp[2]);
                b = br.readLine();
            }            
            
            br.close();
        } catch (IOException ex) {            
            System.out.println("Arquivo invalido!");
        }
    }
    
}

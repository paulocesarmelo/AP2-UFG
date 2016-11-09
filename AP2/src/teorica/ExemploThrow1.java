/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PauloCésar
 */
public class ExemploThrow1 {
    
    public static void main(String[] args) {
        
        try{
            funcao1();            
        
        
            
        }catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }finally{            
            try {
                funcao2();
            } catch (IOException ex) {
                Logger.getLogger(ExemploThrow1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }
    
    public static void funcao1() throws RuntimeException{
        throw new RuntimeException("Deu erro!");
    }
    
    public static void funcao2() throws IOException{
        
            throw new IOException("Erro funcao 2");
        
    }
    
    public static void funcao3() throws Exception{
        throw new Exception("Erro funcao 3");
    }
}

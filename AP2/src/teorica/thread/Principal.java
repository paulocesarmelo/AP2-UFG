/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.thread;

/**
 *
 * @author PauloCésar
 */
public class Principal {
    
    public static void main(String[] args) {
        GeraPDF pdf = new GeraPDF();
        
        BarraProgresso barra = new BarraProgresso();
        barra.start();
        new Thread(pdf).start();
                
        
        
        
        
    }
}

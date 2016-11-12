/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author PauloCésar
 */
public class Principal {
    
    public static void main(String[] args) {
        GeraPDF pdf = new GeraPDF();        
      
        BarraProgresso barra = new BarraProgresso();
        barra.setPriority(Thread.MAX_PRIORITY);
        barra.start();
        Thread t1 = new Thread(pdf);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        
        
        
        
    }
}

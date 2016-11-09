/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PauloCésar
 */
public class BarraProgresso extends Thread{
    
    public void inicia(){
        for(int i=0; i<1000; i++)
            System.out.println("Barra de progresso...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BarraProgresso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     @Override
    public void run(){
        inicia();
        
    }
}

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
public class Deposito {
    
    int qtd = 0;
    
    public synchronized void set(int n){
        System.out.println("Inserindo ...");
        qtd += n;
        notifyAll();
    }
    
    public synchronized int get(){
        while(qtd <= 0){
            try {            
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Deposito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Removendo...");
        qtd--;
        notifyAll();
        return qtd;        
    }
    
    public synchronized void imprimir(){
        //faz alguma coisa
        notifyAll();
    }
    
}

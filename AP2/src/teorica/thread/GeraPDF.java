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
public class GeraPDF implements Runnable{
    
    public void inicia(){
        for(int i=0; i<1000; i++)
            System.out.println("Gerando pdf...");
    }
    
    @Override
    public void run(){
        inicia();
        
    }
    
}

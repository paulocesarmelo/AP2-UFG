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
public class Produtor implements Runnable{

    private Deposito dep;
    
    public Produtor(Deposito d){
        dep = d;
    }
    
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            dep.set(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Produtor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

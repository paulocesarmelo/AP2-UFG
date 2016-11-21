/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista9Correcao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PauloCésar
 */
public class Tempo {
    
    private int hora=0, min=0, seg=0;
    private boolean h=false, m=false, s=true;
            
    public synchronized void contaHora(){
        while(true){
           // System.out.println("Hora...");
            if(h){
                hora++;
                
                if(hora == 24){
                    hora=0;
                    s=true;                    
                }
                notifyAll();
            }
            h=false;
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public synchronized void contaMin(){
        while(true){
            //System.out.println("Minutos...");
            if(m){
                min++;
                
                if(min==60){
                   min = 0;
                   h = true;                   
                }
                notifyAll();
            }
            m=false;
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public synchronized void contaSeg(){
       while(true){
          // System.out.println("Segundos...");
            seg++;
            
            if(seg==60){
                seg=0;
                m=true;
                notifyAll();                
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           System.out.println(hora+":"+min+":"+seg);
       }
    }
    
}

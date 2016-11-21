/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PauloCésar
 */
//Classe compartilhada entre threads
public class Tempo {
    
    private int h=0, m=0, s=0;
    private boolean hora=false, min=false;
    
    public synchronized void contaHora(){
        while(true){
            System.out.println("hora");
            if(hora){
                h++;
                if(h == 24){
                    h=0;                                    
                }
                hora=false;
                notifyAll();   
            }
            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Relogio2.class.getName()).log(Level.SEVERE, null, ex);
            }
             System.out.println("hora acordou");
            //System.out.println(h+":"+m+":"+s);
        }
    }
    
    public synchronized void contaMinutos(){
        //contaHora();
        while(true){
            System.out.println("minutos");
            if(min){
                m++;
                if(m == 60){
                    m=0;
                    hora=true;
                }
                
                min=false;
                notifyAll(); 
            }
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Relogio2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("minuto acordou");
            //System.out.println(h+":"+m+":"+s);
        }
    }
    
    public synchronized void contaSegundos(){
        //contaMinutos();
        while(true){
            s++;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Relogio2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(s == 60){
                s=0;
                min=true;
                notifyAll();                
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
            System.out.println(h+":"+m+":"+s);
        }
    }
}

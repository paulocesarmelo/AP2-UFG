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
public class Relogio implements Runnable{

    private int hora=0, min=0, seg=0;

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }
    
    @Override
    public void run() {        
        while(true){
            seg++;
            if(seg==60){
                seg = 0;
                min++;
                if(min == 60){
                    min = 0;
                    hora++;
                    if(hora == 24){
                        hora =0 ;
                    }
                }
            }
            System.out.println(hora+":"+min+":"+seg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Relogio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

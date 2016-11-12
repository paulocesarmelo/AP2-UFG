/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PauloCésar
 */
public class Relogio implements Runnable{

    private ContadorHora ch;
    private ContadorMin cm;
    private ContadorSeg cs;

    public Relogio(){}
    
    public Relogio(ContadorHora ch, ContadorMin cm, ContadorSeg cs) {
        this.ch = ch;
        this.cm = cm;
        this.cs = cs;
    }
    
    @Override
    public void run() {
        int horaAtual;
        while(true){        
            ContadorHora.contaHora();
            horaAtual = ContadorHora.getHora();
            if(horaAtual == 24){
                ContadorHora.setHora(0);
            }
            System.out.println(horaAtual);
            
            
            try {
                Thread.sleep(3600*1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Relogio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

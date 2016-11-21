/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista9;

import java.util.logging.Level;
import java.util.logging.Logger;
import lista8.ContadorHora;

/**
 *
 * @author PauloCésar
 */
public class Relogio2 implements Runnable{
    private int id;
    private Tempo t;
    
    public Relogio2(Tempo t, int id){
        this.id=id;
        this.t = t;
    }
    
    @Override
    public void run() {
        if(id==0)
            t.contaSegundos();  
        else if(id==1)
            t.contaMinutos();
        else if(id==2)
            t.contaHora();
    }
    
}

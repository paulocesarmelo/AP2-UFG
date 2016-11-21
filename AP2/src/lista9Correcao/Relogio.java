/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista9Correcao;

/**
 *
 * @author PauloCésar
 */
public class Relogio implements Runnable{

    private Tempo tempo;
    private int id;
    
    public Relogio(Tempo tempo, int id){
        this.tempo = tempo;
        this.id = id;
    }
    
    @Override
    public void run() {
        if(id==1)
            tempo.contaHora();
        else if(id==2)        
            tempo.contaMin();
        else if(id==3)
            tempo.contaSeg();
    }
    
}

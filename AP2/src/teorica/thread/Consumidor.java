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
public class Consumidor implements Runnable{
    
    private Deposito dep;
    
    public Consumidor(Deposito d){
        dep = d;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(dep.get());
        }
    }
    
}

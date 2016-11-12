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
public class TestProdutorConsumidor {
    public static void main(String[] args) {
        
        Deposito dep = new Deposito();
        
        Produtor p1 = new Produtor(dep);
        Consumidor c1 = new Consumidor(dep);
        
        Thread tProdutor = new Thread(p1);
        Thread tConsumidor = new Thread(c1);
        tConsumidor.setPriority(Thread.MAX_PRIORITY);
        tProdutor.start();
        tConsumidor.start();
                
    }
}

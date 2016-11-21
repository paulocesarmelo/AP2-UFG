/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.aulaDesignPattern;

/**
 *
 * @author PauloCésar
 */
public class TesteSingleton {
    
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s.algo();
        
        s2.algo();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista8;

/**
 *
 * @author PauloCésar
 */
public class Ex1 {
    public static void main(String[] args) {
        Relogio r = new Relogio();
        Thread tRelogio = new Thread(r);
        
        tRelogio.start();
    }
    
}

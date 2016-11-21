/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista9Correcao;

import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class Principal {
    public static void main(String[] args) {
        
        Tempo t = new Tempo();
        
        Relogio r1 = new Relogio(t,1);
        Relogio r2 = new Relogio(t,2);
        Relogio r3 = new Relogio(t,3);
        
        Thread tr1 = new Thread(r1);
        Thread tr2 = new Thread(r2);
        Thread tr3 = new Thread(r3);
        
        tr1.start();
        tr2.start();
        tr3.start();
        
        JOptionPane.showMessageDialog(null, "Relógio iniciado!");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista9;

import lista9.Relogio2;
import javax.swing.JOptionPane;
import lista9.Tempo;

/**
 *
 * @author PauloCésar
 */
public class TesteRelogio {
    public static void main(String[] args) {
        
        Tempo t = new Tempo();
        
        Relogio2 seg = new Relogio2(t, 0);
        Relogio2 min = new Relogio2(t, 1);
        Relogio2 hora = new Relogio2(t, 2);
        
        Thread tseg = new Thread(seg);
        Thread tmin = new Thread(min);
        Thread thora = new Thread(hora);
        
        tseg.start();
        tmin.start();
        thora.start();
        
        
        JOptionPane.showMessageDialog(null,"Relógio iniciado!");
        
    }
}

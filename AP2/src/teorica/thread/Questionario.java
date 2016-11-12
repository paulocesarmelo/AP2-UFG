/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.thread;

import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class Questionario {
    public static void main(String[] args) {
        Relogio r = new Relogio();
        Thread threadRelogio = new Thread(r);
        
        threadRelogio.start();
        
        String resp1 = JOptionPane.showInputDialog("Você entendeu Thread?");
        String resp2 = JOptionPane.showInputDialog("Você entendeu Thread?");
        
        threadRelogio.stop();
        
        JOptionPane.showMessageDialog(null, "Tempo de resposta: \n"+r.getHora()+":"+r.getMin()+":"+r.getSeg());
        
    }
}

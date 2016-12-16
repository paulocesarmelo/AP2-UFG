/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.manipulacaoArquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PauloCésar
 */
public class TesteSauda {
    public static void main(String[] args) {
        
        try {
            String nomeArq=JOptionPane.showInputDialog("Nome do arquivo:");
            File file = new File(nomeArq+".txt");
            
            OutputStream os = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.write("");
            bw.newLine();
            bw.write("AP2");
            
            
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(TesteSauda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

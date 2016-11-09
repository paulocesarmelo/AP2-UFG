/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.aulainterface;

/**
 *
 * @author PauloCésar
 */
public class ClasseX extends PaiX implements InterfaceX {

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void dobroX(){
        int n = super.getX();
        System.out.println(n*n);
    }
    
    public static void m5(){
        
    }    
}

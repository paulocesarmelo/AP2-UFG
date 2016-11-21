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
public final class Singleton {
    
    private final static Singleton instance = new Singleton();
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        return instance;
    }
    
    public void algo(){
        System.out.println("aaa");
    }
    
    
}

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
public class ThreadSimples extends Thread{
    private String nome;
    
    public ThreadSimples(String nome){
        this.nome = nome;
    }
    
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("i : "+nome);
        }
        System.out.println("Done: "+nome);
            
    }
}

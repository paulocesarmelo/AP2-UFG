/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.exception;

/**
 *
 * @author PauloCésar
 */
public class TesteErro {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }
    
    public static void metodo1(){
        System.out.println("inicio metodo 1");        
        metodo2();        
        System.out.println("fim metodo 1");
    }
    
    public static void metodo2(){
        System.out.println("inicio metodo 2 ");
        
        int[] vet = new int[10];
        for(int i=0; i<=11; i++){            
            try{
                vet[i]=i;
            }catch(Exception ex){
                ex.printStackTrace();
            }           
            
            System.out.println(i);
        }
        System.out.println("fim do metodo 2");
        
    }
}

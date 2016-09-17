/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class Ex1 {
 
    public static void main(String[] args){
        
        int X[] = new int[10];
        int Y[] = new int[10];
        int Z[] = new int[10];
        
        Scanner input = new Scanner(System.in);
        int a;
        
        for(int i=0; i<10; i++){
            System.out.println("Vetor X: ");
            X[i] = input.nextInt();
            System.out.println("Vetor Y: ");
            Y[i] = input.nextInt();            
        }
        
        for(int i=0; i<10; i++){
            Z[i] = X[i] - Y[i];
            System.out.print("["+Z[i]+"] ");
        }
        
        
    }
    
}

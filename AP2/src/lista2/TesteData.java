/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista2;

import java.util.Scanner;

/**
 *
 * @author PauloCésar
 */
public class TesteData {
   
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int diaTemp, mesTemp, anoTemp;
        
        System.out.println("Informe a data atual: dd mm aaaa");
        diaTemp = input.nextInt();
        mesTemp = input.nextInt();
        anoTemp = input.nextInt();
        
        Data dtAtual = new Data(diaTemp, mesTemp, anoTemp);
        
        System.out.println("\nData Atual\n");
        dtAtual.imprimirData();
        
        System.out.println("Mês atual: "+dtAtual.mes);
        
    }
    
}

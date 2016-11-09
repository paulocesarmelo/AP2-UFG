/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.strings;

/**
 *
 * @author PauloCésar
 */
public class Exemplo {
    public static void main(String[] args) {
        String texto1 = new String("Algoritmo e Programação 2");
        String texto2 = "AP2";
        String nome1= "João";
        String nome2 = "Maria";
        
        System.out.println(texto1.charAt(5));
        System.out.println(texto1.codePointAt(5));
        System.out.println(texto1.contains("algo"));
        
        System.out.println(nome2.compareTo(nome1));
        
        if(nome1.compareTo(nome2) == 0){
            System.out.println("Nome 1 = Nome 2");
        }else{
            System.out.println("Nome 1 != Nome 2");
        }
        System.out.println(nome1.compareTo(nome2) == 0 ? "Nome 1 = Nome 2":"Nome 1 != Nome 2");
        
        System.out.println(texto1.startsWith("go",2));
        
        char[] vetor = texto1.toCharArray();
        
        for(char c: vetor){
            System.out.println("Char: "+c);
        }
        
        String nome3 = " Paulo César Ferreira Melo ";
                        
        String[] vetor2 = nome3.split(" ");;
        
        for(String s: vetor2)
            System.out.println("String: "+s);
        System.out.println(nome3.toLowerCase());
        System.out.println(nome3.toUpperCase());
        System.out.println(nome3.trim());
        
        System.out.println(texto1.indexOf("A"));
        
        int n = 2;
        double z = 2.1;
        String x = String.valueOf(z);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista6;

/**
 *
 * @author PauloCésar
 */
public class Ex4 {
    public static void main(String[] args) {
        String[] a = {"ABC", "123", "0", ""};
        for(int i=0; i<=4; i++){
            String s = a[i];
            System.out.println("\ts: "+s);
            int n = Integer.parseInt(s);
            System.out.println("\ts: "+n);
            int m = 1234/n;
            System.out.println("\tm: "+m);
            System.out.println("Adeus.");
        }
    }
}

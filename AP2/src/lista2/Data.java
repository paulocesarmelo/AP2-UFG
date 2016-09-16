/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista2;

/**
 *
 * @author PauloCésar
 */
public class Data {
    
    int dia, mes, ano;
    
    Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    Data(){}
    
    void imprimirData(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
    
}

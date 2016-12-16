/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista10;

/**
 *
 * @author PauloCésar
 */
public class Clima {
    
    public String obterClima(double temperatura){
        if(temperatura < 20){
            return "frio";
        }else{
            return "quente";
        }
    }
    
}

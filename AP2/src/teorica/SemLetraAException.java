/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica;

/**
 *
 * @author PauloCésar
 */
public class SemLetraAException extends Exception{
    
    public SemLetraAException(String msg){
        super(msg);
    }
    
    @Override
    public String toString(){
        return "Não existe letra A em sua frase";
    }
    
}

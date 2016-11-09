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
public class ExemploExcecao {
    
    public static void imprima(String frase) throws SemLetraAException{
        
        if(!frase.contains("a") && !frase.contains("A")){
            throw new SemLetraAException("Não existe letra A");
        }else{
            System.out.println(frase);
        }
        
    }
    
}

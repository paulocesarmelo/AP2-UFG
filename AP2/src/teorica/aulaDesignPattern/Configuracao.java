/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teorica.aulaDesignPattern;

/**
 *
 * @author PauloCésar
 */
public class Configuracao {
    private String[] propriedades = new String[6];
    
    //private static Configuracao instance = new Configuracao();
    private static Configuracao instance;
    
    private Configuracao(){
        
    }
    
    public static Configuracao getInstance(){
        if(instance.equals(null)){
            instance = new Configuracao();
        }
        
        return instance;
    }
    
    /*public static Configuracao getInstance(){
        return instance;
    }*/
    
    
    public String getPropriedades(int posicao){
        return this.propriedades[posicao];
    }
}

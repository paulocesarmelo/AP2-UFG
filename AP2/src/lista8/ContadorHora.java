/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista8;

/**
 *
 * @author PauloCésar
 */
public class ContadorHora {
    
    private static int hora = 0;
    
    public static void contaHora(){
        hora++;
    }
    
    public static int getHora(){
        return hora;
    }
    
    public static void setHora(int hora){
        ContadorHora.hora = hora;
    }
    
}

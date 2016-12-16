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
public class DicaFacade {
    
    private static Dica dica = new Dica();
    private static Clima clima = new Clima();
    private static Temperatura temperatura = new Temperatura();
    
    public static String obterDica(double temp){
        double celsius = temperatura.converte(temp);
        String clima2 = clima.obterClima(celsius);
        return dica.dica(clima2);
    }
    
}

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
public class Horista extends Empregado{

    private double precoHora, horasTrabalhadas;
    
    @Override
    public double vencimento() {
        return precoHora*horasTrabalhadas;
    }
    
}

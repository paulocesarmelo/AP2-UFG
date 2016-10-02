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
public class Quadrilatero extends FormaGeometrica {

    private double lado1, lado2;
    
    @Override
    public void area() {
        setArea(lado1 * lado2);
    }

    @Override
    public void perimetro() {
        setPerimetro((lado1+lado2)*2);
    }
    
}

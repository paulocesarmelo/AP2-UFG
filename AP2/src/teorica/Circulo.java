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
public class Circulo extends FormaGeometrica {

    private static double raio;
    
    @Override
    public void area() {
        setArea(3.14 * (raio*raio));
    }

    @Override
    public void perimetro() {
        setPerimetro(2*3.14*raio);
    }
    
    public void setRaio(double raio){
        Circulo.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
}

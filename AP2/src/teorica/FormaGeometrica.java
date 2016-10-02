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
public abstract class FormaGeometrica {
    
    private String cor;
    private double area, perimetro;

    public FormaGeometrica(){
        System.out.println("Construtor FG");
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public String getCor(){
        return cor;
    }
    
    public abstract void area();
    public abstract void perimetro();
}

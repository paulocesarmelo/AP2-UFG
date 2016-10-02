/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author PauloCésar
 */
public abstract class Conta {

    //Atributos
    protected String x;
    
    private int num, tipo;
    private String nome;
    private double saldo;

    public Conta(){}
    
    //construtor personalizado
    public Conta(int num, int tipoParam, String nomeParam) {
        nome = nomeParam;
        this.num = num;
        tipo = tipoParam;
    }
    

    //Construtor personalizado com um parâmetro
    public Conta(int num) {
        this.num = num;
        tipo = 3;
    }
    
    public void setNum(int num){
        
        if(num <= 0 ){
            System.out.println("Numero inválido");
        }else{
            this.num = num;
        }
    }
    
    public int getNum(){
        return this.num;
    }
    
    protected void metodo1(){
        int num2 = getNum();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Método sacar
    public void sacar(int valor) {
        
        if(valor < saldo){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    //Método depositar
    public void depositar(int valor) {
        saldo = saldo + valor;
    }

    //método imprimir o dono da conta
    public void imprimirDono() {
        System.out.println("Dono: " + nome);
    }

    //método obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    //método obter o tipo da conta
    public int getTipo() {
        return tipo;
    }
    
    public void imprimirConta(){
        System.out.println("Saldo: "+saldo);
    }
    
    public void transferir(Conta destino, int valor){
        
        sacar(valor);
        destino.depositar(valor);
    }
}

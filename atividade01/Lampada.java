package atividade01;
public class Lampada {
    public String cor;
    public String marca;
    public int potencia;
    public int volt;
    
    public void Ligar(){
    System.out.println("Lâmpada ligada!");
    }
    public void Desligar(){
    System.out.println("Lâmpada desligada!");
    } 
    public void Queimar(){
    System.out.println("Lâmpada queimada!");
    } 
    public void impDados(){
    System.out.println("Sua cor é: "+this.cor);
    System.out.println("Sua marca é: "+this.marca);
    System.out.println("Sua potencia é: "+this.potencia+"w"); 
    System.out.println("Sua voltagem é: "+this.volt+"v");
    }
}

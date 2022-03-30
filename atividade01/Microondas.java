package atividade01;
public class Microondas {
    public String cor;
    public String marca;
    public int preço;
    public int volt;
    
    public void Ligar(){
    System.out.println("Microondas ligado!");
    }
    public void Desligar(){
    System.out.println("Microondas desligado!");
    } 
    public void Esquentar(){
    System.out.println("Microondas esquentando!");
    } 
    public void impDados7(){
    System.out.println("Sua cor é: "+this.cor);
    System.out.println("Sua marca é: "+this.marca);
    System.out.println("Sua potencia é: "+this.preço+"R$"); 
    System.out.println("Sua voltagem é: "+this.volt+"v");
    }
}
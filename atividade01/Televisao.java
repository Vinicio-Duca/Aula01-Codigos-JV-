package atividade01;
public class Televisao {
    public String modelo;
    public String marca;
    public int preço;
    public int polegadas;
    
    public void Ligar(){
    System.out.println("Televisão ligada!");
    }
    public void Desligar(){
    System.out.println("Televisão desligada!");
    } 
    public void PassarCanal(){
    System.out.println("Televisão passando canal!");
    } 
    public void impDados2(){
    System.out.println("Seu modelo é: "+this.modelo);
    System.out.println("Sua marca é: "+this.marca);
    System.out.println("Seu preço é: "+this.preço+"R$"); 
    System.out.println("Ela possui : "+this.polegadas+" Polegadas");
    }
}
package atividade01;
public class Datashow {
    public int preço;
    public String marca;
    public String entrada;
    public String resoluçao;
    
    public void Ligar(){
    System.out.println("DataShow ligado!");
    }
    public void Desligar(){
    System.out.println("DataShow desligado!");
    } 
    public void Trasmitir(){
    System.out.println("DataShow transmitindo!");
    } 
    public void impDados6(){
    System.out.println("Sua resolução maxima é: "+this.resoluçao);
    System.out.println("Sua marca é: "+this.marca);
    System.out.println("Seu preço é: "+this.preço+"R$"); 
    System.out.println("Sua entrada é: "+this.entrada);
    }
}
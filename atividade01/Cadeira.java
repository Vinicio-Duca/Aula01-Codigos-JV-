package atividade01;
public class Cadeira {
    public String cor;
    public String marca;
    public int pesomax;
    public int preço;
    
    public void Abrir(){
    System.out.println("Cadeira aberta!");
    }
    public void Fechar(){
    System.out.println("Cadeira fechada!");
    } 
    public void Desmontar(){
    System.out.println("Cadeira Desmontada!");
    } 
    public void impDados4(){
    System.out.println("Sua cor é: "+this.cor);
    System.out.println("Sua marca é: "+this.marca);
    System.out.println("Seu preço é: "+this.preço+"R$"); 
    System.out.println("Peso máximo suportado é: "+this.pesomax+"KG");
    }
}
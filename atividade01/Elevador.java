package atividade01;
public class Elevador {
    public String marca;
    public int capacidade;
    public int pesomax;
    public int andares;
    
    public void Subir(){
    System.out.println("Elevador subindo!");
    }
    public void Descer(){
    System.out.println("Elevador descendo!");
    } 
    public void Parar(){
    System.out.println("Elevador parado!");
    } 
    public void impDados3(){
    System.out.println("Sua capacidade é: "+this.capacidade+" Pessoas");
    System.out.println("Sua marca é: "+this.marca);
    System.out.println("A quantidade de andares é: "+this.andares); 
    System.out.println("Peso máximo suportado é: "+this.pesomax+"KG");
    }
}
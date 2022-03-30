package atividade01;
public class Aluno {
    public String nome;
    public int idade;
    public String rg;
    public String cpf;
    
    public void FazerAtvs(){
    System.out.println("Fazendo atividades!");
    }
    public void IrCasa(){
    System.out.println("Indo para casa!");
    } 
    public void Estudar(){
    System.out.println("Estudando!");
    } 
    public void impDados5(){
    System.out.println("Seu nome é "+this.nome);
    System.out.println("Sua idade é: "+this.idade);
    System.out.println("Seu RG é: "+this.rg); 
    System.out.println("Seu CPF é: "+this.cpf);
    }
}
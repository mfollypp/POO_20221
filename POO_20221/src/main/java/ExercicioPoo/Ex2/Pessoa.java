package ExercicioPoo.Ex2;

public class Pessoa {
    private String nome;
    private int idade;
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    
    void aniversario(){
        System.out.println(this.nome + " fez aniversário!!");
        this.idade++;
    }
    
    void printPessoa(){
        System.out.println(this.nome + " tem " + this.idade + " anos");
    }
}
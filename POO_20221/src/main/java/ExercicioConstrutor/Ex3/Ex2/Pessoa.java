package ExercicioConstrutor.Ex3.Ex2;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    void aniversario(){
        this.idade++;
    }
    
    String getNome(){
        return this.nome;
    }
    
    int getIdade(){
        return this.idade;
    }
}
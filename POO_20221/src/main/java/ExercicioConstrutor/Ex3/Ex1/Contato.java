package ExercicioConstrutor.Ex3.Ex1;

public class Contato {
    private String nome;
    private String numero;
    
    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    public Contato(){
        
    }
    
    String getNome(){
        return this.nome;
    }
    
    String getNumero(){
        return this.numero;
    }
}

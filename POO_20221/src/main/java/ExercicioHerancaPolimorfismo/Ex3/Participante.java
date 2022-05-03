package ExercicioHerancaPolimorfismo.Ex3;

public class Participante {
    private int numMatricula;
    private String nome;
    private String email;
    
    public Participante(int numMatricula, String nome, String email){
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.email = email;
    }
    
    int getNumMatricula(){
        return this.numMatricula;
    }
    
    String getNome(){
        return this.nome;
    }
    
    String getEmail(){
        return this.email;
    }
    
    void getInfo(){
        System.out.println("Matricula: " + this.numMatricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}
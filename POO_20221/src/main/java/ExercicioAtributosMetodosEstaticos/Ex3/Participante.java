package ExercicioAtributosMetodosEstaticos.Ex3;

public class Participante {
    private int numMatricula;
    private String nome;
    private String email;
    private String tipoParticipante; //"aluno" ou "professor"
    
    public Participante(int numMatricula, String nome, String email, String tipoParticipante){
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.email = email;
        this.tipoParticipante = tipoParticipante;
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
    
    String getTipoParticipante(){
        return this.tipoParticipante;
    }
}
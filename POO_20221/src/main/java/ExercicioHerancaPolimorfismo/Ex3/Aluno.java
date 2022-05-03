package ExercicioHerancaPolimorfismo.Ex3;

public class Aluno extends Participante {
    private String curso;
    
    //Chama primeiro o Construtor de Participante (superclass) depois chama o Construtor de Aluno (subclass)
    public Aluno(int numMatricula, String nome, String email, String curso){
        super(numMatricula, nome, email); //Passa os parametros pro construtor do Participante (superclass)
        this.curso = curso;
    }
    
    String getCurso(){
        return this.curso;
    }
    
    @Override
    void getInfo(){
        System.out.println("Matricula: " + this.getNumMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Curso: " + this.curso);
    }
}
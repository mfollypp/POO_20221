package ExercicioHerancaPolimorfismo.Ex3v2;

public class Professor extends Participante {
    private String departamento;
    
    public Professor(int numMatricula, String nome, String email, String departamento){
        super(numMatricula, nome, email);
        this.departamento = departamento;
    }
    
    String getDepartamento(){
        return this.departamento;
    }
    
    @Override
    void getInfo(){
        System.out.println("Matricula: " + this.getNumMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Departamento: " + this.departamento);
    }
}
package ExercicioHerancaPolimorfismo.Ex3;

public class Funcionario extends Participante {
    private String cargo;
    
    public Funcionario(int numMatricula, String nome, String email, String cargo){
        super(numMatricula, nome, email);
        this.cargo = cargo;
    }
    
    String getCargo(){
        return this.cargo;
    }
    
    @Override
    void getInfo(){
        System.out.println("Matricula: " + this.getNumMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Cargo: " + this.cargo);
    }
}
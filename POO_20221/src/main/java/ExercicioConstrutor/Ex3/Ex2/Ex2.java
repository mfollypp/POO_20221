package ExercicioConstrutor.Ex3.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Pessoa matheus = new Pessoa("Matheus", 24);

        System.out.println(matheus.getNome() + " tem " + matheus.getIdade() + " anos");
        
        matheus.aniversario();
        System.out.println(matheus.getNome() + " tem " + matheus.getIdade() + " anos");
        
        matheus.aniversario();
        System.out.println(matheus.getNome() + " tem " + matheus.getIdade() + " anos");
    }
}
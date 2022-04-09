package ExercicioPoo.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Matheus");
        pessoa.setIdade(24);
        pessoa.printPessoa();
        
        pessoa.aniversario();
        pessoa.printPessoa();
        
        pessoa.aniversario();
        pessoa.printPessoa();
    }
}
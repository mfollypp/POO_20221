package ExercicioPoo.Ex1;
import java.util.Scanner;

public class Contato {
    private String nome;
    private String numero;
    
    Scanner input = new Scanner(System.in);
    
    void setNome(){
        System.out.println("Digite o nome:");
        this.nome = input.nextLine();
        System.out.println("Nome cadastrado com sucesso!");
    }
    
    void setNumero(){
        System.out.println("Digite o numero do " +this.nome+ ":");
        this.numero = input.nextLine();
        System.out.println("Numero casdastrado com sucesso!");
    }
    
    void getContato(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Numero: " +this.numero);
    }
}
package ExercicioPoo.Ex1;
import java.util.Scanner;

public class Agenda {
    private int i = 0;
    Contato agenda[] = new Contato[100];
    Scanner input = new Scanner(System.in);
    
    void addContato(){
        if(i < 100){
            Contato cont = new Contato();
            System.out.println("Digite o nome:");
            cont.nome = input.nextLine();
            System.out.println("Digite o numero de " +cont.nome+ ":");
            cont.numero = input.nextLine();
            agenda[i] = new Contato();
            agenda[i].nome = cont.nome;
            agenda[i].numero = cont.numero;
            i++;
        }
    }
    
    void printAgenda(){
        System.out.println("Agenda:");
        for(int j = 0; j < agenda.length; j++){
            if(agenda[j] != null){
                System.out.println("-Contato " +(j+1)+ ":");
                System.out.println("-Nome: " +agenda[j].nome);
                System.out.println("-Numero: " +agenda[j].numero);
                System.out.println();
            }
        }
    }
}

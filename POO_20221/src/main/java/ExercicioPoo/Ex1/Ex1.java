package ExercicioPoo.Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        char c;
        
        System.out.println("Deseja inserir algum contato na agenda?");
        c = input.next(".").charAt(0);
        while(c == 's' || c == 'S'){
            agenda.addContato();
            System.out.println("Quer inserir outro contato? (s/n)");
            c = input.next(".").charAt(0);
        }
        agenda.printAgenda();
    }
}

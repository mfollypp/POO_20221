package ExercicioPoo.Ex8;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int x, tempo;
        Scanner input = new Scanner(System.in);
        Celular cel = new Celular();
        
        cel.printaCarga();
        
        while(cel.bateria.carga > 0){
            System.out.println("Quer enviar mensagem ou fazer ligacao? (mensagem = 1 / ligacao = 2 / sair = 0)");
            x = input.nextInt();
            if(x == 1){
                System.out.println("Quantas mensagens foram enviadas?");
                tempo = input.nextInt();
                cel.enviaMsg(tempo);
            }
            if(x == 2){
                System.out.println("Quantos segundos foram a ligacao?");
                tempo = input.nextInt();
                cel.fazLigacao(tempo);
            }
            if(x == 0){
                break;
            }
            cel.printaCarga();
        }
    }
}
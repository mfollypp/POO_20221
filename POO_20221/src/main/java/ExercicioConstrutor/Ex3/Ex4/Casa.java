package ExercicioConstrutor.Ex3.Ex4;
import java.util.Scanner;

public class Casa {
    Porta portas[] = new Porta[3];
    Scanner input = new Scanner(System.in);
    char c;
    private int qtd;
    
    void abreFechaPorta(){
        for(int i = 0; i < 3; i++){
            portas[i] = new Porta();
            System.out.println("Abrir ou fechar a porta " +(i+1)+ "? (a = abrir / f = fechar)");
            c = input.next(".").charAt(0);
            if(c == 'a' || c == 'A'){
                portas[i].abrePorta();
            }
            else{
                portas[i].fechaPorta();
            }
        }
    }
    
    void quantasPortasEstaoAbertas(){
        qtd = 0;
        for(int j = 0; j < 3; j++){
            if(portas[j].estaAberta() == true){
                qtd++;
            }
            System.out.println("Porta " +(j+1)+ ":");
            System.out.println(portas[j].estaAberta());
        }
        System.out.println(qtd + " portas estao abertas");
    }
}
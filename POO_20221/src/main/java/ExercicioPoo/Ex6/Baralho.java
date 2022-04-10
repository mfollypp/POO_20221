package ExercicioPoo.Ex6;
import java.lang.Math;

public class Baralho {
    Carta baralho[] = new Carta[52];
    private int qtd = 0;
    
    void criaBaralho(){
        Carta carta = new Carta();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 12; j++){
                baralho[qtd] = new Carta();
                baralho[qtd].naipe[0] = carta.naipe[i];
                baralho[qtd].valor[0] = carta.valor[j];
                qtd++;
            }
        }
    }
    
    void printaBaralho(){
        Carta carta = new Carta();
        for(int i = 0; i < 4; i++){
            System.out.println(carta.naipe[i]+":");
            for(int j = 0; j < 12; j++){
                System.out.println(baralho[j].valor[0]);
            }
            System.out.println();
        }
    }
}
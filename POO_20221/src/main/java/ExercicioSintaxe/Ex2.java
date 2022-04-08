package ExercicioSintaxe;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        float r, s, t, maior;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com os valores de R, S e T:");
        
        r = input.nextFloat();
        s = input.nextFloat();
        t = input.nextFloat();
        
        if(r > s){
            maior = r;
        }
        else{
            maior = s;
        }
        if(t > maior){
            maior = t;
        }
        
        System.out.println("O maior valor entre os 3 eh o: " + maior);
    }
}
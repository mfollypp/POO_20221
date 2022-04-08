package ExercicioSintaxe;
import java.util.Scanner;
        
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count, x;
        
        System.out.println("Entre com o valor de n:");
        n = input.nextInt();
        
        count = 0;
        for(int i = 0; i < n; i++){
            x = input.nextInt();
            if(x < 0){
                count++;
            }
        }
        
        System.out.println("Dos numeros digitados, " + count + " sao negativos");
    }
}
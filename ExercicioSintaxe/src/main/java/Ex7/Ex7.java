package Ex7;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n, count = 0;
        float pessima = 0, ruim = 0, boa = 0, otima = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com as notas dos funcionarios:");
        
        n = input.nextInt();
        while(n >= 0 && n <= 100){
            count++;
            if(n >= 0 && n <= 25){
                pessima++;
            }
            if(n > 25 && n <= 50){
                ruim++;
            }
            if(n > 50 && n <= 75){
                boa++;
            }
            if(n > 75 && n <= 100){
                otima++;
            }
            n = input.nextInt();
        }
        
        System.out.println("Pessima = " +(pessima/count*100)+ "%");
        System.out.println("Ruim = " +(ruim/count*100)+ "%");
        System.out.println("Boa = " +(boa/count*100)+ "%");
        System.out.println("Otima = " +(otima/count*100)+ "%");
    }
}
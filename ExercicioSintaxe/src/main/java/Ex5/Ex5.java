package Ex5;
import java.util.Scanner;

public class Ex5 {
    
    public static int fatorial(int x){
        int fatorial = 1;
        
        if(x > 0){
            for(int i = 1; i <= x; i++){
                fatorial = fatorial * i;
            }
        }
        else{
            System.out.println("Numero negativo");
            return -1;
        }
        
        return fatorial;
    }
    
    public static void main(String[] args) {
        int N, resp;
        
        System.out.println("Entre com o valor de N:");
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        
        resp = fatorial(N);
        
        System.out.println("Fatorial de " + N + " = " + resp);
    }
}
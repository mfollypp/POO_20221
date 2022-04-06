package Ex6;

public class Ex6 {
    public static void main(String[] args) {
        int ant = 0, prox = 1, fib = 0;
        
        System.out.println(0);
        System.out.println(1);
        while(fib < 100){
            fib = ant + prox;
            ant = prox;
            prox = fib;
            System.out.println(fib);
        }
    }
}
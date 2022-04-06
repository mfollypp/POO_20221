package Ex8;
import java.util.Scanner;

public class Ex8 {
    
    public static void printaMatriz(int matriz[][]) {
        for(int lin = 0; lin < matriz.length; lin++) {
            for(int col = 0; col < matriz[lin].length; col++) {
                System.out.printf("%4d", matriz[lin][col]);
            }
            System.out.println();
        }
    }
    
    public static void cuboMagico(int matriz[][]) {
        int soma = 0, checa = 0;
        for(int lin = 0; lin < matriz.length; lin++) {
            for(int col = 0; col < matriz[lin].length; col++) {
                soma += matriz[lin][col];
            }
            
        }
    }
    
    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a ordem da matriz:");
        n = input.nextInt();
        
        int matriz[][] = new int[n][n];
        System.out.println("Entre com os valores da matriz:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Entre com o A" +(i+1)+(j+1)+ ":");
                matriz[i][j] = input.nextInt();
            }
        }
        printaMatriz(matriz);
        cuboMagico(matriz);
    }
}

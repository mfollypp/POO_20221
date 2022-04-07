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
    
    public static void quadradoMagico(int matriz[][], int dp) {
        int somaLin, somaCol;
        for(int lin = 0; lin < matriz.length; lin++) {
            somaLin = 0;
            somaCol = 0;
            for(int col = 0; col < matriz[lin].length; col++) {
                somaLin += matriz[lin][col];
                somaCol += matriz[col][lin];
            }
            if(somaLin != dp || somaCol != dp){
                System.out.println("Nao e um quadrado magico"); //alguma linha ou coluna nao é igual
                return;
            }
        }
        System.out.println("E um quadrado magico");
    }
    
    public static void main(String[] args) {
        int n, dp = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a ordem da matriz:");
        n = input.nextInt();
        
        int matriz[][] = new int[n][n];
        System.out.println("Entre com os valores da matriz:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
//                System.out.println("Entre com o A" +(i+1)+(j+1)+ ":");
                matriz[i][j] = input.nextInt();
                if(i == j){
                    dp += matriz[i][j]; //ja calcula a diagonal principal na insercao
                }
            }
        }
        
        printaMatriz(matriz);
        quadradoMagico(matriz, dp);
    }
}

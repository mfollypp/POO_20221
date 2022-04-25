package ExercicioJavaAPI.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaDeCompras listaCompras = new ListaDeCompras();
        String produto;
        
        System.out.println("Para encerrar a lista digite 'sair':");
        do{
            produto = input.nextLine();
            if(!produto.equals("sair")){
                listaCompras.addLista(produto);
            }
        }while(!produto.equals("sair"));
        
        listaCompras.imprimirListaDeCompras();
    }
}
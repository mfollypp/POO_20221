package ExercicioPoo.Ex7;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int tipoPag;
        double totalConta;
        Scanner input = new Scanner(System.in);
        
        Produto arroz = new Produto("Arroz", 7.0, 10);
        Produto feijao = new Produto("Feijao", 8.0, 9);
        Produto macarrao = new Produto("Macarrao", 6.5, 8);
        Produto iceTea = new Produto("Ice Tea", 5.5, 6);
        
        Pedido carrinho = new Pedido();
        Pagamento pag = new Pagamento();
        
        carrinho.addItem(arroz, 4);
        carrinho.addItem(feijao, 4);
        carrinho.addItem(macarrao, 7);
        carrinho.addItem(iceTea, 3);
        totalConta = carrinho.printaPedido();
        System.out.println("Qual o metodo de pagamento? (1 = Cartao / 2 = Dinheiro / 3 = Cheque)");
        tipoPag = input.nextInt();
        if(tipoPag == 1){
            pag.pagCartao();
        }
        if(tipoPag == 2){
            pag.pagDinheiro(totalConta);
        }
        if(tipoPag == 3){
            pag.pagCheque();
        }
        
        Pedido carrinho2 = new Pedido();
        Pagamento pag2 = new Pagamento();
        
        carrinho2.addItem(arroz, 5);
        carrinho2.addItem(feijao, 6);
        carrinho2.addItem(macarrao, 1);
        carrinho2.addItem(iceTea, 4);
        totalConta = carrinho2.printaPedido();
        System.out.println("Qual o metodo de pagamento? (1 = Cartao / 2 = Dinheiro / 3 = Cheque)");
        tipoPag = input.nextInt();
        if(tipoPag == 1){
            pag2.pagCartao();
        }
        if(tipoPag == 2){
            pag2.pagDinheiro(totalConta);
        }
        if(tipoPag == 3){
            pag2.pagCheque();
        }
        
    }
}
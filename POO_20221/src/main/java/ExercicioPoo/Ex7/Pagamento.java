package ExercicioPoo.Ex7;
import java.util.Scanner;

public class Pagamento {
    Cartao cartao = new Cartao();
    Dinheiro dinheiro = new Dinheiro();
    Cheque cheque = new Cheque();
    Scanner input = new Scanner(System.in);
    
    void pagCheque(){
        System.out.println("Informe o nome e valor do cheque:");
        cheque.nome = input.nextLine();
        cheque.valor = input.nextDouble();
        System.out.println("Cheque em nome de " +cheque.nome+ " no valor de R%" +cheque.valor+ "foi pago!");
        System.out.println();
    }
    
    void pagCartao(){
        int senhaIn;
        System.out.println("Digite a senha do cartao:");
        senhaIn = input.nextInt();
        while(senhaIn != cartao.senha){
            System.out.println("Senha errada, tente novamente!");
            senhaIn = input.nextInt();
        }
        System.out.println("Pago com cartao!");
        System.out.println();
    }
    
    void pagDinheiro(double total){
        System.out.println("Troco para quanto?");
        dinheiro.quantia = input.nextFloat();
        while(dinheiro.quantia < total){
            System.out.println("Quantia menor que o total da conta, entregue o valor correto");
            dinheiro.quantia = input.nextFloat();
        }
        System.out.println("Pago com dinheiro!");
        System.out.println("Troco de R$" +(dinheiro.quantia -  total)+ " entregue!");
        System.out.println();
    }
}
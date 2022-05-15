package ExercicioClassesAbstratasInterfaces.Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroRecebimento implements Recebivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Recebivel> registros = new ArrayList<Recebivel>();
        String tipoRecebimento = "";
        String descricao;
        int horas;
        double preco;
        String produto;
        int quantidade;
        double precoUnitario;
        double totalReceita = 0;
        
        System.out.println("Entre com o tipo de recebimento:");
        while(!tipoRecebimento.toLowerCase().equals("sair")){
            tipoRecebimento = input.nextLine();
            if(tipoRecebimento.toLowerCase().equals("item venda")){
                System.out.println("Nome do produto:");
                produto = input.nextLine();
                System.out.println("Quantidade do produto:");
                quantidade = input.nextInt();
                System.out.println("Preco do produto:");
                precoUnitario = input.nextDouble();
                ItemVenda item = new ItemVenda(produto, quantidade, precoUnitario);
                registros.add(item);
            }
            if(tipoRecebimento.toLowerCase().equals("servico")){
                System.out.println("Descricao do servico:");
                descricao = input.nextLine();
                System.out.println("Quantidade de horas do servico:");
                horas = input.nextInt();
                System.out.println("Preco da hora:");
                preco = input.nextDouble();
                Servico serv = new Servico(descricao, horas, preco);
                registros.add(serv);
            }
            System.out.println("Entre com o tipo de recebimento:");
        }
        
        for(Recebivel reg : registros){
            reg.printaReg();
            totalReceita += reg.totalizarReceita();
        }
        
        System.out.println("Total Receita: " + totalReceita);
    }
    
    public static void printaRegistros(ArrayList<Recebivel> registros){
        for(Recebivel reg : registros){
            reg.printaReg();
        }
    }
    
    @Override
    public double totalizarReceita(){
        return 0;
    }
    
    @Override
    public void printaReg(){
        
    }
}
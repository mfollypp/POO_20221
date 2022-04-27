package ExercicioJavaAPI.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String checa;
        double total;
        Fatura fatura = new Fatura("11/03/2022", "Matheus Folly", 1680.0);
        ProcessadorDeBoletos pdb = new ProcessadorDeBoletos();
        
        pdb.addBoleto("15/04/2022", 123654789, 700.0);
        pdb.addBoleto("16/04/2022", 412789456, 400.0);
        pdb.addBoleto("17/04/2022", 178123567, 650.5);
        
        total = pdb.processaBoletos(fatura);
        
        System.out.println("Fatura de R$" + fatura.getValorTotal());
        for(Pagamento pag : pdb.getPagamentos()){
            System.out.println("Boleto de R$" + pag.getValorPago());
        }
        System.out.println("Valor total dos boletos R$" + total);
        if(!fatura.getEstaPaga()){
            System.out.println("Fatura NAO esta paga");
            System.out.println("Faltam R$" + (fatura.getValorTotal() - total));
        }
        else{
            System.out.println("Fatura marcada como paga");
        }
    }
}
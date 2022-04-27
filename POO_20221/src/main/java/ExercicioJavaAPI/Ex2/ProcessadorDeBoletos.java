package ExercicioJavaAPI.Ex2;

import java.util.ArrayList;

public class ProcessadorDeBoletos {
    private ArrayList<Boleto> boletos = new ArrayList<Boleto>();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private double somaValor;
    
    void addBoleto(String data, Integer codBoleto, double valorPago){
        Boleto boleto = new Boleto(data, codBoleto, valorPago);
        this.boletos.add(boleto);
    }
    
    double processaBoletos(Fatura fatura){
        somaValor = 0.0;
        for(Boleto bol : boletos){
            somaValor += bol.getValor();
            Pagamento pag = new Pagamento(bol.getValor(), bol.getData());
            this.pagamentos.add(pag);
        }
        if(somaValor >= fatura.getValorTotal()){
            fatura.setEstaPaga();
        }
        return somaValor;
    }
    
    ArrayList<Pagamento> getPagamentos(){
        return this.pagamentos;
    }
}
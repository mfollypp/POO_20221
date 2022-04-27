package ExercicioJavaAPI.Ex2;

public class Pagamento {
    private double valorPago;
    private String data;
    private String tipoPag;

    public Pagamento(double valorPago, String data){
        this.valorPago = valorPago;
        this.data = data;
        this.tipoPag = "BOLETO";
    }
    
    double getValorPago(){
        return this.valorPago;
    }
    
    String getData(){
        return this.data;
    }
    
    String getTipoPag(){
        return this.tipoPag;
    }
}
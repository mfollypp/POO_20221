package ExercicioJavaAPI.Ex2;

public class Fatura {
    private String data;
    private String nomeCliente;
    private double valorTotal;
    private boolean paga;
    
    public Fatura(String data, String nomeCliente, double valorTotal){
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.paga = false;
    }
    
    String getData(){
        return this.data;
    }
    
    String nomeCliente(){
        return this.nomeCliente;
    }
    
    double getValorTotal(){
        return this.valorTotal;
    }
    
    boolean getEstaPaga(){
        return this.paga;
    }
    
    void setEstaPaga(){
        this.paga = true;
    }
}
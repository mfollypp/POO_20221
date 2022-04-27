package ExercicioJavaAPI.Ex2;

public class Boleto {
    private String data;
    private int codBoleto;
    private double valor;
    
    public Boleto(String data, int codBoleto, double valor){
        this.data = data;
        this.codBoleto = codBoleto;
        this.valor = valor;
    }
    
    String getData(){
        return this.data;
    }
    
    int getCodBoleto(){
        return this.codBoleto;
    }
    
    double getValor(){
        return this.valor;
    }
}
package ExercicioConstrutor.Ex1;

//Sistema de uma revendedora de carros
public class Carro2 {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private String cor;
    private String tipoCombustivel;
    
    //para criar o carro com os atributos dele de uma revendedora
    public Carro2(String marca, String modelo, int ano, String cor, String tipoCombustivel, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.preco = preco;
    }
    
    //retorna info basica do carro
    void getInfoCarro(){
        System.out.println("Info carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Combustivel: " + this.tipoCombustivel);
        System.out.println("Cor: " + this.cor);
    }
    
    //retorna preco do carro
    double getPreco(){
        return this.preco;
    }
    
    //compra o carro
    String comprar(){
        return "Carro comprado, aproveite!";
    }
}
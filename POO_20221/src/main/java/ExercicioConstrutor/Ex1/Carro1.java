package ExercicioConstrutor.Ex1;

//Sistema de uma locadora de carros
public class Carro1 {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoAluguel;
    private String cor;
    private String tipoCombustivel;
    private boolean alugado = false;
    
    //para criar o carro com os atributos dele de uma locadora
    public Carro1(String marca, String modelo, int ano, String placa, String cor, String tipoCombustivel, double precoAluguel){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.precoAluguel = precoAluguel;
    }
    
    //checar se esta disponivel na locadora ou se ja foi alugado
    boolean getDisponibilidade(){
        if(this.alugado == false){
            return true;
        }
        return false;
    }
    
    //retorna info basica do carro
    void getInfoCarro(){
        System.out.println("Info carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Combustivel: " + this.tipoCombustivel);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
    }
    
    //retorn preco do aluguel
    double getPrecoAluguel(){
        return this.precoAluguel;
    }
    
    //alugar o carro
    String alugar(){
        if(this.getDisponibilidade() == true){
            this.alugado = true; //foi alugado
            return "Preco do aluguel = R$" + this.getPrecoAluguel();
        }
        else{
            return "O carro ja esta alugado, favor checar outro";
        }
    }
}
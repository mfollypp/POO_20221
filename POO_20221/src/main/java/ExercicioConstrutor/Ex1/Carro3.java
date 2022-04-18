package ExercicioConstrutor.Ex1;

//Sistema de uma oficina mecânica
public class Carro3 {
    private String marca;
    private String modelo;
    private int ano;
    private String tipoCombustivel;
    private double peso;
    private boolean pecaOriginal = true;
    private String problema;
    
    //para criar o carro com os atributos dele de uma oficina
    public Carro3(String marca, String modelo, int ano, String tipoCombustivel, double peso, String problema){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.peso = peso;
        this.problema = problema;
    }
    
    //retorna info basica do carro
    void getInfoCarro(){
        System.out.println("Info carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Combustivel: " + this.tipoCombustivel);
        System.out.println("Peso: " + this.peso);
        System.out.println("Pecas Originais: " + this.pecaOriginal);
        System.out.println("Problema: " + this.problema);
    }
    
    //repara o carro
    String reparaCarro(){
        return this.problema + " esta consertado(a)!";
    }
}
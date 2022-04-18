package ExercicioConstrutor.Ex1;

//Sistema do DETRAN
public class Carro4 {
    private String marca;
    private String modelo;
    private int ano;
    private String proprietario;
    private String cnh;
    private boolean docDia;
    
    //para criar o carro com os atributos dele do DETRAN (construtor)
    public Carro4(String marca, String modelo, int ano, String proprietario, String cnh, boolean docDia){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
        this.cnh = cnh;
        this.docDia = docDia;
    }
    
    //printa info basica do carro e do proprietario
    void getInfoCarro(){
        System.out.println("Info DETRAN:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Proprietario: " + this.proprietario);
        System.out.println("CNH: " + this.cnh);
    }
    
    String getDoc(){
        if(this.docDia == false){
            return "Documentacao nao esta em dia, multado!";
        }
        return "Documentacao em dia, tudo ok!";
    }
}
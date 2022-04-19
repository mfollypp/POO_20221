package ExercicioConstrutor.Ex3.Ex3;

public class Porta {
    private boolean aberta;
    private String cor;
    private int altura;
    private int largura;
    
    public Porta(String cor, int altura, int largura){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.aberta = false;
    }
    
    void setCor(String cor){ //pintaPorta
        this.cor = cor;
    }
    
    String getCor(){
        return this.cor;
    }
    
    void setAltura(int altura){
        this.altura = altura;
    }
    
    int getAltura(){
        return this.altura;
    }
    
    void setLargura(int largura){
        this.largura = largura;
    }
    
    int getLargura(){
        return this.largura;
    }
    
    void abrePorta(){
        this.aberta = true;
    }
    
    void fechaPorta(){
        this.aberta = false;
    }
    
    boolean estaAberta(){
        return this.aberta;
    }
}
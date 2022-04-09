package ExercicioPoo.Ex3;

public class Porta {
    boolean aberta;
    String cor;
    int altura;
    int largura;
    
    void pintaPorta(String cor){
        this.cor = cor;
        System.out.println("A porta agora esta da cor " +this.cor);
    }
    
    void mudaDimensao(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
        System.out.println("A porta agora tem altura = " +this.altura+ "cm e largura = " +this.largura+ "cm");
    }
    
    void abrePorta(){
        this.aberta = true;
        System.out.println("Abriu a porta");
    }
    
    void fechaPorta(){
        this.aberta = false;
        System.out.println("Fechou a porta");
    }
    
    void estaAberta(){
        if(this.aberta == true){
            System.out.println("A porta esta aberta");
        }
        else{
            System.out.println("A porta esta fechada");
        }
    }
}
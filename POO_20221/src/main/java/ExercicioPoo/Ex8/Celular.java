package ExercicioPoo.Ex8;

public class Celular {
    Bateria bateria = new Bateria();
    
    public Celular(){
        this.bateria.carga = bateria.capacidade;
    }
    
    void enviaMsg(int tempo){
        this.bateria.carga -= tempo; //gasta 1 unidade de bateria por msg
    }
    
    void fazLigacao(int tempo){
        this.bateria.carga -= (tempo/5); //gasta 1 unidade de bateria a cada 5s
    }
    
    void printaCarga(){
        if(this.bateria.carga >= 0){
            System.out.println("Carga esta em " +(this.bateria.carga*100/this.bateria.capacidade)+ "%");
        }
        else{
            System.out.println("Carga esta em 0%");
        }
    }
}
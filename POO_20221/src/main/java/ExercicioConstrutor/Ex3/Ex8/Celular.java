package ExercicioConstrutor.Ex3.Ex8;

public class Celular {
    Bateria bateria = new Bateria();
    
    public Celular(int capacidade){
        this.bateria.setCapacidade(capacidade);
        this.bateria.setCarga(capacidade);
    }
    
    void enviaMsg(int tempo){
        this.bateria.setCarga(this.bateria.getCarga() - tempo); //gasta 1 unidade de bateria por msg
    }
    
    void fazLigacao(int tempo){
        this.bateria.setCarga(this.bateria.getCarga() - (tempo/5)); //gasta 1 unidade de bateria a cada 5s
    }
    
    int getCarga(){
        if(this.bateria.getCarga() >= 0){
            return this.bateria.getCarga();
        }
        else{
            return 0;
        }
    }
}
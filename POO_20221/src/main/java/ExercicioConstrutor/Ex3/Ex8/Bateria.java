package ExercicioConstrutor.Ex3.Ex8;

public class Bateria {
    private int capacidade;
    private int carga;
    
    public Bateria(int capacidade, int carga){
        this.capacidade = capacidade;
        this.carga = carga;
    }
    
    public Bateria(){
        
    }
    
    void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
    void setCarga(int carga){
        this.carga = carga;
    }
    
    int getCarga(){
        return this.carga;
    }
    
    int getCapacidade(){
        return this.capacidade;
    }
}
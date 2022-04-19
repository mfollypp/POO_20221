package ExercicioConstrutor.Ex3.Ex5;

public class Televisao {
    private boolean ligada;
    private int volume = 5;
    private int canal;
    private boolean silencioso;
    
    void setLigaDesliga(){
        this.ligada = !this.ligada;
    }
    
    boolean getLigada(){
        return this.ligada;
    }
    
    void setCanal(int canal){
        this.canal = canal;
    }
    
    int getCanal(){
        return this.canal;
    }
    
    void silenciaTV(){
        this.silencioso = !this.silencioso;
    }
    
    void aumentaVolume(){
        if(this.volume <= 10){
            this.volume = this.volume + 1;
        }
    }
    
    void diminuiVolume(){
        if(this.volume > 0){
            this.volume = this.volume - 1;
        }
    }
    
    void estadoTV(){
        if(this.ligada == true){
            System.out.println("A TV esta ligada");
        }
        else{
            System.out.println("A TV esta desligada");
        }
        System.out.println("Volume da TV: " +this.volume);
        System.out.println("Canal da TV: " +this.canal);
        if(this.silencioso == true){
            System.out.println("A TV esta silenciada");
        }
        else{
            System.out.println("A TV nao esta silenciada");
        }
        System.out.println();
    }
}
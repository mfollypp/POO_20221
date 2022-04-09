package ExercicioPoo.Ex5;
import java.util.Scanner;

public class Televisao {
    boolean ligada;
    int volume = 5;
    int canal;
    boolean silencioso;
    Scanner input = new Scanner(System.in);
    char c;
    
    void ligaDesligaTV(){
        if(this.ligada == false){
            this.ligada = true;
            return;
        }
        if(this.ligada == true){
            this.ligada = false;
            return;
        }
    }
    
    void mudaCanal(){
        System.out.println("Menu muda canal");
        System.out.println("a = anterior / e = especifico / p = proximo");
        c = input.next(".").charAt(0);
        
        if(c == 'a'){
            if(this.canal > 0){
                this.canal--;
            }
        }
        if(c == 'p'){
            if(this.canal < 100){
                this.canal++;
            }
        }
        if(c == 'e'){
            System.out.println("Entre com o numero do canal:");
            this.canal = input.nextInt();
        }
    }
    
    void silenciaTV(){
        if(this.silencioso == false){
            this.silencioso = true;
            return;
        }
        if(this.silencioso == true){
            this.silencioso = false;
            return;
        }
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
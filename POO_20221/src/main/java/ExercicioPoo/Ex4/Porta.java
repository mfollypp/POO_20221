package ExercicioPoo.Ex4;

public class Porta {
    boolean aberta;
    
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
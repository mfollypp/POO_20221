package ExercicioPoo.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.abrePorta();
        porta.estaAberta();
        
        porta.fechaPorta();
        porta.estaAberta();
        
        porta.pintaPorta("Branca");
        porta.pintaPorta("Preta");
        porta.pintaPorta("Marrom");
        
        porta.mudaDimensao(200, 70);
        porta.mudaDimensao(230, 95);
        
        porta.estaAberta();
    }
}
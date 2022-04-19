package ExercicioConstrutor.Ex3.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        Porta porta = new Porta("Branca", 240, 170);
        
        System.out.println("Cor: " + porta.getCor() + " | Altura: " + porta.getAltura() + " | Largura: " + porta.getLargura() + " | Aberta: " + porta.estaAberta());
        
        porta.abrePorta();
        System.out.println("Cor: " + porta.getCor() + " | Altura: " + porta.getAltura() + " | Largura: " + porta.getLargura() + " | Aberta: " + porta.estaAberta());
        
        porta.fechaPorta();
        System.out.println("Cor: " + porta.getCor() + " | Altura: " + porta.getAltura() + " | Largura: " + porta.getLargura() + " | Aberta: " + porta.estaAberta());
        
        porta.setCor("Preta");
        System.out.println("Cor: " + porta.getCor() + " | Altura: " + porta.getAltura() + " | Largura: " + porta.getLargura() + " | Aberta: " + porta.estaAberta());
        
        porta.setAltura(300);
        porta.setLargura(200);
        System.out.println("Cor: " + porta.getCor() + " | Altura: " + porta.getAltura() + " | Largura: " + porta.getLargura() + " | Aberta: " + porta.estaAberta());
    }
}
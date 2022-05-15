package ExercicioClassesAbstratasInterfaces.Ex5;

public class Servico implements Recebivel {
    private String descricao;
    private int horas;
    private double preco;
    
    public Servico(String descricao, int horas, double preco){
        this.descricao = descricao;
        this.horas = horas;
        this.preco = preco;
    }

    @Override
    public double totalizarReceita(){
        return horas * preco;
    }
    
    @Override
    public void printaReg(){
        System.out.println("Servico:");
        System.out.println("-Descricao servico: " + this.descricao);
        System.out.println("-Horas do servico: " + this.horas);
        System.out.println("-Preco do servico: " + this.preco);
        System.out.println("");
    }
}
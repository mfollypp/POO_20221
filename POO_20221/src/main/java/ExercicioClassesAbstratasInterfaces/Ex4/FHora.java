package ExercicioClassesAbstratasInterfaces.Ex4;

import java.util.ArrayList;

public class FHora implements Funcionario {
    private int horas;
    private int horasExtra;
    private double salarioHora = 50;
    
    public FHora(int horas, ArrayList<Funcionario> funcionarios){
        this.horas = horas;
        if(horas > 40) this.horasExtra = horas - 40;
        funcionarios.add(this);
    }
    
    @Override
    public double calculoFolhaPagamento(){
        return (this.horas * salarioHora) + (this.horasExtra * salarioHora * 1.5);
    }
    
    @Override
    public void printaPagamento(){
        double salarioPadrao = this.horas * salarioHora;
        double salarioExtra = this.horasExtra * salarioHora * 1.5;
        System.out.println("Funcionario Hora:");
        System.out.println("-Salario: R$" + this.calculoFolhaPagamento() + " (R$" + salarioPadrao + " + R$" + salarioExtra + " de hora extra)");
    }
}
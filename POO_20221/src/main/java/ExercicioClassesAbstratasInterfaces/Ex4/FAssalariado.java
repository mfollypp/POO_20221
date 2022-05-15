package ExercicioClassesAbstratasInterfaces.Ex4;

import java.util.ArrayList;

public class FAssalariado implements Funcionario {
    private double salarioFixo = 1500;
    
    public FAssalariado(ArrayList<Funcionario> funcionarios){
        funcionarios.add(this);
    }
    
    @Override
    public double calculoFolhaPagamento(){
        return salarioFixo;
    }
    
    @Override
    public void printaPagamento(){
        System.out.println("Funcionario Assalariado:");
        System.out.println("-Salario: R$" + this.calculoFolhaPagamento());
    }
}
package ExercicioClassesAbstratasInterfaces.Ex4;

import java.util.ArrayList;

public class FComissionado implements Funcionario {
    private int valorVendas;
    private double porcentagemVenda = 0.4;
    
    public FComissionado(int valorVendas, ArrayList<Funcionario> funcionarios){
        this.valorVendas = valorVendas;
        funcionarios.add(this);
    }
    
    @Override
    public double calculoFolhaPagamento(){
        return valorVendas * porcentagemVenda;
    }
    
    @Override
    public void printaPagamento(){
        System.out.println("Funcionario Comissionado:");
        System.out.println("-Salario: R$" + this.calculoFolhaPagamento());
    }
}
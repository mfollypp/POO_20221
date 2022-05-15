package ExercicioClassesAbstratasInterfaces.Ex4;

import java.util.ArrayList;

public class FAssalariadoComissionado implements Funcionario {
    private double salarioFixo = 1000;
    private int valorVendas;
    private double porcentagemVendas = 0.2;
    
    public FAssalariadoComissionado(int valorVendas, ArrayList<Funcionario> funcionarios){
        this.valorVendas = valorVendas;
        funcionarios.add(this);
    }
    
    @Override
    public double calculoFolhaPagamento(){
        return salarioFixo + (valorVendas * porcentagemVendas);
    }
    
    @Override
    public void printaPagamento(){
        System.out.println("Funcionario Assalariado Comissionado:");
        System.out.println("-Salario: R$" + this.calculoFolhaPagamento());
    }
}
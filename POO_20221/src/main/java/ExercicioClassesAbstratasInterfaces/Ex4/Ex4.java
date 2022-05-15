package ExercicioClassesAbstratasInterfaces.Ex4;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        FAssalariado func1 = new FAssalariado(funcionarios);
        FHora func2 = new FHora(45, funcionarios);
        FComissionado func3 = new FComissionado(3000, funcionarios);
        FAssalariadoComissionado func4 = new FAssalariadoComissionado(2000, funcionarios);
        
        for(Funcionario func : funcionarios){
            func.printaPagamento();
        }
    }
}
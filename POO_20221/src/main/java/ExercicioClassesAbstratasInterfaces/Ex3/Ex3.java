package ExercicioClassesAbstratasInterfaces.Ex3;

import java.util.ArrayList;

//3a) Sim pois as classes Casa e Escola extendem Construcao que implementa CarbonFootprint

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonos = new ArrayList<CarbonFootprint>();
        
        Casa casa1 = new Casa(3, 10, false, true, 4);
        Casa casa2 = new Casa(5, 15, true, true, 2);
        
        Escola escola1 = new Escola(100, 400, false, true, 1);
        Escola escola2 = new Escola(150, 400, true, true, 1);
        
        Carro carro1 = new Carro("Gasolina", 10);
        Carro carro2 = new Carro("dIesEl", 10);
        
        Bicicleta bicicleta1 = new Bicicleta(500);
        Bicicleta bicicleta2 = new Bicicleta(250);
        
        
        
        carbonos.add(casa1);
        carbonos.add(casa2);
        carbonos.add(escola1);
        carbonos.add(escola2);
        carbonos.add(carro1);
        carbonos.add(carro2);
        carbonos.add(bicicleta1);
        carbonos.add(bicicleta2);
        
        for(CarbonFootprint carbono : carbonos){
            carbono.printaCarbono();
        }
    }
}
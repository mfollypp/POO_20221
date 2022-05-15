package ExercicioClasseAbstrateInterface.Ex2;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonos = new ArrayList<CarbonFootprint>();
        
        Construcao construcao1 = new Construcao(100, 400, false, true);
        Construcao construcao2 = new Construcao(100, 400, true, true);
        
        Carro carro1 = new Carro("Gasolina", 10);
        Carro carro2 = new Carro("dIesEl", 10);
        
        Bicicleta bicicleta1 = new Bicicleta(500);
        Bicicleta bicicleta2 = new Bicicleta(250);
        
        carbonos.add(construcao1);
        carbonos.add(construcao2);
        carbonos.add(carro1);
        carbonos.add(carro2);
        carbonos.add(bicicleta1);
        carbonos.add(bicicleta2);
        
        for(CarbonFootprint carbono : carbonos){
            carbono.printaCarbono();
        }
    }
}
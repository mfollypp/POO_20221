package ExercicioConstrutor.Ex1;

public class TestCarro {
    public static void main(String[] args) {
        Carro1 carro1 = new Carro1("Renault", "Sandero", 2015, "POO-2022", "preta", "Gasolina", 850.50);
        carro1.getInfoCarro();
        System.out.println(carro1.alugar());
        System.out.println(carro1.alugar());
        
        System.out.println("");
        
        Carro2 carro2 = new Carro2("Fiat", "Uno", 2016, "vermelha", "alcool", 50000.00);
        carro2.getInfoCarro();
        System.out.println("Preco: R$" + carro2.getPreco());
        System.out.println(carro2.comprar());
        
        System.out.println("");
        
        Carro3 carro3 = new Carro3("Volkswagen", "Up", 2014, "Gas", 1240, "Caixa de marcha");
        carro3.getInfoCarro();
        System.out.println(carro3.reparaCarro());
        
        System.out.println("");
        
        Carro4 carro4 = new Carro4("Chevrolet", "Onix", 2020, "Matheus", "20221", false);
        carro4.getInfoCarro();
        System.out.println(carro4.getDoc());
        
    }
}
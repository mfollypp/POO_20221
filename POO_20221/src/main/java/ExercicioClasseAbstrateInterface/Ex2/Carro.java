package ExercicioClasseAbstrateInterface.Ex2;

public class Carro implements CarbonFootprint {
    private String combustivel;
    private double cilindrada;
    
    public Carro(String combustivel, double cilindrada){
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }
    
    @Override
    public double getCarbonFootprint(){
        if(combustivel.toLowerCase().equals("gasolina")){
            return cilindrada * 10;
        }
        if(combustivel.toLowerCase().equals("diesel")){
            return cilindrada * 20;
        }
        if(combustivel.toLowerCase().equals("alcool")){
            return cilindrada * 5;
        }
        if(combustivel.toLowerCase().equals("gas natural") || combustivel.toLowerCase().equals("GNV")){
            return cilindrada * 4;
        }
        return 0;
    }
    
    @Override
    public void printaCarbono(){
        System.out.println("Combustivel: " + this.combustivel.toUpperCase());
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Carbon Footprint: " + this.getCarbonFootprint());
        System.out.println("");
    }
    
    String getCombustivel(){
        return this.combustivel;
    }
    
    double getCilindrada(){
        return this.cilindrada;
    }
}
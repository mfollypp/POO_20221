package ExercicioClassesAbstratasInterfaces.Ex2;

public class Bicicleta implements CarbonFootprint{
    private int pedaladas;
    
    public Bicicleta(int pedaladas){
        this.pedaladas = pedaladas;
    }
    
    @Override
    public double getCarbonFootprint(){
        return pedaladas * 2;
    }
    
    @Override
    public void printaCarbono(){
        System.out.println("Pedaladas: " + this.pedaladas);
        System.out.println("Carbon Footprint: " + this.getCarbonFootprint());
        System.out.println("");
    }
    
    int getPedaladas(){
        return this.pedaladas;
    }
}
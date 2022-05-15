package ExercicioClassesAbstratasInterfaces.Ex3;

public class Escola extends Construcao {
    private int numBebedouros;
    
    public Escola(int numPessoas, int numLampadas, boolean usoAC, boolean energiaRenovavel, int numBebedouros){
        super(numPessoas, numLampadas, usoAC, energiaRenovavel);
        this.numBebedouros = numBebedouros;
    }
    
    @Override
    public double getCarbonFootprint(){
        if(this.getEnergiaRenovavel() && !this.getUsoAC()){
            return (this.getNumPessoas() * this.getNumLampadas() * numBebedouros * 100) / 2;
        }
        if(this.getEnergiaRenovavel() && this.getUsoAC()){
            return (this.getNumPessoas() * this.getNumLampadas() * numBebedouros * 150) / 2;
        }
        if(!this.getEnergiaRenovavel() && this.getUsoAC()){
            return (this.getNumPessoas() * this.getNumLampadas() * numBebedouros * 150);
        }
        return (this.getNumPessoas() * this.getNumLampadas() * numBebedouros * 100);
    }
    
    @Override
    public void printaCarbono(){
        System.out.println("Escola:");
        System.out.println("-Numero de Pessoas: " + this.getNumPessoas());
        System.out.println("-Numero de Lampadas: " + this.getNumLampadas());
        System.out.println("-Numero de Bebedouros: " + this.numBebedouros);
        System.out.println("-Usa AC: " + this.getUsoAC());
        System.out.println("-Energia Renovavel: " + this.getEnergiaRenovavel());
        System.out.println("-Carbon Footprint: " + this.getCarbonFootprint());
        System.out.println("");
    }
    
    int getNumBebedouros(){
        return this.numBebedouros;
    }
}
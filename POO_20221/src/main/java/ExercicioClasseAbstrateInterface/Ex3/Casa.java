package ExercicioClasseAbstrateInterface.Ex3;

public class Casa extends Construcao {
    private int numTV;
    
    public Casa(int numPessoas, int numLampadas, boolean usoAC, boolean energiaRenovavel, int numTV){
        super(numPessoas, numLampadas, usoAC, energiaRenovavel);
        this.numTV = numTV;
    }
    
    @Override
    public double getCarbonFootprint(){
        if(this.getEnergiaRenovavel() && !this.getUsoAC()){
            return (this.getNumPessoas() * this.getNumLampadas() * numTV * 100) / 2;
        }
        if(this.getEnergiaRenovavel() && this.getUsoAC()){
            return (this.getNumPessoas() * this.getNumLampadas() * numTV * 150) / 2;
        }
        if(!this.getEnergiaRenovavel() && this.getUsoAC()){
            return (this.getNumPessoas() * this.getNumLampadas() * numTV * 150);
        }
        return (this.getNumPessoas() * this.getNumLampadas() * numTV * 100);
    }
    
    @Override
    public void printaCarbono(){
        System.out.println("Casa:");
        System.out.println("-Numero de Pessoas: " + this.getNumPessoas());
        System.out.println("-Numero de Lampadas: " + this.getNumLampadas());
        System.out.println("-Numero de TVs: " + this.numTV);
        System.out.println("-Usa AC: " + this.getUsoAC());
        System.out.println("-Energia Renovavel: " + this.getEnergiaRenovavel());
        System.out.println("-Carbon Footprint: " + this.getCarbonFootprint());
        System.out.println("");
    }
    
    int getNumTV(){
        return this.numTV;
    }
}
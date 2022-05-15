package ExercicioClassesAbstratasInterfaces.Ex3;

public class Construcao implements CarbonFootprint {
    private int numPessoas;
    private boolean energiaRenovavel;
    private int numLampadas;
    private boolean usoAC;
    
    public Construcao(int numPessoas, int numLampadas, boolean usoAC, boolean energiaRenovavel){
        this.numPessoas = numPessoas;
        this.numLampadas = numLampadas;
        this.usoAC = usoAC;
        this.energiaRenovavel = energiaRenovavel;
    }
    
    @Override
    public double getCarbonFootprint(){
        if(energiaRenovavel && !usoAC){
            return (numPessoas * numLampadas * 100) / 2;
        }
        if(energiaRenovavel && usoAC){
            return (numPessoas * numLampadas * 150) / 2;
        }
        if(!energiaRenovavel && usoAC){
            return (numPessoas * numLampadas * 150);
        }
        return (numPessoas * numLampadas * 100);
    }
    
    @Override
    public void printaCarbono(){
        System.out.println("Construcao:");
        System.out.println("-Numero de Pessoas: " + this.numPessoas);
        System.out.println("-Numero de Lampadas: " + this.numLampadas);
        System.out.println("-Usa AC: " + this.usoAC);
        System.out.println("-Energia Renovavel: " + this.energiaRenovavel);
        System.out.println("-Carbon Footprint: " + this.getCarbonFootprint());
        System.out.println("");
    }
    
    int getNumPessoas(){
        return this.numPessoas;
    }
    
    int getNumLampadas(){
        return this.numLampadas;
    }
    
    boolean getUsoAC(){
        return this.usoAC;
    }
    
    boolean getEnergiaRenovavel(){
        return this.energiaRenovavel;
    }
}
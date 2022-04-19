package ExercicioConstrutor.Ex4;

public class Data {
    private int diaInt;
    private int mesInt;
    private int anoInt;
    private String mesString;
    
    public Data(int dia, int mes, int ano){
        this.diaInt = dia;
        this.mesInt = mes;
        this.anoInt = ano;
    }
    
    public Data(String mes, int dia, int ano){
        this.mesString = mes;
        this.diaInt = dia;
        this.anoInt = ano;
    }
    
    public Data(int dia, int ano){
        this.diaInt = dia;
        this.anoInt = ano;
    }
    
    String getData1(){
        return this.diaInt + "/" + this.mesInt + "/" + this.anoInt;
    }
    
    String getData2(){
        return this.mesString + " " + this.diaInt + ", " + this.anoInt;
    }
    
    String getData3(){
        return this.diaInt + " " + this.anoInt;
    }
}
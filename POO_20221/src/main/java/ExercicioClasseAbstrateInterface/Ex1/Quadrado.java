package ExercicioClasseAbstrateInterface.Ex1;

public class Quadrado extends Retangulo {
    
    void calcularArea(double lado){
        this.setArea(Math.pow(lado, 2));
    }
    
    void calcularPerimetro(double lado){
        this.setPerimetro(4 * lado);
    }
}
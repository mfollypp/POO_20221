package ExercicioClassesGenericasAninhadasEnumeracoes.Ex3;

public class Retangulo extends FormaGeometrica {
    
    void calcularArea(double lado1, double lado2){
        this.setArea(lado1 * lado2);
    }
    
    void calcularPerimetro(double lado1, double lado2){
        this.setPerimetro(2 * lado1 + 2 * lado2);
    }
}
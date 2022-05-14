package ExercicioClassesGenericasAninhadasEnumeracoes.Ex3;

public class Circulo extends FormaGeometrica {
    
    void calcularArea(double raio){
        this.setArea(Math.PI * Math.pow(raio, 2));
    }
    
    void calcularPerimetro(double raio){
        this.setPerimetro(2 * Math.PI * raio);
    }
}
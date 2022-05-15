package ExercicioClassesAbstratasInterfaces.Ex1;

public class Triangulo extends FormaGeometrica {
    
    void calcularArea(double base, double altura){
        this.setArea((base * altura) / 2);
    }
    
    void calcularPerimetro(double base, double altura){
        this.setPerimetro(base + altura + (Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}
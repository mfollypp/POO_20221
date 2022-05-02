package ExercicioHerancaPolimorfismo.Ex1;

public class Circulo extends FiguraGeometrica {
    
    @Override
    double area(){
        return Math.PI * Math.pow(medida, 2);
    }
}
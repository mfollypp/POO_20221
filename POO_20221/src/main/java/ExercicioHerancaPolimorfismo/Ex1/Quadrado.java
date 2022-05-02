package ExercicioHerancaPolimorfismo.Ex1;

public class Quadrado extends FiguraGeometrica {
    
    @Override
    double area(){
        return Math.pow(medida, 2);
    }
}
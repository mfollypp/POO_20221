package ExercicioHerancaPolimorfismo.Ex1;

public class Triangulo extends FiguraGeometrica {
    protected double altura;
    
    @Override
    double area(){
        return (medida*altura)/2;
    }
    
    void setAltura(double alt){
        this.altura = alt;
    }
}
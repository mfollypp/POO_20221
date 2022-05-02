package ExercicioHerancaPolimorfismo.Ex1;

public class Retangulo extends FiguraGeometrica {
    protected double altura;
    
    @Override
    double area(){
        return medida*altura;
    }
    
    void setAltura(double alt){
        this.altura = alt;
    }
}
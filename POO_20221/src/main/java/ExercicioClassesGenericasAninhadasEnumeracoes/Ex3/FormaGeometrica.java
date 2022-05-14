package ExercicioClassesGenericasAninhadasEnumeracoes.Ex3;

import java.util.ArrayList;

public class FormaGeometrica <T extends Number> {
    private double area;
    private double perimetro;
    private double somaArea;
    
    double getArea(){
        return this.area;
    }
    
    double getPerimetro(){
        return this.perimetro;
    }
    
    void setArea(double area){
        this.area = area;
    }
    
    void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
    
    double calculaArea(ArrayList<FormaGeometrica> formas){
        somaArea = 0;
        for(FormaGeometrica forma : formas){
            somaArea += forma.getArea();
        }
        return somaArea;
    }
}
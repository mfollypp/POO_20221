package ExercicioClassesGenericasAninhadasEnumeracoes.Ex3;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
        FormaGeometrica forma = new FormaGeometrica();
        
        Quadrado quad = new Quadrado();
        Retangulo ret = new Retangulo();
        Circulo circ = new Circulo();
        Triangulo tri = new Triangulo();
        
        quad.calcularArea(2);
        quad.calcularPerimetro(2);
        printaForma(quad);
        formas.add(quad);
        
        ret.calcularArea(2, 4);
        ret.calcularPerimetro(2, 4);
        printaForma(ret);
        formas.add(ret);
        
        circ.calcularArea(2);
        circ.calcularPerimetro(2);
        printaForma(circ);
        formas.add(circ);
        
        tri.calcularArea(2, 4);
        tri.calcularPerimetro(2, 4);
        printaForma(tri);
        formas.add(tri);
        
        System.out.println("Total Areas = " + forma.calculaArea(formas));
    }
    public static void printaForma(FormaGeometrica forma){
        System.out.println("Area: " + forma.getArea());
        System.out.println("Perimetro: " + forma.getPerimetro());
        System.out.println("");
    }
}
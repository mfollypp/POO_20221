package ExercicioClasseAbstrateInterface.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        Retangulo ret = new Retangulo();
        Circulo circ = new Circulo();
        Triangulo tri = new Triangulo();
        
        quad.calcularArea(2);
        quad.calcularPerimetro(2);
        printaForma(quad);
        
        ret.calcularArea(2, 4);
        ret.calcularPerimetro(2, 4);
        printaForma(ret);
        
        circ.calcularArea(2);
        circ.calcularPerimetro(2);
        printaForma(circ);
        
        tri.calcularArea(2, 4);
        tri.calcularPerimetro(2, 4);
        printaForma(tri);
    }
    
    public static void printaForma(FormaGeometrica forma){
        System.out.println("Area: " + forma.getArea());
        System.out.println("Perimetro: " + forma.getPerimetro());
        System.out.println("");
    }
}
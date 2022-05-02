package ExercicioHerancaPolimorfismo.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setMedida(2);
        printaArea(quadrado.area());
        
        Retangulo retangulo = new Retangulo();
        retangulo.setMedida(2);
        retangulo.setAltura(4);
        printaArea(retangulo.area());
        
        Triangulo triangulo = new Triangulo();
        triangulo.setMedida(2);
        triangulo.setAltura(4);
        printaArea(triangulo.area());
        
        Circulo circulo = new Circulo();
        circulo.setMedida(2);
        printaArea(circulo.area());
    }
    
    public static void printaArea(double area){
        System.out.println("Area = " + area);
    }
}
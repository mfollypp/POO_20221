package ExercicioAtributosMetodosEstaticos.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea area = new ConversaoDeUnidadesDeArea();
        
        System.out.println(area.convMetroQuadrado(10, "pe Quadrado") + " pes quadrados");
        System.out.println(area.convMetroQuadrado(10, "Milha Quadrada") + " milhas quadradas");
        System.out.println(area.convMetroQuadrado(10, "Acre") + " acres");
        System.out.println("");
        
        System.out.println(area.convPeQuadrado(10, "metro Quadrado") + " metros quadrados");
        System.out.println(area.convPeQuadrado(10, "Milha quadrada") + " milhas quadradas");
        System.out.println(area.convPeQuadrado(10, "acre") + " acres");
        System.out.println("");
        
        System.out.println(area.convMilhaQuadrada(10, "metro Quadrado") + " metros quadrados");
        System.out.println(area.convMilhaQuadrada(10, "pe Quadrado") + " pes quadrados");
        System.out.println(area.convMilhaQuadrada(10, "acre") + " acres");
        System.out.println("");
        
        System.out.println(area.convAcre(10, "metro Quadrado") + " metros quadrados");
        System.out.println(area.convAcre(10, "pe Quadrado") + " pes quadrados");
        System.out.println(area.convAcre(10, "Milha quadrada") + " milhas quadradas");
        System.out.println("");
    }
}
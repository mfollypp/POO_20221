package ExercicioAtributosMetodosEstaticos.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(ConversaoDeUnidadesDeArea.convMetroQuadrado(10, "pe Quadrado") + " pes quadrados");
        System.out.println(ConversaoDeUnidadesDeArea.convMetroQuadrado(10, "Milha Quadrada") + " milhas quadradas");
        System.out.println(ConversaoDeUnidadesDeArea.convMetroQuadrado(10, "Acre") + " acres");
        System.out.println("");
        
        System.out.println(ConversaoDeUnidadesDeArea.convPeQuadrado(10, "metro Quadrado") + " metros quadrados");
        System.out.println(ConversaoDeUnidadesDeArea.convPeQuadrado(10, "Milha quadrada") + " milhas quadradas");
        System.out.println(ConversaoDeUnidadesDeArea.convPeQuadrado(10, "acre") + " acres");
        System.out.println("");
        
        System.out.println(ConversaoDeUnidadesDeArea.convMilhaQuadrada(10, "metro Quadrado") + " metros quadrados");
        System.out.println(ConversaoDeUnidadesDeArea.convMilhaQuadrada(10, "pe Quadrado") + " pes quadrados");
        System.out.println(ConversaoDeUnidadesDeArea.convMilhaQuadrada(10, "acre") + " acres");
        System.out.println("");
        
        System.out.println(ConversaoDeUnidadesDeArea.convAcre(10, "metro Quadrado") + " metros quadrados");
        System.out.println(ConversaoDeUnidadesDeArea.convAcre(10, "pe Quadrado") + " pes quadrados");
        System.out.println(ConversaoDeUnidadesDeArea.convAcre(10, "Milha quadrada") + " milhas quadradas");
        System.out.println("");
    }
}
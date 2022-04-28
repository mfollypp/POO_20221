package ExercicioAtributosMetodosEstaticos.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea area = new ConversaoDeUnidadesDeArea();
        
        System.out.println(area.convMetroQuadrado(8250, "pe quadrado") + " pes quadrados");
        System.out.println(area.convMetroQuadrado(8250, "acre") + " acres");
        System.out.println(area.convMetroQuadrado(8250, "centimetro quadrado") + " centimetros quadrados");
    }
}
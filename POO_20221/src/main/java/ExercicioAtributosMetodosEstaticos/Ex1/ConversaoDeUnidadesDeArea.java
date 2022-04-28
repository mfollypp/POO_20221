package ExercicioAtributosMetodosEstaticos.Ex1;

public class ConversaoDeUnidadesDeArea {
    private static double metroQuadrado = 10.76; //pes quadrados
    private static double peQuadrado = 979; //centimetros quadrados
    private static double milhaQuadrada = 640; //acres
    private static double acre = 43560; //pes quadrados
    private String conversao;
    private double unidade;
    
    //rever os returns para saber se esta convertendo direito
    double convMetroQuadrado(double unidade, String conversao){
        if(conversao.toLowerCase().equals("pe quadrado")){
            return (unidade * metroQuadrado);
        }
        if(conversao.toLowerCase().equals("milha quadrada")){
            return (unidade * metroQuadrado) / (acre * milhaQuadrada);
        }
        if(conversao.toLowerCase().equals("acre")){
            return (unidade * metroQuadrado) / acre;
        }
        return 0;
    }
    
    double convPeQuadrado(double unidade, String conversao){
        if(conversao.toLowerCase().equals("metro quadrado")){
            return (unidade / metroQuadrado);
        }
        if(conversao.toLowerCase().equals("milha quadrada")){
            return unidade / (acre * milhaQuadrada);
        }
        if(conversao.toLowerCase().equals("acre")){
            return unidade / acre;
        }
        return 0;
    }
    
    double convMilhaQuadrada(double unidade, String conversao){
        if(conversao.toLowerCase().equals("metro quadrado")){
            return (unidade * acre) / metroQuadrado;
        }
        if(conversao.toLowerCase().equals("pe quadrado")){
            return unidade * milhaQuadrada * acre;
        }
        if(conversao.toLowerCase().equals("acre")){
            return unidade * milhaQuadrada;
        }
        return 0;
    }
    
    double convAcre(double unidade, String conversao){
        if(conversao.toLowerCase().equals("metro quadrado")){
            return (unidade * acre) / metroQuadrado;
        }
        if(conversao.toLowerCase().equals("pe quadrado")){
            return unidade * acre;
        }
        if(conversao.toLowerCase().equals("milha quadrada")){
            return (unidade * acre) / milhaQuadrada;
        }
        return 0;
    }
}
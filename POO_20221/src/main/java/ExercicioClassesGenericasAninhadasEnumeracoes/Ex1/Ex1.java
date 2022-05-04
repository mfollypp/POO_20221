package ExercicioClassesGenericasAninhadasEnumeracoes.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        DiaDaSemana dds = new DiaDaSemana();
        
        dds.setDia(DiasDaSemana.QUA);
        printaDia(dds);
        dds.setDia(DiasDaSemana.DOM);
        printaDia(dds);
    }
    
    public static void printaDia(DiaDaSemana dds){
        if(dds.ehDiaUtil()){
            System.out.println("E dia util!");
        }
        else{
            System.out.println("Nao e dia util!");
        }
    }
}